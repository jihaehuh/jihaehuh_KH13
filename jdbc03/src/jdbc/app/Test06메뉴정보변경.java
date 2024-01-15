package jdbc.app;

import jdbc.dao.MenuDao;
import jdbc.dto.MenuDto;

public class Test06메뉴정보변경 {
	public static void main(String[] args) {
		
		//데이터 준비
		MenuDto dto = new MenuDto();
		dto.setMenuNo(2);
		dto.setMenuNameKor("아메리카노");
		dto.setMenuNameEng("Americano");
		dto.setMenuType("커피");
		dto.setMenuPrice(2500);
		
		//데이터 처리
		MenuDao dao = new MenuDao();
		boolean result = dao.update(dto);
		
		//출력
		if(result) {
			System.out.println("메뉴 정보 변경 완료");
		}
		else {
			System.out.println("존재하지 않는 메뉴 번호");
		}
		
	}
}