<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>


<div class="container w-500">
        <div class="cell center">
            <h1>로그인 </h1>
        </div>
<div align="center">
<form action ="login" method ="post">
	<div class="cell left">
            아이디
             <input type ="text" name="memberId" placeholder="아이디를 입력해주세요" class="tool w-100">
	</div>
 	 <div class="cell left">
            비밀번호
             <input type ="text" name="memberPw" placeholder="비밀번호를 입력해주세요" class="tool w-100">
 	</div>
 	<div>
	 	<c:if test="${param.error != null}">
			<h3 style ="color:red">로그인 정보가 일치하지 않습니다</h3> <%--조건부 여서 core 태그라이브 사용--%>
		</c:if>
	</div>
 	<button class="btn w-100">로그인</button>
</form>
</div>
</div>



<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>