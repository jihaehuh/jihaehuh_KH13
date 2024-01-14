package jdbc.delete;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.JdbcHelper;

public class Test03메뉴정보삭제 {
	public static void main(String[] args) {
		//PK를 이용한 삭제
		
		int menuNo = 1;
		
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "delete menu where menu_no=?";
		Object[] data = {menuNo};
		int result = jdbcTemplate.update(sql, data);
		
		if(result > 0) {
			System.out.println("메뉴 삭제 완료");
		}
		else {
			System.out.println("존재하지 않는 메뉴");
		}
		
	}
}