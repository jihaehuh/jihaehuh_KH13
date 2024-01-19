<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <h1> 사원 목록 및 검색</h1>
    <%--검색창 --%>
    <form action ="list" method ="get">
    	<select name ="column">
    		<option value ="emp_name">이름 </option>
    		<option value ="emp_dept">소속</option>
    	</select>
    	<input type ="search" name="keyword" value ="${param.keyword}">
    	<button>검색하기</button>
    </form>
    
    <%--목록 나열 --%>
    <c:forEach var="dto" items="${list}">
    <h3>
    		번호 : ${dto.empNo},
    		이름 : ${dto.empName},
    		소속 : ${dto.empDept},
    		입사날짜 :${dto.empDate},
    		연봉:${dto.empSal}
 
    </h3>
    </c:forEach>