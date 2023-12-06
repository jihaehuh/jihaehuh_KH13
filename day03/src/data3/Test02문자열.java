package data3;

public class Test02문자열 {
	public static void main(String[]args) {
		//문자열 
		//-문자를 여러개 모아서 사용하는 형태
		
		String a = "Hello Java!";
				System.out.println(a);
		
		//- 구조상 출력이 어려운 경우 이 이스케이프 문자(\)로 출력
		//- 이 문자는 혼자가 아닌 뒤에 글자와 합쳐져 출력된다. 
		String b = "나는 지금 \"피자\"가 먹고싶어요";
		System.out.println(b);
		
		String c = "번호		이름		속성"; //tap키 2번씩 사용
		System.out.println(c);
		
		// Tap키와 띄어쓰기 구분이 안됨
		String d = "번호\t\t이름\t\t속성"; //아스키코드 사용
		System.out.println(d);
		
		String e = "안"
				+"녕"
				+"하"
				+"세"
				+"요";
				System.out.println(e);  // 줄바꿈이 안된다.
				
				String f = "안\n녕\n하\n세\n요\n";
				System.out.println(f);
		
		
	}
}
