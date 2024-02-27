package com.kh13.group.restcontroller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin //외부에서의 비동기 통신을 허용하는 설정
@RestController // 사용자에게 데이터를 전송하는 컨트롤러(화면x)
public class AjaxRestController {
@RequestMapping("/hello")
public String hello() {
	return "Hello Ajax!";
}
}
