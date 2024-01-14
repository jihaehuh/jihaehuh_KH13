package jdbc.app;

import jdbc.dao.EmpDao;
import jdbc.dto.EmpDto;

public class Test02사원등록 {
	public static void main(String[] args) {
		
		//데이터 준비
		EmpDto dto = new EmpDto();
		dto.setEmpName("김사원");
		dto.setEmpDept("인사팀");
		dto.setEmpDate("2024-01-01");
		dto.setEmpSal(2500000);
		
		//처리
		EmpDao dao = new EmpDao();
		dao.insert(dto);
		
		//출력
		System.out.println("사원 등록 완료");
		
	}
}

