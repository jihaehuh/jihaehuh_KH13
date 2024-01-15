package jdbc.select2;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.select.PocketmonDto;
import jdbc.select.PocketmonMapper;
<<<<<<< HEAD
import util.JdbcHelper;

public class Test01포켓몬검색 {
	public static void main(String[] args) {
		 //유사검색
		//-시작 검색 or 포함검색
		//-상황에 맞게 like 연산자 또는 instr함수를 사용
		
		//데이터 준비
		String keyword = "피카";		
		
		//keyword += "%";
		//처리
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "select * from pocketmon "
				+ "where pocketmon_name like ? || '%'"; // ||가 오라클에서는 + 
		Object[] data = {keyword};
		PocketmonMapper mapper = new PocketmonMapper();
		
		List<PocketmonDto> list = jdbcTemplate.query(sql, mapper,data);
		
		System.out.println("조회결과 : "+list.size() +"개");
		for(PocketmonDto dto :list) {
=======
import jdbc.util.JdbcHelper;

public class Test01포켓몬검색 {
	public static void main(String[] args) {
		//유사검색
		//- 시작검색 or 포함검색
		//- 상황에 맞게 like 연산자 또는 instr 함수를 사용
		
		//데이터 준비
		String keyword = "피카";
		
		//처리
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "select * from pocketmon "
						+ "where pocketmon_name like ? || '%'";
		Object[] data = {keyword};
		PocketmonMapper mapper = new PocketmonMapper();
		
		List<PocketmonDto> list = jdbcTemplate.query(sql, mapper, data);
		
		//출력
		System.out.println("조회 결과 : " + list.size()+"개");
		for(PocketmonDto dto : list) {
>>>>>>> branch 'main' of https://github.com/jihaehuh/jihaehuh_KH13.git
			System.out.println(dto.getPocketmonName());
		}
	}
}
