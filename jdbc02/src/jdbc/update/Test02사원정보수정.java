package jdbc.update;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.JdbcHelper;

public class Test02사원정보수정 {
	public static void main(String[] args) {
		//사번을 이용해서 사원명,부서,입사일,급여를 변경하도록 구현
		
		//데이터 준비
		int empNo = 10;
		String empName = "바꾼이름";
		String empDept = "바꾼부서";
		String empDate = "2024-01-09";
		int empSal = 5000000;
		
		//처리
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		
		String sql = "update emp "
						+ "set emp_name=?, emp_dept=?, emp_date=?, emp_sal=? "
						+ "where emp_no=?";
		Object[] data = {empName, empDept, empDate, empSal, empNo};
		
		jdbcTemplate.update(sql, data);
		
		//출력
		System.out.println("사원 정보 변경 완료");
	}
}