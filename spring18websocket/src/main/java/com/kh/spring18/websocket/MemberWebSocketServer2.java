package com.kh.spring18.websocket;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
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
import com.kh.spring18.vo.room.RoomVO;
import com.kh.spring18.vo.room.UserVO;

import lombok.extern.slf4j.Slf4j;

/**
 * 회원 전용 채팅 서비스
 * - 비회원은 채팅을 보는 것만 가능함
 * - 회원은 채팅을 작성하고 보는 것 모두 가능함
 */
@Slf4j
@Service
public class MemberWebSocketServer2 extends TextWebSocketHandler {
	
	//사용자의 정보를 저장할 저장소 생성
//	private Set<UserVO> users = new CopyOnWriteArraySet<>();//동기화 됨(자물쇠 있음)
	private Map<String,RoomVO> channel = 
															Collections.synchronizedMap(new HashMap<>());
	@Autowired
	private MessageDao messageDao;
	
}