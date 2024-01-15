package jdbc.update;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.JdbcHelper;

public class Test03메뉴정보수정2 {
	public static void main(String[] args) {
		//메뉴번호로 메뉴명(kor),메뉴명(eng),메뉴종류,메뉴가격을 변경하도록 구현
		
		//데이터 준비
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴번호 : ");
		int menuNo = sc.nextInt();
		sc.nextLine();//엔터제거
		System.out.print("메뉴명(한글) : ");
		String menuNameKor = sc.nextLine();
		System.out.print("메뉴명(영문) : ");
		String menuNameEng = sc.nextLine();
		System.out.print("메뉴종류 : ");
		String menuType = sc.nextLine();
		System.out.print("메뉴가격 : ");
		int menuPrice = sc.nextInt();
		sc.close();
		
		//처리 - JDBC
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		
		String sql = "update menu "
						+ "set "
							+ "menu_name_kor=?,"
							+ "menu_name_eng=?,"
							+ "menu_type=?,"
							+ "menu_price=? "
						+ "where menu_no=?";
		Object[] data = {
				menuNameKor, menuNameEng, 
				menuType, menuPrice, menuNo
		};
		
		int result = jdbcTemplate.update(sql, data);
		
		//출력
		if(result > 0) {
			System.out.println("메뉴 정보가 변경되었습니다");
		}
		else {
			System.out.println("존재하지 않는 메뉴 번호입니다");
		}
	}
}







