package com.kh.spring05.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring05.dto.EmpDto;
import com.kh.spring05.mapper.EmpMapper;

@Repository
public class EmpDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private EmpMapper mapper;

	public void insert(EmpDto dto) {
		String sql = "insert into emp("
						+ "emp_no, emp_name, emp_dept, emp_date, emp_sal"
					+ ") values(emp_seq.nextval, ?, ?, ?, ?)";
		Object[] data = {
			dto.getEmpName(), dto.getEmpDept(), 
			dto.getEmpDate(), dto.getEmpSal()
		};
		jdbcTemplate.update(sql, data);
	}
	public boolean update(EmpDto dto) {
		String sql = "update emp "
						+ "set emp_name=?, emp_dept=?, emp_date=?, emp_sal=? "
						+ "where emp_no=?";
		Object[] data = {
				dto.getEmpName(), dto.getEmpDept(), 
				dto.getEmpDate(), dto.getEmpSal(),dto.getEmpNo()
		};
		return jdbcTemplate.update(sql, data) > 0;
	}
		//삭제
	public boolean delete(int empNo) {
		String sql="delete emp where emp_no=?";
		Object[]data= {empNo};
		return jdbcTemplate.update(sql,data)>0;
	}
	
	//삭제 주소
	//http://localhost:8080/emp/delete?empNo=2
	
	//단순목록 조회 
	public List<EmpDto> selectList() {
		String sql = "select * from emp order by emp_no asc";
		return jdbcTemplate.query(sql, mapper);
	}
	
	//항목+키워드 검색
	public List<EmpDto> selectList(String column, String keyword) {
		String sql = "select * from emp where instr("+column+", ?) > 0 "
										+ "order by "+column+" asc, emp_no asc";
		Object[] data = {keyword};
		return jdbcTemplate.query(sql, mapper, data);
	}
	//http://localhost:8080/emp/list?column=emp_name&keyword=이
	
	//한 항목(번호)조회
	public EmpDto selectOne(int empNo) {
		String sql = "select * from emp where emp_no =?";
		Object[]data = {empNo};
		List<EmpDto>list =jdbcTemplate.query(sql, mapper,data);
		return list.isEmpty() ? null:list.get(0);
	}
	//http://localhost:8080/emp/detail?empNo=2
}
		

