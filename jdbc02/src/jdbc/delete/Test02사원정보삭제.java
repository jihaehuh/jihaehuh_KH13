package jdbc.delete;

<<<<<<< HEAD
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcHelper;

public class Test02사원정보삭제 {
	public static void main(String[] args) {
		//PK를 이용한 삭제
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 사원 번호 입력 : ");
		int empNo =sc.nextInt();
		
		String sql="delete emp where emp_no=?";
		Object[]data = {empNo};
		
		int result =jdbcTemplate.update(sql,data);
		
		if(result>0) {
			System.out.println("사원정보 삭제 완료");
		}
		else {
			System.out.println("존재하지 않는 사원번호");
		}
	}
}
=======
import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.JdbcHelper;

public class Test02사원정보삭제 {
	public static void main(String[] args) {
		//PK를 이용한 삭제
		
		int empNo = 1;
		
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


>>>>>>> branch 'main' of https://github.com/jihaehuh/jihaehuh_KH13.git
