package jdbc.app;

import jdbc.dao.MenuDao;

public class Test09메뉴삭제 {
	public static void main(String[] args) {
		
		int menuNo = 5;
		
		MenuDao dao = new MenuDao();
		boolean result = dao.delete(menuNo);
		
		if(result) {
			System.out.println("메뉴 삭제 완료");
		}
		else {
			System.out.println("존재하지 않는 메뉴 번호");
		}
		
	}
}