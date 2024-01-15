package jdbc.delete;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.JdbcHelper;

public class Test02사원정보삭제2 {
	public static void main(String[] args) {
		//PK를 이용한 삭제
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 사원번호 : ");
		int empNo = sc.nextInt();
		sc.close();
		
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "delete emp where emp_no=?";
		Object[] data = {empNo};
		int result = jdbcTemplate.update(sql, data);
		
		if(result > 0) {
			System.out.println("사원을 삭제했습니다");
		}
		else {
			System.out.println("존재하지 않는 사원번호입니다");
		}
	}
}