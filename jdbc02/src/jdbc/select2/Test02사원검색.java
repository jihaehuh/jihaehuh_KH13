package jdbc.select2;

import java.util.List;
import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.select.EmpDto;
import jdbc.select.EmpMapper;
import jdbc.select.PocketmonDto;
import util.JdbcHelper;

public class Test02사원검색 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색이름 : ");
		String keyword=sc.nextLine();
		
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql ="select * from emp where emp_name like ? || '%'";
		Object[]data = {keyword};
		EmpMapper mapper = new EmpMapper();
		
		List<EmpDto> list = jdbcTemplate.query(sql,mapper,data);
		
		System.out.println("조회결과 : "+list.size() +"개");
		for(EmpDto dto :list) {
			System.out.println(dto.getEmpName());
		}
	}
}
