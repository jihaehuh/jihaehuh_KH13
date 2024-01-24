<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page ="/WEB-INF/views/template/header.jsp"></jsp:include>
<h1>신규 메뉴 등록</h1>

<form action="insert" method="post">
	한글메뉴명 <input type="text" name="menuNameKor" required> <br><br>
	영문메뉴명 <input type="text" name="menuNameEng" required> <br><br>
	메뉴유형 
	<%-- 
		<select>를 사용하면 주어진 목록 중에서 선택시킬 수 있다
		<select name="...">
			<option value="...">...</option>
			<option value="...">...</option>
			<option value="...">...</option>
		</select>	 
	--%>
	<select name="menuType" required>
		<option value="">선택하세요</option>
		<option value="커피">커피</option>
		<option value="스무디">스무디</option>
		<option value="에이드">에이드</option>
		<option value="디저트">디저트</option>
	</select>
	<br><br>
	메뉴가격 <input type="number" name="menuPrice" required> <br><br>
	<button>메뉴 등록</button>
	<a href="list">목록 보기</a>
</form>
<jsp:include page="/WEB-INF/views/template/footer.jsp"></jsp:include>





