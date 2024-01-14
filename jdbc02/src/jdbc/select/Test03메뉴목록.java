package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.util.JdbcHelper;

public class Test03메뉴목록 {
	public static void main(String[] args) {
		
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		
		String sql = "select * from menu order by menu_no asc";
		//Object[] data = {};
		MenuMapper mapper = new MenuMapper();
		
		List<MenuDto> list = jdbcTemplate.query(sql, mapper);
		//List<MenuDto> list = jdbcTemplate.query(sql, mapper, data);
		
		for(MenuDto dto : list) {
			//System.out.println(dto.toString());
			System.out.print(dto.getMenuNameKor());
			System.out.print("(");
			System.out.print(dto.getMenuNameEng());
			System.out.print(")");
			System.out.print(" - ");
			System.out.println(dto.getMenuPrice()+"원");
		}
		
	}
}





