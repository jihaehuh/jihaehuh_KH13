<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 
	컨트롤러 에서 dto라는 이름으로 정보가 전달 되며 없을 수 있다
		조건을 통해 있는 경우와 없는 경우를 분리하여 출력

--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1> 포켓몬 목록 
<a href ="insert1" > +신규등록</a>
</h1>
<h2> <a href ="list" > 목록 보기</a></h2>
<h2><a href ="insert1"> 다시 등록 하기</a></h2>

<c:choose>
	<c:when test ="${dto !=null }">
	<h1>몬스터 정보</h1>
	
			<table border ="1" width ="300">
			<tr>
				<th>번호</th>
				<td> ${dto.pocketmonNo}</td>
			</tr>
			<tr>
				<th>이름</th>
				<td> ${dto.pocketmonName}</td>
			</tr>
			<tr>
				<th>속성</th>
				<td> ${dto.pocketmonType}</td>
			</tr>
			</table>
			<%-- 다른 페이지로의 링크 --%>
		<h2><a href="list">목록보기</a></h2>
		<h2><a href="">수정하기</a></h2>
		<h2><a href="delete?pocketmonNo=${dto.pocketmonNo}">삭제하기</a></h2>
	</c:when>
		<c:otherwise>
				<h1>존재하지 않는 포켓몬스터 번호</h1>
		</c:otherwise>
</c:choose>