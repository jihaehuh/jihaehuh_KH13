package jdbc.connect;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test01JDBC연결 {
	public static void main(String[] args) {
		//Spring JDBC 
		//-Spring 에서 제공하는 JDBC도구들을 사용한 DBMS연결방법
		//-외부 라이브러리 등록 필요
		
		//[1] 연결 생성
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("kh13"); //아이디
		dataSource.setPassword("kh13");  //비밀번호
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");  //DB종류 지정
		dataSource.setUrl("jdbc:Oracle:thin:@localhost:1521:xe"); //DB연결 유형@위치
		
		//[2] 명령생성- 구문 마지막 세미콜론은 작성하지 않는다
		//String sql ="insert into pocketmon(형식)values(값)";
		String sql ="insert into pocketmon("
				+"pocketmon_no, pocketmon_name, pocketmon_type"
				+")"
				+ "values(26,'라이츄','전기')";
		
		//[3] 명령 처리 도구 생성
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		//[4]실행
		jdbcTemplate.update(sql);
		System.out.println("완료");
	}
}
