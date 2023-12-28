package api.lang.etc;

public class Test02Math클래스 {
	public static void main(String[] args) {
		//Math 클래스
		//- 프로그램 구현시 필요한 수학적인 연산을 처리하는 클래스
		//-객체생성이 불가능하며 모든 필드, 메소드가 static으로 구성
			
		int a= 100,b=80;
		System.out.println(a-b);
		System.out.println(b-a);
		System.out.println(Math.abs(a-b)); //절대값
		System.out.println(Math.abs(b-a));
		
		
		//삼각함수는 언제쓰나?
		//각도에 따른 위치계산 (2D게임 _앵그리버드,보글보글 등등)
		double c =1.5;
		System.out.println((int)(c +0.5));//반올림 만들기
		System.out.println(Math.round(c)); // 반올림
		System.out.println(Math.floor(c)); //버림
		System.out.println(Math.ceil(c)); //올림
		
		//제곱근
		System.out.println(Math.sqrt(9)); //루트 9
		System.out.println(Math.pow(2, 5)); //2의 5승
		
		System.out.println();
		double d = 3, e=4; 
		double f = Math.sqrt(Math.pow(d, 2)+Math.pow(e, 2));
		System.out.println("f= "+f);
		
		System.out.println(Math.max(d, e));//큰수
		System.out.println(Math.max(d, 1));//d에 뭐가 들어가도 1보다 크다
		System.out.println(Math.min(d, e)); //작은수
		System.out.println(Math.min(d, 1)); //d에 뭐가 들어가도 1보다 작다 (5000이 들어가도 1)_최솟값정하기할때 사용
		
		 
	}
}
