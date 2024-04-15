package com.kh.spring18.websocket;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kh.spring18.dao.MessageDao;
import com.kh.spring18.dto.MessageDto;
import com.kh.spring18.vo.ChatRequestVO;

import lombok.extern.slf4j.Slf4j;

/**
 * 회원 전용 채팅 서비스
 * - 비회원은 채팅을 보는 것만 가능함
 * - 회원은 채팅을 작성하고 보는 것 모두 가능함
 */
@Slf4j
@Service
public class MemberWebSocketServer extends TextWebSocketHandler {
	
	//사용자의 정보를 저장할 저장소 생성
	private Set<WebSocketSession> users = new CopyOnWriteArraySet<>();//동기화 됨(자물쇠 있음)
	
	@Autowired
	private MessageDao messageDao;
	
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		/*users.add(session);
		log.debug("사용자 접속! 현재 사용자 {}명", users.size());
		
		//과연 HttpSession에 있는 loginId와 loginLevel이 연동되었을까?
		log.debug("HttpSession 정보 = {}", session.getAttributes());
		
		Map<String, Object> data = session.getAttributes();
		String memberId = (String)data.get("loginId");
		String memberLevel = (String)data.get("loginLevel");
		log.debug("아이디 = {}, 등급 = {}", memberId, memberLevel);
	}*/
	
	List<MessageDto> list = messageDao.selectList();
	ObjectMapper mapper = new ObjectMapper();
	for(MessageDto messageDto : list) {
		String json = mapper.writeValueAsString(messageDto);
		TextMessage message = new TextMessage(json);
		session.sendMessage(message);
	}
}

	
	
	
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		users.remove(session);
		log.debug("사용자 종료! 현재 사용자 {}명", users.size());
	}
	@Override
	protected void handleTextMessage(WebSocketSession session, 
															TextMessage message) throws Exception {
		//서버와 클라이언트간의 메세지 규약을 만들어보자
		//- 클라이언트 -----> 서버 : ChatRequestVO
		//- 서버 -----> 클라이언트 : ChatResponseVO
		
		//(+추가) 연동된 세션 정보를 확인해서 비회원이면 차단
		//비회원 = 연동된 세션에 loginId, loginLevel 중 하나라도 없는 경우
		Map<String, Object> data = session.getAttributes();
		String memberId = (String) data.get("loginId");
		String memberLevel = (String) data.get("loginLevel");
		//회원인지 아닌지 확인 
		boolean isMember = memberId != null && memberLevel != null;
		if(isMember == false) return;//회원이 아니면 차단
		
		//[1] 사용자가 보낸 메세지를 ChatRequestVO로 해석
		ObjectMapper mapper = new ObjectMapper();
		ChatRequestVO requestVO = 
				mapper.readValue(message.getPayload(), ChatRequestVO.class);
		
		//--여기 까지가 받은내용을 해서 
		//[+추가]  이 시점에 DB에 메세지를 등록하도록 코드 추가 
		MessageDto messageDto = messageDao.insert(
								MessageDto.builder()
								.messageSender(memberId)
								.messageSenderLevel(memberLevel)
								.messageContent(requestVO.getContent())
						.build());
		
		//--여기부터 받은 내용을 생성 시키는 부분 
		//[2] 사용자에게 보낼 메세지를 ChatResponseVO로 생성
		//-->MessageDto 로 대체하여 사용 --> 프론트엔드 수신 이름을 변경해야함 
		
		/*
		 * ChatResponseVO responseVO = ChatResponseVO.builder()
		 * .content(requestVO.getContent())//내용은 그대로 복사
		 * .time(LocalDateTime.now().toString())//시간 추가 .memberId(memberId)//작성자 정보 추가
		 * .memberLevel(memberLevel)//작성등급 정보 추가 .build();
		 */
		
		
		
		//[3] 메세지 객체 생성
		String json = mapper.writeValueAsString(messageDto);//responseVO
		TextMessage response = new TextMessage(json);
		
		//전체에게 메세지를 전송(broadcast)
		for(WebSocketSession user : users) {
			user.sendMessage(response);
		}
	}
}