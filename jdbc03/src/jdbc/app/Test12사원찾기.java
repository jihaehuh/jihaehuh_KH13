package jdbc.app;

import jdbc.dao.EmpDao;
import jdbc.dto.EmpDto;

public class Test12사원찾기 {
	public static void main(String[] args) {
		//1명의 사원을 찾고싶다면.... 반드시 사원번호(기본키)를 알아야 한다
		
		int empNo = 1;
		
		EmpDao dao = new EmpDao();
		EmpDto dto = dao.selectOne(empNo);
		
		if(dto != null) {
			System.out.println("사원번호 : " + dto.getEmpNo());
			System.out.println("사원이름 : " + dto.getEmpName());
			System.out.println("부서이름 : " + dto.getEmpDept());
			System.out.println("입사일자 : " + dto.getEmpDate());
			System.out.println("급여액 : " + dto.getEmpSal());
		}
		else {
			System.out.println("존재하지 않는 사원번호");
		}
	}
}