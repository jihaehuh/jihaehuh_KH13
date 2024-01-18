<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1> 신규 메뉴 등록 </h1>
<form action= "insert" method ="post">    <%--주소는 같지만 방식은 다름 --%>
		메뉴한국이름: <input name="menuNameKor" type =text"><br><br>
		메뉴영어이름:<input name ="menuNameEng" type = text"><br><br>
		메뉴분류 : <input name="menuType" type="text"><br><br>
		메뉴가격:<input name="menuPrice" type="number"><br><br>
		<button>등록</button>
</form>