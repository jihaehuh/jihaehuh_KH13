package com.kh13.group.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh13.group.dao.MemberDao;
import com.kh13.group.dto.MemberDto;



@CrossOrigin //외부에서의 비동기 통신을 허용하는 설정(현관문 열어놓기) 
@RestController // 사용자에게 데이터를 전송하는 컨트롤러(화면x)
public class AjaxRestController {
@RequestMapping("/hello")
public String hello() {
	return "Spring boot project";
}

@Autowired
private MemberDao memberDao;


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
}
