<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>



<h1>비밀번호 변경 페이지</h1>


<c:if test="${param.error != null}">
<h3 style ="color:red">아이디 또는 비밀번호 정보가 일치하지 않습니다</h3> <%--조건부 여서 core 태그라이브 사용--%>
</c:if>
기존 아이디 <input type ="text" name="memberId" value="${memberDto.memberID}"> <br><br>
기존 비밀번호 <input type ="text" name="memberPw" value="${memberDto.memberPw}"> <br><br>
신규 비밀번호 <input type ="text" name="memberPw" value="${memberDto.memberPw}">

<a href="/member/pwok"><button>수정하기</button></a>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>