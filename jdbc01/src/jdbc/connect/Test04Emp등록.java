package jdbc.connect;

<<<<<<< HEAD
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test04Emp등록 {
	public static void main(String[] args) {
		
		//입력
				Scanner sc = new Scanner(System.in);
				System.out.print("사원명 : ");
				String empName = sc.nextLine();
				System.out.print("부서명 : ");
				String empDept = sc.nextLine();
				System.out.print("입사일 : ");
				String empDate = sc.nextLine();
				System.out.print("급여액 : ");
				int empSal = sc.nextInt();
				sc.close();
		/*
		String empName ="ㄴㅇ혜";
		String empDept ="KH아카데미";
		String empDate ="2024-01-01";
		double empSal = 90000000;
		*/
		//처리 JDBC
		String sql ="insert into emp("
				+ "emp_no,emp_name,emp_dept,emp_date,emp_sal"
				+")"
				+"values(emp_seq.nextval,?,?,?,?)"; //테이블에서 자동적으로 받아 와야기때문에 
		Object[]data = {empName,empDept,empDate,empSal};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("kh13");
		dataSource.setPassword("kh13");
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql,data);
		System.out.println("실행완료");
	}
}

=======
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
>>>>>>> branch 'main' of https://github.com/jihaehuh/jihaehuh_KH13.git
