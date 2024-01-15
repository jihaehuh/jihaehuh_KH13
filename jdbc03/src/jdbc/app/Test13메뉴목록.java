package jdbc.app;

import java.util.List;

import jdbc.dao.MenuDao;
import jdbc.dto.MenuDto;

public class Test13메뉴목록 {
	public static void main(String[] args) {
		
		MenuDao dao = new MenuDao();
		List<MenuDto> list = dao.selectList();

		if(list.isEmpty()) {
			System.out.println("등록된 메뉴가 없습니다");
		}
		else {
			for(MenuDto dto : list) {
				System.out.print(dto.getMenuNameKor());
				System.out.print(" - ");
				System.out.print(dto.getMenuPrice()+"원");
				System.out.println();
			}
		}
		
	}
}









