<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page ="/WEB-INF/views/template/header.jsp"></jsp:include>
<div class="container w-500">
	<div class="cell center"><h1>포켓몬 목록</h1></div>
	
			<%-- 검색창 --%>
			<%--검색창은 맨마지막에 만들기 --%>
<div class="cell">
<form action="list" method="get">
	<select name="column">
		<option value="pocketmon_name">이름</option>
		<option value="pocketmon_type">속성</option>
	</select>
	<input type="search" name="keyword" value="${param.keyword}">
	<button>검색</button>
</form>
</div>

<%-- for(PocketmonDto dto : list) --%>
<div class="cell">
<c:forEach var="dto" items="${list}">
	<h2>
	<div>번호 = ${dto.pocketmonNo}</div>
	<div>이름 = ${dto.pocketmonName}</div>
	<div>속성 = ${dto.pocketmonType}</div>
	<div><a href ="detail?pocketmonNo= ${dto.pocketmonNo}">이동</a></div>
	</h2>  
</c:forEach>  
</div>
  <jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>  