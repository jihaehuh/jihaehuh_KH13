package com.kh.spring05.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring05.dto.PocketmonDto;
import com.kh.spring05.mapper.PocketmonMapper;

//DAO도 이제부터는 등록 해야한다
//-@Repository는 파일이나 데이터베이스 

@Repository
public class PocketmonDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private PocketmonMapper mapper;

	public void insert(PocketmonDto dto) {
		String sql = "insert into pocketmon("
				+ "pocketmon_no, "
				+ "pocketmon_name, "
				+ "pocketmon_type"
				+") values(?,?,?)";
		Object[] data = {dto.getPocketmonNo() , dto.getPocketmonName(), dto.getPocketmonType()};
		jdbcTemplate.update(sql,data);
	}
	
	//수정
	public boolean update(PocketmonDto dto) {
		String sql = "update pocketmon "
						+ "set pocketmon_name=?, pocketmon_type=? "
						+ "where pocketmon_no=?";
		Object[] data = {
			dto.getPocketmonName(), dto.getPocketmonType(),
			dto.getPocketmonNo()
		};
		return jdbcTemplate.update(sql, data) >0;
	}
	//등록주소 
	//http://localhost:8080/pocketmon/edit?pocketmonNo=&pocketmonName=바꾼이름&pocketmonType=바꿨음
	
	//삭제
	public boolean delete(int pocketmonNo) { //삭제는 프라이머리 키로 한다(상세 검색과 비슷)
		String sql ="delete pocketmon where pocketmon_no=?";
		Object[]data = {pocketmonNo};
		return jdbcTemplate.update(sql,data)>0;
		//왜 부등호를 쓰는가? 
		//- 데이터를 지우던 업데이트를 하던 하면 실행횟수가 생기기때문에 0으로 해놓으면 횟수가 올라가면 실행이되었다고 알려주고
		//-없거나 업데이트를 할 사항이 없을때도 실행은 되기때문에 0일때 출력하도록 한다 
		//- 결론 -> 업데이트 Row가 숫자여서 저렇게 부등호를 사용해서 쓸 수 있는것임
		
	}
	//삭제 주소
	//http://localhost:8080/pocketmon/delete?pocketmonNo=66
	
	//단순목록조회
	public List<PocketmonDto> selectList() {
		String sql = "select * from pocketmon order by pocketmon_no asc";
		return jdbcTemplate.query(sql, mapper);
	}
	//http://localhost:8080/pocketmon/list?pocketmonNo&pocketmonKeyword=피카
	
	//항목+키워드 검색
	public List<PocketmonDto> selectList(String column, String keyword) {
		String sql = "select * from pocketmon where instr("+column+", ?) > 0 "
										+ "order by "+column+" asc, pocketmon_no asc";
		Object[] data = {keyword};
		return jdbcTemplate.query(sql, mapper, data);
	}
	//http://localhost:8080/pocketmon/list3?column=pocketmon_name&keyword=테스트
	
	
	
	
	
	
}
