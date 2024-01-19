<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<h1>메뉴 목록 및 검색</h1>
<%-- 검색창 --%>
<%--검색창은 맨마지막에 만들기 --%>
<form action="list" method="get">
	<select name="column">
		<option value="menu_name_kor">이름</option>
		<option value="menu_price">가격</option>
	</select>
	<input type="search" name="keyword" value="${param.keyword}">
	<button>검색</button>
</form>

<%-- for(PocketmonDto dto : list) --%>
<c:forEach var="dto" items="${list}">
<h2>
			메뉴 번호 =${dto.menuNo},
			메뉴 한글 이름=${dto.menuNameKor},
			메뉴 영문 이름=${dto.menuNameEng},
			메뉴 분류 =${dto.menuType},
			메뉴 가격=${dto.menuPrice }
	
</h2>
</c:forEach>