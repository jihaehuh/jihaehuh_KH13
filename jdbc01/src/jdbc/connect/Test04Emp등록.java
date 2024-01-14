package jdbc.connect;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test04Emp등록 {
	public static void main(String[] args) {
		
		//입력
		String empName = "어쩌구";
		String empDept = "저쩌구";
		String empDate = "2001-01-01";
		int empSal = 1000000;
		
		//처리 - JDBC
		String sql = "insert into emp(emp_no, emp_name, emp_dept, emp_date, emp_sal) "
						+ "values(emp_seq.nextval, ?, ?, ?, ?)";
		Object[] data = {empName, empDept, empDate, empSal};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("kh13");
		dataSource.setPassword("kh13");
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		
		jdbcTemplate.update(sql, data);
		
		//출력
		System.out.println("사원 등록 완료");
		
	}
}