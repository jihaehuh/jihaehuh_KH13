package jdbc.app;

import jdbc.dao.MemberDao;

public class Test05회원탈퇴 {
	public static void main(String[] args) {
		//회원탈퇴 - delete member where member_id = ?
		
		String memberId = "testuser1";
		
		MemberDao dao = new MemberDao();
		boolean result = dao.delete(memberId);
		
		if(result) {
			System.out.println("회원 탈퇴 완료");
			System.out.println("그동안 이용해주셔서 감사합니다");
		}
		else {
			System.out.println("존재하지 않는 회원 정보");
		}
	}
}









