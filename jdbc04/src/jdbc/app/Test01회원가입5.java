package jdbc.app;

import java.util.Scanner;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test01회원가입5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//데이터 준비
		//- 입력 항목 : 아이디, 비밀번호, 닉네임, 연락처, 생년월일, 이메일, 주소
		//- 13개의 항목 중에서 9개를 입력받아야 한다 (4개가 필수 항목)
		MemberDto dto = new MemberDto();
		System.out.println("<회원가입>");
		System.out.print("아이디(*) : ");
		dto.setMemberId(sc.nextLine());
		
		//상세조회로 아이디 중복검사
		MemberDao dao = new MemberDao();
		MemberDto find = dao.selectOne(dto.getMemberId());
		if(find != null) {
			System.out.println("이미 사용중인 아이디입니다");
			System.exit(0);
		}
		
		System.out.print("비밀번호(*) : ");
		dto.setMemberPw(sc.nextLine());
		
		System.out.print("비밀번호 확인(*) : ");
		String memberPwCheck = sc.nextLine();
		if(!dto.getMemberPw().equals(memberPwCheck)) {//비밀번호가 일치하지 않으면
			System.out.println("비밀번호 확인을 비밀번호와 동일하게 입력하세요");
			System.exit(0);
		}
		
		System.out.print("닉네임(*) : ");
		dto.setMemberNick(sc.nextLine());
		System.out.print("이메일(*) : ");
		dto.setMemberEmail(sc.nextLine());
		System.out.print("생년월일 : ");
		dto.setMemberBirth(sc.nextLine());
		System.out.print("연락처 : ");
		dto.setMemberContact(sc.nextLine());
		System.out.print("우편번호 : ");
		dto.setMemberPost(sc.nextLine());
		System.out.print("기본주소 : ");
		dto.setMemberAddress1(sc.nextLine());
		System.out.print("상세주소 : ");
		dto.setMemberAddress2(sc.nextLine());
		sc.close();
		
		//처리
		dao.insert(dto);
		
		//출력
		System.out.println("회원 가입 완료");
		
	}
}






