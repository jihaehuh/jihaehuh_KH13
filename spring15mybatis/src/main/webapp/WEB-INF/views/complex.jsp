<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>

<h2>회원 복합 검색 페이지</h2>

<!-- 검색 창  -->
<form>
	<fieldset>
		아이디 <input type="text" name="memberId" value="${vo.memberId }"> <br><br>
		닉네임 <input type="text" name="memberNick" value="${vo.memberNick }"> <br><br>
		연락처 <input type="text" name="memberContact" value="${vo.memberContact}"> <br><br>
		포인트
		 <input type="number" name="minPoint" value="${vo.minPoint }">~
		 <input type="number" name="maxPoint" value="${vo.maxPoint }">
		 <br><br>
		 가입일 
		 <input type="date" name="memberJoin" value="${vo.memberJoin}"><br><br>
		 최종 로그인 일시
		 <input type="date" name="minLoginDate" value="${vo.minLoginDate}">~
		 <input type="date" name="maxLoginDate" value="${vo.maxLoginDate}">
		 <br><br>
		 회원 등급
		 <input type="checkbox" name="memberLevelList" value="일반회원" <c:if test="${vo.memberLevelList.contains('일반회원') }">checked</c:if>>일반회원  
		 <input type="checkbox" name="memberLevelList" value="우수회원"<c:if test="${vo.memberLevelList.contains('우수회원') }">checked</c:if>>우수회원
		 <input type="checkbox" name="memberLevelList" value="관리자"<c:if test="${vo.memberLevelList.contains('관리자') }">checked</c:if>>관리자
		  <!--  
		 checked 붙이는 상황  vo에 있는 멤버리스트에 
		 일반회원이 들어있다면 checked 를 해라  ( 체크박스의 체크 유지를 하려고 )    
		   vo.memberList.contains("일반회원")
		   
		   <c:if test="${vo.memberLevelList.contains('관리자') }">checked</c:if>
		   -->
		 <br><br>
		 1차 정렬
		 <select name="orderList">
		 	<option value="member_id asc" <c:if test ="${vo.orderList.get(0) == 'member_id asc' }">selected</c:if>>아이디 순 정렬 </option>
		 	<option value="member_nick asc"<c:if test ="${vo.orderList.get(0) == 'member_nick asc' }">selected</c:if>>닉네임 순 정렬 </option>
		 	<option value="member_contact asc"<c:if test ="${vo.orderList.get(0) == 'member_contact asc' }">selected</c:if>>연락처 순 정렬 </option>
		 	<option value="member_point desc"<c:if test ="${vo.orderList.get(0) == 'member_point desc' }">selected</c:if>>보유 포인트 순 정렬 </option>
		 	<option value="member_join desc"<c:if test ="${vo.orderList.get(0) == 'member_join desc' }">selected</c:if>>최근 가입일 순 정렬 </option>
		 	<option value="member_login desc"<c:if test ="${vo.orderList.get(0) == 'member_login desc' }">selected</c:if>>최근 로그인 순 정렬 </option>
		 </select>
		 <!--
				selected 는 자바스크립트 도움 없이 태그만으로는 힘들다 (조금 위험) 
		 		조건 절 사용 
		 		
		 <c:if test ="${vo.orderList.get(0) == 'member_login desc' }">selected</c:if>
		  -->
		 
		 <br><br>
		 2차 정렬
		 <select name="orderList">
		 	<option value="member_id asc"<c:if test ="${vo.orderList.get(1) == 'member_id asc' }">selected</c:if>>아이디 순 정렬 </option>
		 	<option value="member_nick asc"<c:if test ="${vo.orderList.get(1) == 'member_nick asc' }">selected</c:if>>닉네임 순 정렬 </option>
		 	<option value="member_contact asc"<c:if test ="${vo.orderList.get(1) == 'member_contact asc' }">selected</c:if>>연락처 순 정렬 </option>
		 	<option value="member_point desc"<c:if test ="${vo.orderList.get(1) == 'member_point desc' }">selected</c:if>>보유 포인트 순 정렬 </option>
		 	<option value="member_join desc"<c:if test ="${vo.orderList.get(1) == 'member_join desc' }">selected</c:if>>최근 가입일 순 정렬 </option>
		 	<option value="member_login desc"<c:if test ="${vo.orderList.get(1) == 'member_login desc' }">selected</c:if>>최근 로그인 순 정렬 </option>
		 </select>
		 <br><br>
		 
		 3차 정렬
		 <select name="orderList">
		 	<option value="member_id asc"<c:if test ="${vo.orderList.get(2) == 'member_id asc' }">selected</c:if>>아이디 순 정렬 </option>
		 	<option value="member_nick asc"<c:if test ="${vo.orderList.get(2) == 'member_nick asc' }">selected</c:if>>닉네임 순 정렬 </option>
		 	<option value="member_contact asc"<c:if test ="${vo.orderList.get(2) == 'member_contact asc' }">selected</c:if>>연락처 순 정렬 </option>
		 	<option value="member_point desc"<c:if test ="${vo.orderList.get(2) == 'member_point desc' }">selected</c:if>>보유 포인트 순 정렬 </option>
		 	<option value="member_join desc"<c:if test ="${vo.orderList.get(2) == 'member_join desc' }">selected</c:if>>최근 가입일 순 정렬 </option>
		 	<option value="member_login desc"<c:if test ="${vo.orderList.get(2) == 'member_login desc' }">selected</c:if>>최근 로그인 순 정렬 </option>
		 </select>
		 <br><br>
		 
		 페이지 번호 <input type="number" name="page" value="${vo.page}"><br><br>
		 페이지 크기 <input type="number" name="size" value="${vo.size}"><br><br>
		 
		<button type="submit">검색</button>
	</fieldset>
</form>
</head>
	<body>
		<!-- 결과 -->
		
		<table border="1" width="1000">
	<thead>
		<tr>
			<th>아이디</th>
			<th>닉네임</th>
			<th>연락처</th>
			<th>등급</th>
			<th>포인트</th>
			<th>가입일</th>
			<th>로그인일시</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="memberDto" items="${list}">
		<tr>
			<td>${memberDto.memberId}</td>
			<td>${memberDto.memberNick}</td>
			<td>${memberDto.memberContact}</td>
			<td>${memberDto.memberLevel}</td>
			<td>${memberDto.memberPoint}</td>
			<td>${memberDto.memberJoin}</td>
			<td>${memberDto.memberLogin}</td>
		</tr>		
		</c:forEach>
	</tbody>
</table>
		
		</body>
</html>