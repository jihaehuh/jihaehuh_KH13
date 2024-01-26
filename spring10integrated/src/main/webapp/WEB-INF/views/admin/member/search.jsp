<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
회원 검색을 구현(검색어가 없으면 빈 화면)
아이디, 닉네임, 연락처, 이메일, 생년월일로 검색이 가능하도록 구현
검색 가능한 항목만 출력

<h1>회원 검색</h1>

<form action="search" method="get">
	<select name="column">
		<option value="member_id">아이디</option>
		<option value="member_nick">닉네임</option>
		<option value="member_contact">연락처</option>
		<option value="member_email">이메일</option>
		<option value="member_birth">생년월일</option>
	</select>
	<input type="search" name="keyword" value="${param.keyword}">
	<button>검색</button>
</form>

<c:forEach var="dto" items="${search}">
	<h2>
		아이디 = ${dto.memberId},
		닉네임 = ${dto.memberNick},
		연락처 = ${dto.memberContact},
		이메일 = ${dto.memberEmail},
		생년월일 = ${dto.memberBirth}
		<a href ="detail?memberNo =${dto.memberNo}">이동</a>
	</h2>
</c:forEach>



<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
