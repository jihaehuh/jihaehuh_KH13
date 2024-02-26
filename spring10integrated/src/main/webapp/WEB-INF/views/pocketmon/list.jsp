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
<%-- 네비게이터 --%>
<h2>
	<%-- 이전이 있을 경우만 링크를 제공 --%>
	<c:choose>
		<c:when test="${beginBlock == 1}">&lt;이전</c:when>
		<c:otherwise>
			<a href="list?page=${beginBlock-1}&size=${size}&column=${param.column}&keyword=${param.keyword}">&lt;이전</a>
		</c:otherwise>
	</c:choose>
	
	<%-- for(int i=beginBlock; i <= endBlock; i++) { .. } --%>
	<c:forEach var="i" begin="${beginBlock}" end="${Math.min(totalPage, endBlock)}" step="1">
		<%-- 다른 페이지일 경우만 링크를 제공 --%>
		<c:choose>
			<c:when test="${page == i}">${i}</c:when>
			<c:otherwise>
				<a href="list?page=${i}&size=${size}&column=${param.column}&keyword=${param.keyword}">${i}</a>
			</c:otherwise>
		</c:choose>
	</c:forEach>
	
	<%-- 다음이 있을 경우만 링크를 제공 --%>
	<c:choose>
		<c:when test="${endBlock >= totalPage}">다음&gt;</c:when>
		<c:otherwise>
			<a href="list?page=${endBlock+1}&size=${size}&column=${param.column}&keyword=${param.keyword}">다음&gt;</a> 
		</c:otherwise>
	</c:choose>
</h2>


<%-- 검색창 --%>
<form action="list" method="get">
	<select name="column">
		<option value="board_title" ${param.column == 'board_title' ? 'selected' : ''}>제목</option>
		<option value="board_writer" ${param.column == 'board_writer' ? 'selected' : ''}>작성자</option>
		<option value="board_content" ${param.column == 'board_content' ? 'selected' : ''}>내용</option>
	</select>
	<input type="search" name="keyword" placeholder="검색어 입력" required value="${param.keyword}">
	<button>검색</button>
</form>
  <jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>  