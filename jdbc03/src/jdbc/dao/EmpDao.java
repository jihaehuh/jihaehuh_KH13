package jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.EmpDto;
import jdbc.mapper.EmpMapper;
import jdbc.util.JdbcHelper;

//emp 테이블에 대한 CRUD 작업을 수행하는 클래스
public class EmpDao {
	//등록
	public void insert(EmpDto dto) {
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "insert into emp("
							+ "emp_no, emp_name, emp_dept, "
							+ "emp_date, emp_sal"
						+ ") "
						+ "values(emp_seq.nextval, ?, ?, ?, ?)";
		Object[] data = {
			dto.getEmpName(), dto.getEmpDept(),
			dto.getEmpDate(), dto.getEmpSal()
		};
		jdbcTemplate.update(sql, data);
	}
	
	//수정
	public boolean update(EmpDto dto) {
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "update emp set "
						+ "emp_name=?, emp_dept=?, emp_date=?, emp_sal=? "
						+ "where emp_no=?";
		Object[] data = {
			dto.getEmpName(), dto.getEmpDept(), dto.getEmpDate(),
			dto.getEmpSal(), dto.getEmpNo()
		};
		return jdbcTemplate.update(sql, data) > 0;
//		int result = jdbcTemplate.update(sql, data);
//		if(result > 0) return true;
//		else return false;
	}
	
	//삭제
	public boolean delete(int empNo) {
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "delete emp where emp_no=?";
		Object[] data = {empNo};
//		return jdbcTemplate.update(sql, data) > 0;
		int result = jdbcTemplate.update(sql, data);
		if(result > 0) return true;
		else return false;
	}
	
	//목록
	public List<EmpDto> selectList() { 
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "select * from emp order by emp_no asc";
		//Object[] data = {};
		EmpMapper mapper = new EmpMapper();
		return jdbcTemplate.query(sql, mapper);
	}

	//상세
	public EmpDto selectOne(int empNo) {
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "select * from emp where emp_no = ?";
		Object[] data = {empNo};
		EmpMapper mapper = new EmpMapper();
		List<EmpDto> list = jdbcTemplate.query(sql, mapper, data);
		return list.isEmpty() ? null : list.get(0);
	}
	
	//검색
	public List<EmpDto> selectList(String column, String keyword) {
		JdbcTemplate jdbcTemplate = JdbcHelper.getJdbcTemplate();
		String sql = "select * from emp where instr("+column+", ?) > 0";
		Object[] data = {keyword};
		EmpMapper mapper = new EmpMapper();
		return jdbcTemplate.query(sql, mapper, data);
	}
	
}
