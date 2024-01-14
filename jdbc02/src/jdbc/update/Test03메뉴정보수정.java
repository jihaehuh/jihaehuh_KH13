package jdbc.update;

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
	}
}
