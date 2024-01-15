package jdbc.select;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

<<<<<<< HEAD
public class MenuMapper implements RowMapper<MenuDto> {

	@Override
	public MenuDto mapRow(ResultSet rs, int idx) throws SQLException {
		MenuDto dto = new MenuDto();
		dto.setMenuNo(rs.getInt("menu_no"));
		dto.setMenuNameKor(rs.getString("menu_name_kor"));
		dto.setMenuNameEng(rs.getString("menu_name_eng"));
		dto.setMenuType(rs.getString("menu_type"));
		dto.setMenuPrice(rs.getInt("menu_price"));
		
		
		return dto;
	}
	
}
=======
public class MenuMapper implements RowMapper<MenuDto>{
	@Override
	public MenuDto mapRow(ResultSet rs, int idx) throws SQLException {
		MenuDto dto = new MenuDto();
		dto.setMenuNo(rs.getInt("menu_no"));
		dto.setMenuNameKor(rs.getString("menu_name_kor"));
		dto.setMenuNameEng(rs.getString("menu_name_eng"));
		dto.setMenuType(rs.getString("menu_type"));
		dto.setMenuPrice(rs.getInt("menu_price"));
		return dto;
	}
}
>>>>>>> branch 'main' of https://github.com/jihaehuh/jihaehuh_KH13.git
