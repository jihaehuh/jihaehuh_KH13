<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>메뉴 목록
<a href ="insert">+신규등록</a>
</h1>
<h2><a href="list">목록 보기</a></h2>
<h2><a href = "insert"> 다시 등록 하기</a></h2>

<c:choose>
<c:when test="${dto != null }">
	<h1>메뉴 정보</h1>
	
	<table border ="1" width ="800">
	<tr>
		<th> 메뉴 번호</th>
		<td>${dto.menuNo}</td>
	</tr>
	<tr>
		<th>메뉴 이름</th>
		<td> ${dto.menuNameKor} (${dto.menuNameEng})</td>
	</tr>
	<tr>
		<th>메뉴 유형</th>
		<td>${dto.menuType}</td>
	</tr>
	<tr>
		<th> 메뉴 가격</th>
		<td> ${dto.menuPrice}</td>
	</tr>
	</table>
	<%--다른 페이지로의 링크 --%>
	<h3><a href ="list"> 목록보기</a></h3>
	<h3><a href = ""> 수정하기</a></h3>
	<h3><a href ="delete?menuNo=${dto.menuNo}">삭제하기</a></h3>
</c:when>
		<c:otherwise>
			<h1>존재하지 않는 메뉴 번호</h1>
		</c:otherwise>
</c:choose>