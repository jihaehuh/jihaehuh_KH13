package jdbc.update;

<<<<<<< HEAD
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcHelper;

public class Test03메뉴정보수정 {
	public static void main(String[] args) {
		/*
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("수정 메뉴 한글 이름: ");
		String menuNameKor =sc.nextLine();
		
		System.out.print("수정 메뉴 영어 이름: ");
		String menuNameEng =sc.nextLine();
		
		System.out.print("수정 메뉴 분류: ");
		String menuType =sc.nextLine();
		
		System.out.print("수정 메뉴 가격: ");
		int  menuPrice =sc.nextLine();
		System.out.print("수정 메뉴 번호: ");
		int  menuNO =sc.nextLine();
		
		//도구
		
		JdbcTemplate jdbcTemplate =JdbcHelper.getJdbcTemplate();
		
		//띄어쓰기 주의하기
		String sql="update menu2 "
				+"set menu_name_kor=?, menu_name_eng=?, menu_type=?, menu_price=?"
				+"where menu_no=?";
		Object[]data= {menuNameKor,menuNameEng,menuType,menuPrice,menuNO};
		
		jdbcTemplate.update(sql,data);
		System.out.println("메뉴수정 완료");
		*/
		
		//강사님 풀이
		//메뉴번호로 메뉴명(kor),메뉴명(eng),메뉴종류,메뉴가격을 변경하도록 구현

				//데이터 준비
		/*
				int menuNo = 5;
				String menuNameKor = "바꾼메뉴명";
				String menuNameEng = "test";
				String menuType = "바꾼종류";
				int menuPrice = 9999;
		*/	
				
				//입력
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

				String sql = "update menu2 "
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
		
		
		
		
		
		
		
		
		
		
		
		
		
=======
import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.JdbcHelper;

public class Test03메뉴정보수정 {
	public static void main(String[] args) {
		//메뉴번호로 메뉴명(kor),메뉴명(eng),메뉴종류,메뉴가격을 변경하도록 구현
		
		//데이터 준비
		int menuNo = 5;
		String menuNameKor = "바꾼메뉴명";
		String menuNameEng = "test";
		String menuType = "바꾼종류";
		int menuPrice = 9999;
		
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
>>>>>>> branch 'main' of https://github.com/jihaehuh/jihaehuh_KH13.git
	}
}
