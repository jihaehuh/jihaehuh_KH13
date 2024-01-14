package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test04비밀번호변경2 {
	public static void main(String[] args) {
		
		//입력 추가
		Scanner sc = new Scanner(System.in);
		
		MemberDto dto = new MemberDto();
		System.out.print("아이디 : ");
		dto.setMemberId(sc.nextLine());
		System.out.print("바꿀 비밀번호 : ");
		dto.setMemberPw(sc.nextLine());
		
		sc.close();

		MemberDao dao = new MemberDao();
		boolean result = dao.updateMemberPw(dto);
		
		if(result) {
			System.out.println("비밀번호 변경 완료");
		}
		else {
			System.out.println("존재하지 않는 아이디 정보");
		}
		
	}
}






