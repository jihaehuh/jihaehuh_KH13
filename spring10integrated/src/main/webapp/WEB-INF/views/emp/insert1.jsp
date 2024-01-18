<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1>사원등록 </h1>
<%--절대 경로 
		<form action ="/emp/insert2"></form>
 --%>
<form action="insert2">
	
	사원이름: <input name="empName"><br><br>
	사원소속:<input name="empDept"><br><br>
	입사날짜:<input name="empDate"><br><br>
	사원연봉:<input name ="empSal"><br><br>
	<button>등록</button>
</form>