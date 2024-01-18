<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1> 신규 메뉴 등록 </h1>
<form action= "insert" method ="post" required >    <%--주소는 같지만 방식은 다름 --%>
		한글메뉴명 : <input name="menuNameKor" type ="text" required><br><br>
		영문메뉴명 :<input name ="menuNameEng" type = "text" required><br><br>
		메뉴유형 : <%--<input name="menuType" ><br><br> --%>
		<%--
		<select>를 사용하면 주어진 목록 중에서 선택 시킬 수 있다
		<select name="...">
			<option value ="..">..</option>
			<option value ="..">..</option>
			<option value ="..">..</option>
		</select>
		 --%>
		 <select name="menuType" required>
		 	<option value ="">선택하세요</option>
			<option value ="커피">커피</option>
			<option value ="디저트">디저트</option>
			<option value ="스무디">스무디</option>
			<option value ="에이드">에이드</option>
			<option value ="음식">음식</option>
		</select>
		 <br><br>
		메뉴가격:<input name="menuPrice" type="number" required><br><br>
		<button>등록</button>
</form>