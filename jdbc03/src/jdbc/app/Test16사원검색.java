package jdbc.app;

import java.util.List;

import jdbc.dao.EmpDao;
import jdbc.dto.EmpDto;

public class Test16사원검색 {
	public static void main(String[] args) {
		
		//입력
		int choice = 1;
		String keyword = "김";
		
//		계산
		String column;
		if(choice == 1) 
			column = "emp_name";
		else 
			column = "emp_dept";
		
//		String column = switch(choice) {//Java 16+
//		case 1 -> "emp_name";
//		default -> "emp_dept";
//		};
		
		EmpDao dao = new EmpDao();
		//List<EmpDto> list = dao.selectList(choice, keyword);
		List<EmpDto> list = dao.selectList(column, keyword);
		
		//출력
		System.out.println("검색 결과 수 : " + list.size()+"건");
		for(EmpDto dto : list) {
			System.out.println(dto.getEmpName() + " (" + dto.getEmpDept()+")");
		}
	}
}


