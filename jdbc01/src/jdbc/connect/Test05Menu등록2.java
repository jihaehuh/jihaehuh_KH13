package jdbc.connect;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test05Menu등록2 {
	public static void main(String[] args) {
		
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴명(한글) : ");
		String menuNameKor = sc.nextLine();
		System.out.print("메뉴명(영문) : ");
		String menuNameEng = sc.nextLine();
		System.out.print("메뉴 종류 : ");
		String menuType = sc.nextLine();
		System.out.print("메뉴 가격 : ");
		int menuPrice = sc.nextInt();
		sc.close();
		
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


