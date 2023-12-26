package api.lang.string;

public class Test04문자열검사 {
	public static void main(String[] args) {
		
		String url ="http://www.naver.com";
		
		//홈페이지주소인가?(http로 시작하는가?)
		//boolean __________startsWith(String prefix) 이 문자열이 지정된 접두사로 시작하는지 테스트합니다.
		System.out.println("http로시작? "+ url.startsWith("http"));
		System.out.println("https로시작? "+ url.startsWith("https"));
		
		//회사 주소인가? (.com으로 끝나는가?)
		//.co.kr 한국   | .com 기업 | .org 조직 | .net 네트워크 기업(제한 x) | .go.kr 정부 | .ac,kr 한국 교육기관
		//boolean ___________endsWith(String suffix) 이 문자열이 지정된 접미사로 끝나는지 테스트합니다.
		System.out.println(".com으로 끝나는가?"+ url.endsWith(".com")); 
		
		//네이버 주소인가? (naver가 들어있는가)
		//boolean____________contains(CharSequence s) 이 문자열에 지정된 char 값 시퀀스가 ​​포함되어 있는 경우에만 true를 반환합니다.
		System.out.println("naver 포함?"+ url.contains("naver")); 
		
		//네이버가 어디있어요?
		//int__________________lastIndexOf(int ch) 이 문자열 내에서 지정된 문자가 마지막으로 나타나는 인덱스를 반환합니다.
		System.out.println("naver 위치 = "+ url.indexOf("naver")); 
		System.out.println("kakao 위치 = "+ url.indexOf("kakao"));  //int 일때 없으면 -1이 나오는것은 없다는 의미 ; 숫자는 0부터 시작이므로
		
		//글자 수 
		//int________________length()  이 문자열의 길이를 반환합니다.
		System.out.println("글자 수 = "+ url.length());
		
		//특정 위치의 글자를 추출
		//char_______________charAt(int index) char지정된 인덱스의 값을 반환합니다 .
		char ch = url.charAt(11);
		System.out.println("+11 위치의 글자 = "+ ch);
		//System.out.println("+11 위치의 글자 = "+ url.charAt(11));
		
		
	}
}
