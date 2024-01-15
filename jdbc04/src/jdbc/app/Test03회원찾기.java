package jdbc.app;

import jdbc.dao.MemberDao;
import jdbc.dto.MemberDto;

public class Test03회원찾기 {
	public static void main(String[] args) {
		
		//데이터 준비
		String memberId = "testuser1";
		
		//처리
		MemberDao dao = new MemberDao();
		MemberDto dto = dao.selectOne(memberId);

		//출력
		if(dto != null) {
			System.out.println("<"+dto.getMemberId()+" 님의 정보>");
			System.out.println("닉네임 : " + dto.getMemberNick());
			System.out.println("이메일 : " + dto.getMemberEmail());
			System.out.println("연락처 : " + dto.getMemberContactStr());
			System.out.println("생년월일 : " + dto.getMemberBirthStr());
			System.out.print("주소 : ");
			System.out.print("["+dto.getMemberPostStr()+"]");
			System.out.print(dto.getMemberAddress1Str());
			System.out.print(" ");
			System.out.print(dto.getMemberAddress2Str());
			System.out.println();
			System.out.println("등급 : " + dto.getMemberLevel());
			System.out.println("포인트 : " + dto.getMemberPoint()+" point");
			System.out.println("가입일 : " + dto.getMemberJoin());
			System.out.println("마지막 로그인 : " + dto.getMemberLoginStr());
		}
		else {
			System.out.println("존재하지 않는 회원");
		}
	}
}





