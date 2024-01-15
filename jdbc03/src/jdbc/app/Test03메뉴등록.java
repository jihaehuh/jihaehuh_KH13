package jdbc.app;

import jdbc.dao.MenuDao;
import jdbc.dto.MenuDto;

public class Test03메뉴등록 {
	public static void main(String[] args) {
		
		//메뉴 정보 준비
		MenuDto dto = new MenuDto();
		dto.setMenuNameKor("프라푸치노");
		dto.setMenuNameEng("Frappuccino");
		dto.setMenuType("커피");
		dto.setMenuPrice(6000);
		
		//메뉴 등록
		MenuDao dao = new MenuDao();
		dao.insert(dto);
		
		//결과 출력
		System.out.println("메뉴가 등록되었습니다");
		
	}
}