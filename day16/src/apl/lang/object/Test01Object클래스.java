package apl.lang.object;

public class Test01Object클래스 {
	public static void main(String[] args) {
		//Object 클래스
		//- "객체"를 의미하는 추상적인 클래스(추상클래스는 아님)
		//- "모든 클래스의 시조(최상위 클래스)
		//- "객체"가 가져야하는 기본 속성에 대해서 정의
		
		
		//객체 생성
		Object a = new Object();
		Object b = new Object();
		
		
		//객체를 만들었으면 필드와 메소드를 만들 수 있음
		
		//출력
		System.out.println(a);
		System.out.println(b);
		//메소드 호출
		System.out.println(a.hashCode());  //객체의 일련번호 반환(주소아님)
		System.out.println(b.hashCode()); //- 구분을 위한다
		
		System.out.println(a.toString()); //객체의 문자열을 봔환 =한줄요약 반환  
		System.out.println(b.toString()); //DEC가 10진수
		
	}
}
