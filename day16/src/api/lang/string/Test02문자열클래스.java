package api.lang.string;

public class Test02문자열클래스 {
	public static void main(String[] args) {
		//문자열(String)
		//-자바에서 제공하는 문자열 제어 클라스
		//-정말 몇개 안되는 new없이 객체가 생성되는 클래스
		
		//객체 생성 
		String a = new String();
		String b = new String("hello");
		
		StringBuffer  c = new  StringBuffer("hello");  //new 가 붙은건 새로 만들어라 
		String d = new String(c);//그래서 b랑 d는 따로 따로 새로운 new 인것이다
		
		String e = "hello"; //e랑 f는 같은 hello이고 리모콘만 따로 갖고 있는것이다
		String f ="hello";
		
		//정보출력
		//System.out.println("a = "+ a.toString()); //출력할때는 약식 표현으로 생략 가능
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		System.out.println("d = "+ d);
		
		System.out.println("e= "+ e);
	
		//b랑 e랑 같나요?
		
		//비교 연산? 
		System.out.println("b랑 d랑 같나요? "+ (b ==d));
		System.out.println("d랑 e랑 같나요? "+ (d ==e));
		System.out.println("e랑 f랑 같나요? " + (e ==f));
		System.out.println("b랑 f랑 같나요? " + (b ==f));
		 //결론 : 비교연산은 객체에서는 사용하기 까다롭다 (쓰지마라)
		
		//비교메소드   //boolean______equals(Object anObject)    object에는 아무거나 다 넣을수 있음
		System.out.println("<비교메소드> ");
		System.out.println("b랑 d랑 같나요? "+ (b.equals(d)));
		System.out.println("d랑 e랑 같나요? "+ (d.equals(e)));
		System.out.println("e랑 f랑 같나요? " + (e.equals(f)));
		System.out.println("b랑 f랑 같나요? " + (b.equals(f)));
		
		
	}
}
