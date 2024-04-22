package com.kh.spring19.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring19.dto.MenuDto;

@Repository
public class MenuDao {
	@Autowired
	private SqlSession sqlSession;
	
	public List<MenuDto> selectList() {
		return sqlSession.selectList("menu.list");
	}
	public MenuDto selectOne(int menuNo) {
		return sqlSession.selectOne("menu.find",menuNo);
	}
	public int sequence() {
		return sqlSession.selectOne("menu.sequence");
	}
	public void insert(MenuDto menuDto) {
		sqlSession.insert("menu.save",menuDto);
	}
	public boolean edit(MenuDto menuDto) {
		return sqlSession.update("menu.edit",menuDto) > 0;
	}
	public boolean delete(int menuNo) {
		return sqlSession.delete("menu.delete",menuNo) > 0;
	}

}
