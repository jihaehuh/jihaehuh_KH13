package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test01회원가입2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//데이터 준비
		//- 입력 항목 : 아이디, 비밀번호, 닉네임, 연락처, 생년월일, 이메일, 주소
		//- 13개의 항목 중에서 9개를 입력받아야 한다 (4개가 필수 항목)
		MemberDto dto = new MemberDto();
		System.out.println("<회원가입>");
		System.out.print("아이디(*) : ");
		dto.setMemberId(sc.nextLine());
		System.out.print("비밀번호(*) : ");
		dto.setMemberPw(sc.nextLine());
		System.out.print("닉네임(*) : ");
		dto.setMemberNick(sc.nextLine());
		System.out.print("이메일(*) : ");
		dto.setMemberEmail(sc.nextLine());
		
		sc.close();
		
		//처리
		MemberDao dao = new MemberDao();
		dao.insert(dto);
		
		//출력
		System.out.println("회원 가입 완료");
		
	}
}