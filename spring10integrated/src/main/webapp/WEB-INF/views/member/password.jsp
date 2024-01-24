<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>


<h1>비밀번호 변경 페이지</h1>

기존 비밀번호 <input type ="text" name="memberPw" value="${memberDto.memberPw}"> <br><br>
신규 비밀번호 <input type ="text" name="memberPw" value="${memberDto.memberPw}">
<button>수정하기 </button>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>