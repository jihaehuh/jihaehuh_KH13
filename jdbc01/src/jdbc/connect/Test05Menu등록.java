package jdbc.connect;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test05Menu등록 {
	public static void main(String[] args) {
		
		//입력
		String menuNameKor = "아메리카노";
		String menuNameEng = "Americano";
		String menuType = "커피";
		int menuPrice = 2500;
		
		//처리 - JDBC
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("KH13");
		dataSource.setPassword("KH13");
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		
//		JdbcTemplate jdbcTemplate = new JdbcTemplate();
//		jdbcTemplate.setDataSource(dataSource);
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		String sql = "insert into menu("
							+ "menu_no, menu_name_kor, menu_name_eng, "	
							+ "menu_type, menu_price"
						+ ") "
						+ "values(menu_seq.nextval, ?, ?, ?, ?)";
		Object[] data = {menuNameKor, menuNameEng, menuType, menuPrice};
		
		jdbcTemplate.update(sql, data);		
		
		//출력
		System.out.println("메뉴 등록이 완료되었습니다");
		
	}
}


