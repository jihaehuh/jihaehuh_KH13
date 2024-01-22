<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>



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

<%--강사님 메뉴 목록 --%>
<h1>메뉴 목록</h1>

<%-- 검색창 --%>
<form action="list" method="get">
	<select name="column">
		<option value="menu_name_kor" ${param.column == 'menu_name_kor' ? 'selected' : ''}>메뉴명(한글)</option>
		<option value="menu_name_eng" ${param.column == 'menu_name_eng' ? 'selected' : ''}>메뉴명(영문)</option>
		<option value="menu_type" ${param.column == 'menu_type' ? 'selected' : ''}>메뉴유형</option>
	</select>
	<input type="text" name="keyword" placeholder="검색어 입력" required value="${param.keyword}">
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

<%--메뉴 목록 테이블로 출력 --%>
<h1>메뉴 목록</h1>

<table border ="!">
	<thead>
		<tr>
			<th> 메뉴 번호 </th>
			<th> 메뉴 이름 </th>
			<th> 메뉴 유형 </th>
			<th> 메뉴 가격 </th>
		</tr>
	</thead>
	<tbody align="center">
		<c:forEach var ="dto" items ="${list}">
	<tr>
		<td>${dto.menuNo} </td>
			<td align ="left">${dto.menuNameKor} 
					(${dto.menuNameEng})</td>
		<td>${dto.menuType} </td>
			<%-- <td align="right"> ${dto.menuPrice}</td>--%>
				<td align ="right">
					<fmt:formatNumber value ="${dto.menuPrice }" pattern="#,##0" >
					</fmt:formatNumber>원
				</td>
	</tr>
		</c:forEach>
	</tbody>
</table>









