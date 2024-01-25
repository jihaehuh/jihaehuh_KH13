<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

<h1>회원 탈퇴</h1>
<P>탈퇴를 위해 비밀번호를 한번 더 입력해주세요</P>

<form action ="exit" method="post">
	<input type="password" name="memberPw" placeholder="비밀번호 입력" requird >
	<button>확인</button>


<c:if test="${param.error != null}">
<h3 style ="color:red">로그인 정보가 일치하지 않습니다</h3> <%--조건부 여서 core 태그라이브 사용--%>
</c:if>
</form>


<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>