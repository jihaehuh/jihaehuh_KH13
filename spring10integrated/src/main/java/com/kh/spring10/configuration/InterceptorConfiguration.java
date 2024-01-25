package com.kh.spring10.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.kh.spring10.interceptor.MemberInterceptor;
import com.kh.spring10.interceptor.TestInterceptor;

//application.properties에서 하기 힘든 설정들을 이곳에서 구현할 수 있다
//[1] 상속을 통한 자격획득(WebMvcConfigurer)
//[2] 등록
//[3] 필요한 메소드를 재정의하여 설정 구현
@Configuration
public class InterceptorConfiguration implements WebMvcConfigurer {
		@Autowired
		private TestInterceptor testInterceptor;
	
		@Autowired 
		private MemberInterceptor memberInterceptor;
	
		@Override
		public void addInterceptors(InterceptorRegistry registry) {
			//registry에다가 인터셉터를 주소와 함께 등록
			//registry.addInterceptor(인터셉터객체).addPathPatterns(주소);  "/**"의미는 모든 주소 
			//registry.addInterceptor(testInterceptor)
			//.addPathPatterns("/**");  
			//Interceptor 에서 false로 반환해놓고 포켓몬 목록과 사원목록주소만 써놓으면 두곳은 차단할수있음
			
			registry.addInterceptor(memberInterceptor)
						.addPathPatterns("/member/mypage");
	
	
	
	
	}

}
