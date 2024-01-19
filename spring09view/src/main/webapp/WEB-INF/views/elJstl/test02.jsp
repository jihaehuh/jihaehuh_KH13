<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%--
		EL의 추론 기능
		- ${dto.pocketmonName} 이라고 하면 자동으로 dto.getPocketmonName()으로 변경
		- 객체에 Gatter 메소드가 없다면 에러 발생


 --%>


<h1>Model에 객체가 담겨오는 경우</h1>


<h2> 번호 = ${dto.pocketmonNo}</h2>
<h2> 이름 = ${dto.pocketmonName}</h2>
<h2> 속성 = ${dto.pocketmonType}</h2>

<h2> 번호 = ${test.pocketmonNo}</h2>
<h2> 이름 = ${test.pocketmonName}</h2>
<h2> 속성 = ${test.pocketmonType}</h2>

