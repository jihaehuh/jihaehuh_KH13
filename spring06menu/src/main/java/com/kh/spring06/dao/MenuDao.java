package com.kh.spring06.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring06.dto.MenuDto;
import com.kh.spring06.mapper.MenuMapper;

@Repository
public class MenuDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private MenuMapper mapper;
	
	public void insert(MenuDto dto) {
		String sql = "insert into menu("
							+ "menu_no, menu_name_kor, menu_name_eng, "
							+ "menu_type, menu_price"
						+ ") "
						+ "values(menu_seq.nextval, ?, ?, ?, ?)";
		Object[] data = {
			dto.getMenuNameKor(), dto.getMenuNameEng(),
			dto.getMenuType(), dto.getMenuPrice()
		};
		jdbcTemplate.update(sql, data);
	}
	
	//수정
	public boolean update(MenuDto dto) {
		String sql = "update menu "
				+ "set menu_name_kor=?, menu_name_eng=? ,menu_type=?, menu_price=? "
				+ "where menu_no=?";
		Object[] data = {
				dto.getMenuNameKor(), dto.getMenuNameEng(),
				dto.getMenuType(), dto.getMenuPrice(),
				dto.getMenuNo()
			};
		return jdbcTemplate.update(sql, data)>0;
	}
	
	//삭제 
	public boolean delete(int menuNo) {
		String sql = "delete menu where menu_no=?";
		Object[]data= {menuNo};
		return jdbcTemplate.update(sql,data)>0;
	}
	//단순목록 조회
	public List <MenuDto> slectList()
	{
		String sql = "slelct * from menu order by menu_no asc";
		return jdbcTemplate.query(sql, mapper);
		
	}
	
	//항목 +키워드 검색
	public List<MenuDto> selectList() {
		String sql = "select * from menu order by menu_no asc";
		return jdbcTemplate.query(sql, mapper);
	}
	
	public List<MenuDto> selectList(String column, String keyword) {
		String sql = "select * from menu "
						+ "where instr("+column+", ?) > 0 "
						+ "order by "+column+" asc, menu_no asc";
		Object[] data = {keyword};
		return jdbcTemplate.query(sql, mapper, data);
	}
	//한 항목 조회(번호)
	public MenuDto selectOne(int menuNo) {
		String sql = "select * from menu where menu_no=?";
		Object[]data = {menuNo};
		List<MenuDto> list =jdbcTemplate.query(sql, mapper,data);
		return list.isEmpty()? null :list.get(0);
	}
	//http://localhost:8080/menu/detail?menuNo=1
	
	
	
	
	
	
	
}