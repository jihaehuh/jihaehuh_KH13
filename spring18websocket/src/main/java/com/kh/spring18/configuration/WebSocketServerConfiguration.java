package com.kh.spring18.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

import com.kh.spring18.websocket.BasicWebSocketServer;
import com.kh.spring18.websocket.SimpleWebSocketServer;

/**
 
웹소켓과 관련된 설정을 작성하는 파일
이미 등록해둔 웹소켓 서버들을 가져와서 추가적인 설정을 한 뒤 활성화
*/


@EnableWebSocket//웹소켓을 사용할 것임을 표시
@Configuration//설정파일임을 표시
public class WebSocketServerConfiguration implements WebSocketConfigurer{

    @Autowired
    private BasicWebSocketServer basicWebSocketServer;
    
    @Autowired
    private SimpleWebSocketServer simpleWebSocketServer;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
    	//매개 변수로 주어진 regisrtry에 웹소켓 서버를 등록
    	//- 반드시 웹페이지 처럼 주소가 부여되어야 함
    	//- (중요) 절대로 다른 주소와 겹치면 안된다
    	registry.addHandler(basicWebSocketServer, "/ws/basic")
//    	registry.addHandler(simpleWebSocketServer, "/ws/simple"); //따로 써도 되고 이어서 써도 된다 (이어서 쓰려면 ; 조심하기 )
    					.addHandler(simpleWebSocketServer, "/ws/simple");
    }
    
    
    
    

}