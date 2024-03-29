package com.kh.spring14.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring14.dto.MenuDto;

@Repository
public class MenuDao {
	@Autowired
	private SqlSession sqlSession;
	
	//등록 
	public void insert(MenuDto menuDto) {
		sqlSession.insert("menu.add",menuDto );
	}
	//목록
		public List<MenuDto> selectList() {
			return sqlSession.selectList("menu.list");
		}
		
		//단일 조회
		public MenuDto selectOne(int menuNo) {
			return sqlSession.selectOne("menu.find",menuNo);
		}
		
		//수정
		public boolean update(MenuDto menuDto) { 
			//맵퍼에서 업데이트를 실행하고 싶은데 안에 뭐가 많아서 DTO도 불러오는거임 
			 return sqlSession.update("menu.edit",menuDto) > 0;
		}
		
		//삭제 
		public boolean delete(int menuNo) { //삭제는 번호가 필요함 
			return sqlSession.delete("menu.del",menuNo)>0;  //구문아이디 조심하기 'emp.del'
		}
}
