package jdbc.connect;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test02Book등록 {
	public static void main(String[] args) {

		//[1]연결 정보 생성
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("kh13"); //아이디
		dataSource.setPassword("kh13");  //비밀번호
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");  //DB종류 지정
		dataSource.setUrl("jdbc:Oracle:thin:@localhost:1521:xe");
		
		String sql ="insert into book("
						+"book_id, book_title, book_author, book_publication_date, "
						+ "book_price, book_publisher, book_page_count, book_genre"
						+")"
						+ "values(50,'자바신공','열혈강사','2023-10-01',5,'wikidocs',199,'Education')";
	
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql);
		System.out.println("완료");


		
		
	}
}




