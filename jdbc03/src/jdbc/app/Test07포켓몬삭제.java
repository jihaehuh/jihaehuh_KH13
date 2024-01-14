package jdbc.app;

import jdbc.dao.PocketmonDao;

public class Test07포켓몬삭제 {
	public static void main(String[] args) {
		
		//데이터 준비
		int pocketmonNo = 4;
		
		//처리
		PocketmonDao dao = new PocketmonDao();
		boolean result = dao.delete(pocketmonNo);
		
		//출력
		if(result) {
			System.out.println("몬스터 삭제 완료");
		}
		else {
			System.out.println("존재하지 않는 몬스터 번호");
		}
		
	}
}