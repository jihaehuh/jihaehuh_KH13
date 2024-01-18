<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1>사원등록 </h1>
<%--절대 경로 
		<form action ="/emp/insert2"></form>
 --%>
<%-- <form action="insert2"> --%>
	<form action ="insert" method ="post">
	사원이름: <input name="empName" type="text" ><br><br>
	사원소속:<input name="empDept" type="text"><br><br>
	입사날짜:<input name="empDate" type="date"><br><br>
	사원연봉:<input name ="empSal" type="text"><br><br>
	<button>등록</button>
</form>