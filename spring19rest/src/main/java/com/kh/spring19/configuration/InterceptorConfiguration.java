package com.kh.spring19.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.kh.spring19.interceptor.MemberInterceptor;

@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer {

	@Autowired
	private MemberInterceptor memberInterceptor;
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//권한을 줬다가 풀었다가 하는 것을 AOP라고 함 
		//접근제한 하려면 아래 코드 주석 처리 안하기 
		registry.addInterceptor(memberInterceptor)
		.addPathPatterns("/student/**");
	}
	

}
