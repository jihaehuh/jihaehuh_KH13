package jdbc.app;

import jdbc.dao.EmpDao;

public class Test08사원삭제 {
	public static void main(String[] args) {
		
		int empNo = 2;
		
		EmpDao dao = new EmpDao();
		boolean result = dao.delete(empNo);
		
		if(result) {
			System.out.println("사원 정보가 삭제되었습니다");
		}
		else {
			System.out.println("존재하지 않는 사원 번호입니다");
		}
		
	}
}