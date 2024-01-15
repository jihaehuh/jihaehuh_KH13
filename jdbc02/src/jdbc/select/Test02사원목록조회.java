package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import util.JdbcHelper;

public class Test02사원목록조회 {
	public static void main(String[] args) {
		
		String sql ="select *from emp";
		//Object[]data ={};
		
		
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		EmpMapper mapper = new EmpMapper();
		
		List<EmpDto> list =jdbcTemplate.query(sql,mapper);
		
		System.out.println("조회결과 수 : "+list.size());
		
		//확장반복문 (컬렉션에서 했었음)
		for(EmpDto dto : list) {  //list 에 있는거 다 꺼내서 dto로 사용하겠다   
			System.out.println(dto.getEmpName()+ ","+ dto.getEmpDept()); 
		}
	}
}
