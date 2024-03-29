package com.kh.spring14.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring14.dto.EmpDto;
import com.kh.spring14.dto.PocketmonDto;

@Repository
public class EmpDao {
	@Autowired
	private SqlSession sqlSession;
	

	//등록
	public void insert(EmpDto empDto) {
		//(주의) 구문을 적고 뒤에 데이터는 최대 1개 밖에 전달할 수 없다 
		sqlSession.insert("emp.save",empDto);
	}
	
	//목록
	public List<EmpDto> selectList() {
		return sqlSession.selectList("emp.list");
	}
	
	//단일 조회
	public EmpDto selectOne(int empNo) {
		return sqlSession.selectOne("emp.find",empNo);
	}
	
	//수정
	public boolean update(EmpDto empDto) { 
		//맵퍼에서 업데이트를 실행하고 싶은데 안에 뭐가 많아서 DTO도 불러오는거임 
		 return sqlSession.update("emp.edit",empDto) > 0;
	}
	
	//삭제 
	public boolean delete(int empNo) { //삭제는 번호가 필요함 
		return sqlSession.delete("emp.del",empNo)>0;  //구문아이디 조심하기 'emp.del'
	}
 }
