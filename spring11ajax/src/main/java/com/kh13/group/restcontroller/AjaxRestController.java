package com.kh13.group.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh13.group.dao.MemberDao;
import com.kh13.group.dao.PocketmonDao;
import com.kh13.group.dto.MemberDto;
import com.kh13.group.dto.PocketmonDto;



@CrossOrigin //외부에서의 비동기 통신을 허용하는 설정(현관문 열어놓기) 
@RestController // 사용자에게 데이터를 전송하는 컨트롤러(화면x)
public class AjaxRestController {
	@Autowired
	private MemberDao memberDao;
	
	@Autowired
	private PocketmonDao pocketmonDao;
	
	
	@RequestMapping("/hello")
	public String hello() {
		return "Spring boot project";
	}
	
	
	@RequestMapping("/checkId")
	public String checkId(@RequestParam String memberId) {
		MemberDto memberDto = memberDao.selectOne(memberId);
		if(memberDto == null) {
			return "NNNNY"; // 사용 가능한 경우(DB에 없는 경우)
		}
		else {
			return "NNNNN"; // 사용 불가능한 경우(DB에 있는 경우)
		}
		
	}
	
	@RequestMapping("/checkPocketmonNo")
	public boolean checkPocketmonNo(@RequestParam int pocketmonNo) {
		PocketmonDto dto = pocketmonDao.selectOne(pocketmonNo);
		return dto == null;
//		if(dto == null) {
////			return true; //사용 가능 (DB 무 존재)
//		return true;//			
//		}
//		else {
////			return false; //사용 불가능(DB존재)
//			return false;
//		}
		
	}
	@PostMapping("/checkMemberNick")
	public boolean checkMemberNick(@RequestParam String memberNick) {
		MemberDto dto = memberDao.selectOneByMemberNick(memberNick);
		return dto == null;
	}
	
	
	


}
