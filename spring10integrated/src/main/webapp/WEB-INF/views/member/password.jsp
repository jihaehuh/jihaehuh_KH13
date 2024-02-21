<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>


<div class="container w-500">
        <div class="cell center">
            <h1>비밀번호 변경</h1>
        </div>
<form action ="password" method ="post">
<div class="cell">
<c:if test="${param.error != null}">
<h3 style ="color:red">아이디 또는 비밀번호 정보가 일치하지 않습니다</h3> <%--조건부 여서 core 태그라이브 사용--%>
</div>
</c:if>
<div class="cell">
기존 비밀번호 <input type ="text" name="originPw" placeholder="기존 비밀번호를 입력해주세요" class="tool w-100" ><br><br>
</div>
<div class="cell">
신규 비밀번호 <input type ="text" name="changePw" placeholder="새로운 비밀번호를 입력해주세요" class="tool w-100" ><br><br>
</div>
<div class="cell">
     <button class="btn w-100">
       	 <i class="fa-solid fa-key"></i>
           변경하기 
     </button>
</form>
</div>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>