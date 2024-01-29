<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>회원 정보 수정</h1>

<%--
	추가로 전달할 정보 - 아이디(hidden)
	수정할 정보 - 닉네임,이메일,생년월일,연락처,주소,(+등급,포인트)	
 --%>
<form action="edit" method="post">
	<input type="hidden" name="memberId" value="${memberDto.memberId}">

	닉네임 <input type="text" name="memberNick" value="${memberDto.memberNick}" required> <br><br>
	이메일
	연락처
	생년월일
	주소
	등급
	포인트

	<button>변경</button>
</form>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>