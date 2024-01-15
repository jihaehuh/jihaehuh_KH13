package jdbc.delete;


import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcHelper;

public class Test03메뉴정보삭제 {
	public static void main(String[] args) {
		//PK를 이용한 삭제
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 메뉴 번호 입력 : ");
		int menuNo =sc.nextInt();
		
		//오라클 이클립스 이름 문법 주의 하기 
		String sql="delete menu2 where menu_no=?";
		Object[]data = {menuNo};
		
		int result =jdbcTemplate.update(sql,data);
		
		if(result>0) {
			System.out.println("메뉴정보 삭제 완료");
		}
		else {
			System.out.println("존재하지 않는 메뉴번호");
		}
	}
}
