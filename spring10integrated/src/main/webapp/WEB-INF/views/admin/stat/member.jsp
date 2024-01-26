<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1>멤버 등급별 인원 수 통계</h1>

<table border="1" width="300">
	<thead>
		<tr>
			<th>멤버 등급</th>
			<th>인원수</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var ="statVO" items="${list}">
		<tr>
			<td>${statVO.title}</td>
			<td>${statVO.count}</td>
		</tr>
		</c:forEach>
	</tbody>	
</table>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>