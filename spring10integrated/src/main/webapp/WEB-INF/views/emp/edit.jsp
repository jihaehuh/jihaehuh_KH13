<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- ${dto}<br>
${dto.empName},${dto.getEmpName()} <%--두 개 같은 것임 --%>

<%--dto에서 정보를 받아서 보여줘 할수 있음 --%>
    <h1>사원 정보 변경</h1>
    
    <form action ="edit" method="post">
    <input type="hidden" name="empNo" required value="${dto.empNo}">
    사원 이름 <input type="text" name="empName" required value="${dto.empName}" ><br><br>
    사원 소속 <input type="text" name="empDept" required value="${dto.empDept}" ><br><br>
    사원 입사일<input type="date" name="empDate" required  value= "${dto.empDate}" ><br><br>
   사원 연봉 <input type="number" name="empSal" required value="${dto.empSal}"><br><br>
    <button>정보 수정</button>
    <%--value 는 미리 떠있게 할 수 있는 기능이다 --%>
    </form>
    <%--http://localhost:8080/emp/edit?empNo=48 --%>