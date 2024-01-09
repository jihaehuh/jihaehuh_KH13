package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcHelper;

public class Test01포켓몬목록 {
	public static void main(String[] args) {
		//포켓몬스터 조회(select)
		//-Select구문을 실행시켜 나온 ResultSet을 객체로 변환하여 조회
		//-DB 테이블에 5줄이 있으면 자바는 객체5개로 조회해야한다
		//-insert,update,delete 와는 다르게 추가 클래스를 생성해야한다
		//-PocketmonDto라는 클래스를 만들어서 하나의 몬스터 정보를 정의(번호,이름,타입)
		//-PocketmonMapper 라는 클래스를 만들어서 List를 생성하기 위한 처리를 구현
		//-결론적으로 이작업으로 만들어지는 데이터가 List<PocketmonDto>
		
		//준비할 데이터
		String sql = "select * from pocketmon";
		//Object[]data={};
		
		JdbcTemplate jdbcTemplate =JdbcHelper.getJdbcTemplate();
		pocketmonMapper mapper = new pocketmonMapper();
		
		List<PocketmonDto> list = jdbcTemplate.query(sql, mapper);
		System.out.println("조회결과 수 : "+ list.size());
	}
}
