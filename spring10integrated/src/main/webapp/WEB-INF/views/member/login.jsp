<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>


<div class="container w-400 mt-50">
        <div class="cell center my-20">
<h1>로그인</h1>

<c:if test="${param.error != null}">
<h3 style ="color:red">로그인 정보가 일치하지 않습니다</h3> <%--조건부 여서 core 태그라이브 사용--%>
</c:if>
<div align="center">
<form action ="login" method ="post">
	<div class="cell" >
	아이디 <input class="box input w-50 height=20 " type="text" name="memberId" placeholder="아이디" ><br><br>
	</div>
 	<div class="cell">
 	비밀번호<input class="box input" type="password" name="memberPw" placeholder="비밀번호"><br><br>
 	</div>
 	<button class="box btn positive">로그인</button>
</form>
</div>
</div>
</div>


<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>