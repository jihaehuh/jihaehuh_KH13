<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    <h1>이미지 실습</h1>
    
   <%--
   		img 태그
   		- 페이지에 이미지를 보여줄 수 있는 효과를 부여 
   		- 태그만으로는 정보가 부족하므로 속성(attribute)을 통해 추가 정보를 전달
   		- 속성은 key=value 형태이며, 속성과 속성 사이에는 반드시 띄어쓰기가 필요
   		
   		- src : 이미지의 경로 
   		- width : 이미지의 폭 (단위: 픽셀px)(%도 사용)
   		- height : 이미지의 높이(단위: 픽셀px)(%도 사용)
   		(보통 1000-1500사이 크기로 함)
   		- alt : 접근성 향상을 위한 도움말 
   --%>
   <%--<img src="이미지의 주소or위치"> --%>
   <img  width="200" src="https://m.ezendolls.com/web/product/big/201803/605_shop1_119071.jpg">   

  <hr>
  
  <img  alt="짱구는 못말려 짱구이미지"  width="30%" src="https://m.ezendolls.com/web/product/big/201803/605_shop1_119071.jpg">
  
  <%--
  			<img src="D:\ZEZE\bg.png">
  			프로젝트 외부에 있는 이미지는 보안상의 이유로 src에 설정할 수 없다
  			
  			이미지를 프로젣트에 포함시켜야한다(src/main/resources/static)
  			이미지를 해당 위치에 포함시키면 주소가 파일명으로 자동생성된다
  			
  			같은 서버의 같은 프로젝트에 있기 때문에 주소를 생략할 수 있다
  			- 프로토콜 생략 :<img width ="400" src ="//localhost:8080/bg.png">
  			- host/port 생략 : <img width ="400" src ="/bg.png">
  			
  			한편, 다음과 같이 작성해도 된다.
  			<img width="400" src="bg.png">
  			위와 같은 방식은 상대경로(relative path)라고 부른다
  			
  			절대 경로는 언제나 한결같은 위치를 가리키고
  			상대경로는 현재 페이지에 따라 다른 위치를 가리킨다
  			
   --%> 
   <img width ="400" src ="bg.png">
  
  
  