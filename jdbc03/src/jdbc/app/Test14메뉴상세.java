package jdbc.app;

import java.text.DecimalFormat;

import jdbc.dao.MenuDao;
import jdbc.dto.MenuDto;

public class Test14메뉴상세 {
	public static void main(String[] args) {
		
		int menuNo = 21;
		
		MenuDao dao = new MenuDao();
		MenuDto dto = dao.selectOne(menuNo);
		
		if(dto == null) {
			System.out.println("존재하지 않는 메뉴입니다");
		}
		else {
			DecimalFormat fmt = new DecimalFormat("#,##0");
			
			System.out.print(dto.getMenuNameKor());
			System.out.print("("+dto.getMenuNameEng()+")");
			System.out.println();
			System.out.println("가격 : " + fmt.format(dto.getMenuPrice()));
			System.out.println("구분 : " + dto.getMenuType());
		}
		
	}
}