<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<h1>충전 상품 목록</h1>
<table border="1">
	<c:forEach var="itemDto" items="${list}">
		<tr>
				<td><img src="image?itemNo=${itemDto.itemNo}"></td> 						<%-- 이미지 --%>
				<td> ${itemDto.itemName}</td> <%--상품명 --%>
				<td> ${itemDto.itemPrice}원</td>	 <%--가격 --%>
				<td> ${itemDto.itemCharge}포인트 충전</td>
				<td>
					<a href="delete?itemNo=${itemDto.itemNo}">삭제</a>
				</td>
			</tr>
	</c:forEach>
</table>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>