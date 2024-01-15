package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test04비밀번호변경3 {
	public static void main(String[] args) {
		
		//현재 비밀번호 입력 추가
		Scanner sc = new Scanner(System.in);
		
		MemberDto dto = new MemberDto();
		System.out.print("아이디 : ");
		dto.setMemberId(sc.nextLine());
		System.out.print("현재 비밀번호 : ");
		String currentPw = sc.nextLine();
		System.out.print("바꿀 비밀번호 : ");
		dto.setMemberPw(sc.nextLine());
		
		sc.close();
		
		//현재 비밀번호 판정 추가
		MemberDao dao = new MemberDao();
		MemberDto find = dao.selectOne(dto.getMemberId());
		if(find != null) {
			//비밀번호 비교(find의 memberPw와 currentPw를 비교)
			if(find.getMemberPw().equals(currentPw)) {
				//업데이트
				dao.updateMemberPw(dto);
				System.out.println("비밀번호 변경 완료");
			}
			else {
				System.out.println("비밀번호가 일치하지 않습니다");
			}
		}
		else {
			System.out.println("존재하지 않는 회원 아이디");
		}
		
	}
}






