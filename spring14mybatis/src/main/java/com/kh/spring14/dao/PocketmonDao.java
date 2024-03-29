package com.kh.spring14.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring14.dto.PocketmonDto;

@Repository
public class PocketmonDao {
	
//	@Autowired
//	private JdbcTemplate jdbcTemplate;//Spring JDBC
	
	@Autowired
	private SqlSession sqlSession;//myBatis
	
	//목록
	public List<PocketmonDto> selectList() {
		//return pocketmon 영역의 list라는 구문을 실행해서 나온 결과;
		return sqlSession.selectList("pocketmon.list");
	}
	
	//등록
	public void insert(PocketmonDto pocketmonDto) {
//		String sql="insert into po...." 이거는 별로 효율적이지 못함
		sqlSession.insert("pocketmon.add", pocketmonDto);   
		//- 너가 알아서 dto에서 pocketmon의 add를꺼내 
	}
	
	//수정
	public boolean update(PocketmonDto pocketmonDto) {
		 return sqlSession.update("pocketmon.edit",pocketmonDto) > 0;
	}
	
	//삭제
	public boolean delete(int pocketmonNo) {
		return sqlSession.delete("pocketmon.remove",pocketmonNo)>0; 
		//포켓몬의 리무브를 불러오고, 번호도 불러와라
	}
	
	//상세 조회를 구현하는 방법은 두가지
	//1. selectList를 사용해서 목록으로 처리 - 여러개 나와도 에러가 안남 (x)
	//2. selectOne을 사용해서 상세 조회 처리 - 여러개 나오면 에러가 발생(0)
	public PocketmonDto selectOne(int pocketmonNo) {
		//1.원래 하던 방법 
//		List<PocketmonDto> list=
//				sqlSession.selectList("pocketmon.find",pocketmonNo);
//		return list.isEmpty() ? null :list.get(0);
		//2.
		return sqlSession.selectOne("pocketmon.find",pocketmonNo);
	}
	
	
	
	
}