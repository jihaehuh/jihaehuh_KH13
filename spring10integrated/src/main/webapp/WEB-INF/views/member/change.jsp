<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/views/template/header.jsp"></jsp:include>

<h1> 개인정보 변경 페이지</h1>

<table border="1" width="350">
	<tbody>
	<tr>
		<td width ="30%"> 닉네임</td>
		<td>${memberDto.memberNick}</td>
	</tr>
	<tr>
		<td>생년월일</td>
		<td><input type="text" name="memberNick" placeholder="한글숫자 2~10자" required></td>
	</tr>
	<tr>
		<td>전화번호</td>
		<td><input type="tel" name="memberContact"></td>
		</tr>
		<tr>
			<td>이메일</td>
			<td> <input type="email" name="memberEmail" required></td>
		</tr>
		<tr>
			<td>우편번호</td>
			<td><input type="text" name="memberPost" placeholder="우편번호"></td>
		</tr>
		<tr>
			<td>주소1</td>
			<td><input type="text" name="memberAddress1" placeholder="기본주소"></td>
		</tr>
		<tr> 
			<td>주소2</td>
			<td><input type="text" name="memberAddress2" placeholder="상세주소"></td>
		</tr>
	</tbody>
</table>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>
