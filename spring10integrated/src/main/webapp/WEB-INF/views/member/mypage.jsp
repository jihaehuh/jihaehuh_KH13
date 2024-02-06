<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>
<h1>마이 페이지</h1><br>

<h2>${sessionScope.loginId}님의 회원 정보</h2>

<img src="image" width="200" height="200">

<table border="1" width="350">
	<tbody>
	<tr>
		<td width ="30%"> 닉네임</td>
		<td>${memberDto.memberNick}</td>
	</tr>
	<tr>
		<td>생년월일</td>
		<td>${memberDto.memberBirth}</td>
	</tr>
	<tr>
		<td>전화번호</td>
		<td>${memberDto.memberContact}</td>
		</tr>
		<tr>
			<td>이메일</td>
			<td>${memberDto.memberEmail}</td>
		</tr>
		<tr>
			<td>우편번호</td>
			<td>${memberDto.memberPost}</td>
		</tr>
		<tr>
			<td>주소1</td>
			<td>${memberDto.memberAddress1}</td>
		</tr>
		<tr> 
			<td>주소2</td>
			<td>${memberDto.memberAddress2}</td>
		</tr>
		<tr>
			<td>멤버 등급</td>
			<td>${memberDto.memberLevel}</td>
		</tr>
		<tr> 
			<td>멤버 포인트</td>
			<td>${memberDto.memberPoint} point</td>
		</tr>
		<tr>
			<td>가입 날짜</td>
			<td>
			<fmt:formatDate value ="${memberDto.memberJoin}" 
			pattern ="y년M월d일H시m분s초" />
			</td>
		</tr>
		<tr>
			<td>로그인일시</td>
			<td>
			<fmt:formatDate value ="${memberDto.memberLogin}" 
			pattern ="y년M월d일H시m분s초" />
			</td>
		</tr>
	</tbody>
</table>

<%-- <h2><a href="/member/password">비밀번호 변경 마지막 슬래쉬를 endpoint라고 한다--%>
<h2><a href="/member/password">비밀번호 변경</a></h2>
<h2><a href ="/member/change">개인정보변경</a></h2>
<h2><a href ="/member/exit">회원탈퇴</a></h2> <%--세션때문에 파라미터 들어간 주소는 못씀 --%>
<hr>
<h1>
포인트 구매 내역
<a href="/point/charge"> 추가 구매</a>
</h1>

<table border="1" width="600">
	<thead>
		<tr>
			<th> 번호</th>
			<th> 상품명</th>
			<th>수량</th>
			<th>구매 금액</th>
			<th> 구매일시</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="buyDto" items="${buyList}">
			<tr>
				<td>${buyDto.buySerial}</td>
				<td>${butDto.itemName}</td>
				<td>${buyDto.buyQty}</td>
				<td>
				<fmt:formatNumber value="${buyDto.buyTotal}" pattern ="#,##0"></fmt:formatNumber></td>
				<td>
				<fmt:formatDate value="${buyDto.buyTime}" 
				pattern ="yyyy-MM-dd HH:mm" ></fmt:formatDate></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<c:forEach var="buyDto" items="${buyList}">
</c:forEach>

<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>



