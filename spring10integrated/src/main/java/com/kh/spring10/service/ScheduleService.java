package com.kh.spring10.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.kh.spring10.dao.CertDao;

//주기적으로 사용자와 무관하게 실행되는 서비스
//서버에 매우 부담을 주는 위험한 기능이어소 기본적으로 금지되어 있음
//main 메소드가 존재하는 파일 위에 @EnableScheduling 을 추가하여 허용 처리 
@Service
public class ScheduleService {
	
	@Autowired
	private CertDao certDao;
	
	//언제 실행되어야하는지 어노테이션으로 알려줄것임
	//-메소드에 자동실행되도록 @Scheduled와 옵션을 추가
//	@Scheduled( fixedRate = 1000L) //등록만 취소하면 원상태로 돌아옴 **(1시간마다는 가능하지만 정각은 불가능)
//	@Scheduled(cron="* * * * * *") //*초*분*시*일*월*요일 (연도)0 <연도는 설정 하는 경우가 많음 >
//	@Scheduled(cron="*/2 * * * * *") //*/2초마다*분*시*일*월*요일  
	//(Q)매 2분마다 실행 되게 하려면?
//	@Scheduled(cron="0 */2 * * * *")//2분마다 0초에 실행 
//	@Scheduled(cron="0-10 */2 * * * *")//2분마다 0초~10초에 실행 
//	@Scheduled(cron="0,10 */2 * * * *")//2분마다 0초와 10초에 실행 
	
	//(Q) 출근 시간(9시)에 한번 ,퇴근시간(18시)에 한번 실행
//	@Scheduled(cron="0 0 9,18 * * * ") //매일 오전9시에 한번 오후 6시 한번
	
	//(Q)업무시간(9 to 18 )동안 정각마다 실행
//	@Scheduled(cron="0 0 9-18 * * *") //9시부터 6시 사이 정각 마다 한번

	//(Q)영업일 (월-금)근무시간 정각마다 실행 
//	@Scheduled(cron ="0 0 9-18 * * 1-5")//월(1),금(5),토(6),일(7)
//	@Scheduled(cron ="0 0 9-18 * * mon-fri")//월-금까지 
	
	//(Q) 급여일 (매월 25일) 오후 3시에 실행 
//	@Scheduled(cron="0 0 15 25 * ?")//물음표는 무관 (any)이라는 뜻 //일 과 요일은 보통 같이 안씀
	
	//(Q)매월 마지막 수요일 5시에 실행
//	@Scheduled(cron="0 0 17 ? * 3L")//마지막(L) 수요일(3)
//	@Scheduled(cron="0 0 17 ? * wedL")//마지막(L) 수요일(wed)
	
	//(Q)매월 넷째주 수요일 오후 5시에 실행
//	@Scheduled(cron="0 0 17 ? * 3#4")  //넷째주(#4) 수요일(3) 
//	@Scheduled(cron="0 0 17 ? * wed#4")  //넷째주(#4) 수요일(wed) 
	
	
	//인증번호 매일 정각마다 실행 
	@Scheduled(cron="0 0 * * * *") //하루에 24번 실행된다 
	public void cleatCert() {
		System.out.println(LocalDateTime.now());
		certDao.deleteLegacy();
	}
}
