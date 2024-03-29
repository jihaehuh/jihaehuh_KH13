<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page ="/WEB-INF/views/template/header.jsp"></jsp:include>
<h1>포켓몬 목록</h1>

<%-- 검색창 --%>
<%--검색창은 맨마지막에 만들기 --%>
<form action="list" method="get">
	<select name="column">
		<option value="pocketmon_name">이름</option>
		<option value="pocketmon_type">속성</option>
	</select>
	<input type="search" name="keyword" value="${param.keyword}">
	<button>검색</button>
</form>

<%-- for(PocketmonDto dto : list) --%>

<c:forEach var="dto" items="${list}">
	<h2>
		번호 = ${dto.pocketmonNo},
		이름 = ${dto.pocketmonName},
		속성 = ${dto.pocketmonType}
		<a href ="detail?pocketmonNo= ${dto.pocketmonNo}">이동</a>
	</h2>  
</c:forEach>  

  <jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>  