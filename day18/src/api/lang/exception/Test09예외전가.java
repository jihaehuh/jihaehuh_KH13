package api.lang.exception;

public class Test09예외전가 {
	public static void main(String[] args) throws InterruptedException { //이름에다가 예외전가시키기
		
		System.out.println("시작!");
		
		/*
		try {
			Thread.sleep(3000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		Thread.sleep(3000L);
		//Unhandled exception type InterruptedException
		//throw - 프로그램 멈추고 플랜 b로가라
		//throws - 나는 매우 위험한 메소드다(위험하다고 표시해주는거임) + 플랜 b가 없으면 못부른다
		//try-catch도 적당히 써야지 많이 쓰는건 별로 안좋다
		
		System.out.println("종료!");
		
	}
}
