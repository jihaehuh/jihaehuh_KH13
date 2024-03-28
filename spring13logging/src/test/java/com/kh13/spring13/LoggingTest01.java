package com.kh13.spring13;


import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class LoggingTest01 {

	//로거(Logger)는 로그 메세지를 출력하기 위한 도구 
	//어떤 기술(Log4J,Logback,...)을 쓰더라도 Slf4J로 보관하여 사용
	//파일 마다 생성해야하는것이 원칙
//	Logger log =LoggerFactory.getLogger(LoggingTest01.class); - 앞으로 로그 쓰고 싶으면 롬복으로 어노테이션 찍어라 
	
	//롬복을 사용할 경우 클래스 상단에 @Slf4j라고 작성하면 자동생성 됨
	
	@Test
	public void test(){
		
		//로깅의 수준(Level)은 총 6단계가 존재
		//[TRACE]->[DEBUG]->[INFO]->[WARN]->[ERROR]->[FATAL]
		//- TRACE 는 프로그램의 모든 과정에 대한 기록
		//- DEBUG 는 개발 과정에서의 확인 메세지
		//차단
		////////////////////////////////////////////////
		//출력
		//- INFO 는 처리와 관련된 정보 메세지
		//- WARN 은 잠재적 위험요소에 대한 경고 메세지
		//- ERROR 은 기능이 중단되는 경우에 대한 메세지(예외)
		//- FATAL 은 서버가 중단되는 경우에 대한 메세지
		
//		System.out.println("Hello");
		log.debug("디버그 메세지");
		log.info("인포 메세지");
		log.warn("경고 메세지");
		log.error("오류 메세지");
	}
}
