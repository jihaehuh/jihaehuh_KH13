<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<%-- 제목 --%>
<h1>자유 게시판</h1>
<p>
	타인에 대한 무분별한 비방 또는 욕설은 경고 없이 삭제될 수 있습니다
</p>

<%-- 테이블 --%>
<table border="1" width="800">
	<thead>
		<tr>
			<th>번호</th>
			<th width="40%">제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>조회수</th>
		</tr>
	</thead>
	<tbody align="center">
		<c:forEach var="boardDto" items="${list}">
		<tr>
			<td>${boardDto.boardNo}</td>
			<td align="left">${boardDto.boardTitle}</td>
			<td>${boardDto.boardWriter}</td>
			<td>${boardDto.boardWtime}</td>
			<td>${boardDto.boardReadcount}</td>
		</tr>
		</c:forEach>
	</tbody>
</table>

<%-- 네비게이터 --%>

<%-- 검색창 --%>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>