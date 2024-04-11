package com.kh.spring18.websocket;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SimpleWebSocketServer extends TextWebSocketHandler { //상속은 특수한 목적이 있을때 사용 
	
	/*
	 * 사용자가 웹소켓 서버에 '접속' 하면 자동 실행되는 메소드 
	 * - webSocketSession - '접속' 한 웹소켓 사용자의 정보 (HttpSession 과 다름)
	 */	
	@Override
	public void afterConnectionEstablished(WebSocketSession session) throws Exception {
		log.debug("사용자가 접속했어요");
		log.debug("session={}",session);
		
		//session 을 이용하면 사용자에게 메세지를 보낼 수 있다
		//session.sendMessage(메세지 객체);
//		TextMessage message = new TextMessage("어서오세요");
//		session.sendMessage(message);
		TextMessage message = new TextMessage(LocalDateTime.now().toString()); //시간 찍기 
		session.sendMessage(message);
		
	}
	
	/*
	 * 사용자가 웹소켓 서버에 '접속 종료' 하면 자동 실행되는 메소드 
	 * - webSocketSession - '접속 종료'한 웹소켓 사용자의 정보 (HttpSession 과 다름)   webSocketSession을 접속한 사용자라고 부름 
	 * - CloseStatus -종료를 어떻게 했는지에 대한 정보 
	 */
	@Override
		public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
		log.debug("사용자가 접속 종료했어요");
		log.debug("session={}",session);
		
		//사용자가 나간뒤에 메세지를 보낼 수 있을까?
		//-코드 못보냄 (전화 끊고 말하는 것과 같음 ) 
		
		}

		/*
		 * 	사용자가 웹소켓 서버에 메세지를 보내면 실행되는 메소드
		 * - WebSocketSession -메세지를 보낸 사용자 정보 (HTTP Session과 다름)
		 * - TextMessage -사용자가 보낸 메세지 객체 
		 */	
	@Override
		protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
		log.debug("사용자가 메세지를 보냈습니다 ");
		log.debug("message={}",message);
		log.debug("payload={}",message.getPayload());
		
		switch (message.getPayload()) {
		case "Hello":
			session.sendMessage(new TextMessage("안녕하세요"));
			break;
		case "Hi":
			session.sendMessage(new TextMessage("어 안녕!"));
			break;
		case "Goodbye":
			session.sendMessage(new TextMessage("잘가요!"));
			break;
		default: 
			session.sendMessage(new TextMessage("모르겠어요~"));
			break;
		}
	}
}
