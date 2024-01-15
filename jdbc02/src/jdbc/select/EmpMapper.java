package jdbc.select;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmpMapper implements RowMapper<EmpDto>{
<<<<<<< HEAD

	@Override
	public EmpDto mapRow(ResultSet rs, int idx ) throws SQLException {
		EmpDto dto = new EmpDto();
		dto.setEmpNo(rs.getInt("emp_no")); //DB에 있는 emp_no라는 값을  Dto에 empNo 필드에 넣는다
		dto.setEmpName(rs.getString("emp_name"));
		dto.setEmpDept(rs.getString("emp_dept"));
		dto.setEmpDate(rs.getString("emp_date"));
		dto.setEmpSal(rs.getInt("emp_sal"));
		
		return dto;
	}

=======
	@Override
	public EmpDto mapRow(ResultSet rs, int idx) throws SQLException {
		//rs ---> EmpDto
		EmpDto dto = new EmpDto();
		dto.setEmpNo(rs.getInt("emp_no"));//DB(emp_no) → DTO(empNo)
		dto.setEmpName(rs.getString("emp_name"));//DB(emp_name) → DTO(empName)
		dto.setEmpDept(rs.getString("emp_dept"));//DB(emp_dept) → DTO(empDept)
		dto.setEmpDate(rs.getString("emp_date"));//DB(emp_date) → DTO(empDate)
		dto.setEmpSal(rs.getInt("emp_sal"));//DB(emp_sal) → DTO(empSal)
		return dto;
	}
>>>>>>> branch 'main' of https://github.com/jihaehuh/jihaehuh_KH13.git
}
