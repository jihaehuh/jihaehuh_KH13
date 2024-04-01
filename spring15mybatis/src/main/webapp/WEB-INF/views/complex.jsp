<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<title>회원 복합 검색 페이지</title>

<!-- 검색 창  -->

<!-- 결과 -->
<div class="container w-500">
	<div class="cell center">

<h2>결과수 : ${list.size()}</h2>
<c:forEach var="memberDto" items="${list }">
	${memberDto }
<hr>
	</div>
</div>

</c:forEach>
