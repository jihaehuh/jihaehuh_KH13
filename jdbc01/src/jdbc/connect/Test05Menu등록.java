package jdbc.connect;

<<<<<<< HEAD
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test05Menu등록 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 한글 이름 : ");
		String menuNameKor = sc.nextLine();
		
		System.out.print("메뉴 영문 이름 : ");
		String menuNameEng = sc.nextLine();
		
		System.out.print("메뉴 종류 : ");
		String menuType = sc.nextLine();
		
		System.out.print("메뉴 판매가(원) : ");
		int menuPrice= sc.nextInt();
		sc.close();
		//입력
		/*
		//입력
		String menuNameKor = "아메리카노";
		String menuNameEng = "Americano";
		String menuType = "커피";
		int menuPrice = 2500;
		
		*/
		
		String sql ="insert into menu2("
						+"menu_no,menu_name_kor,menu_name_eng, menu_type,menu_price"
						+")"
						+"values(menu2_seq.nextval,?,?,?,?)";
		
				Object[]data = {menuNameKor,menuNameEng,menuType,menuPrice};
				DriverManagerDataSource dataSource = new DriverManagerDataSource();
				dataSource.setUsername("kh13");
				dataSource.setPassword("kh13");
				dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
				dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
				
				//JdbcTemplate jdbcTemplate = new JdbcTemplate();
				// jdbcTemplate.setDataSource(dataSource);
				JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
				
				jdbcTemplate.update(sql,data);
				System.out.println("실행완료");
		
	}
}
=======
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


>>>>>>> branch 'main' of https://github.com/jihaehuh/jihaehuh_KH13.git
