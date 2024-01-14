package jdbc.app;

import java.util.List;

import jdbc.dao.EmpDao;
import jdbc.dto.EmpDto;

public class Test11사원목록 {
	public static void main(String[] args) {
		
		EmpDao dao = new EmpDao();
		List<EmpDto> list = dao.selectList();
		
		if(list.isEmpty()) {
			System.out.println("등록된 사원 정보가 없습니다");
		}
		else {
			System.out.println("사원 수 : " + list.size()+"명");
			for(EmpDto dto : list) {
				System.out.println("- "+dto.getEmpName()+"("+dto.getEmpDept()+")");
			}
		}
		
	}
}