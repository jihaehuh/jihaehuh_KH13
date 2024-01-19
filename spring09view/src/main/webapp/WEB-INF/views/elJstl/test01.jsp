<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1>EL출력 예제</h1>
<%--
		EL(Expression Language , 표현 언어)
		- EL은 JSP 페이지에서 Java 코드를 사용하지 않고도 
		동적인 데이터를 효과적으로 처리하고 출력하는 데 사용
		JSTL(JSP Standard Tag Library)은 
		JSP에서 자주 사용되는 기능을 제공하는 태그 라이브러리
		
		
		- 컨트롤러에서 전달된 값을 화면에 인쇄하는 출력언어
		- 컨트롤러 뿐 아니라 서버의 여러 다른 값들도 출력가능
		- ${이름} 형식으로 출력(입력 또는 설정은 불가능)
		- 사용자가 보는 결과화면에서 확인할 수 없다(만드는 과정에서 사용)
		- null을 화면에 출력하지 않고 공백으로 처리한다  (드디어 null 없이 공백을 쓸 수 있게 되었음)
		- JSP 에서만 사용이 가능하다

 --%>
<h2>a= ${requestScope.a}</h2>
<h2>a= ${a}</h2>
<h2${b}>b 출력</h2>
<h2>c=${c}</h2>
<h2>d=${d}</h2>  
<%-- d가 없으면 출력했을 때 공백으로 나온다
 --%>
 