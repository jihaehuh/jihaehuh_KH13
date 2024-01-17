<%--
	JSP에는 반드시 <%@...%>형태의 설정 구문의 존재해야한다(Directive)
	- 총 3종류의 설정이 존재 (page, include, taglib)
	- 이후 부터는 key = value 형태로 설정값을 작성(지정된 이름만 가능)
	- contentType은 사용자 (브라우저)에게 알려주기 위한 화면의 형태
		- MIME-TYPE을 작성한다(200종류가 넘음)
		- text/html 일 경우 대분류가 text, 소분류가 html
		- charset 은 화면에 작성된 글자의 변환 방식을 말한다
		( 한글은 방식이 2개 utf-8, ms949)**하지만 전세계는 머지않아 utf-8을쓸것이다
		- pageEncoding 은 JSP가 실제화면으로 변환될때 변환 방식을 말한다(UTF-8)
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<h1>Home JSP!</h1>