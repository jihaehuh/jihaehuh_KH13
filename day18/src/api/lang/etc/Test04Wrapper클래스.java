package api.lang.etc;

public class Test04Wrapper클래스 {
	public static void main(String[] args) {
		//Wrapper클래스
		//-자바에 존재하는 8개의 원시형 데이터를 클래스로 만들어 놓은것
		//-boolean,byte,short,char,int,long,float,double 
		//-Boolean,Byte,Short,Character,integer,Long,Float,Double  //클래스명
		
		//int a =10;
		//객체 생성
		//인티저는 생성자가 있지만 비추천.. 왜??
		//Integer a = new Integer(10); //비추천 (java 9이상)
		//문자열을 넣으면 숫자로 바꿔주는것
		//Integer b = new Integer("10"); //비추천 (java 9이상)
		
		//왜 비추천이라는 것이 생겼을까??
		//-추가를 하다보니까 이전것이 문제가 생기면서 앞으로는 안썼으면 좋겠다...
		//-나 분명히 없어질꺼라고 했는데 너가 쓴거야 그니까 너 책임임.....!!
		//그래서 추천하는 방식은 .. 
		Integer a = Integer.valueOf(10);   //(Api)는 컨트롤누르고 value 누르면 남이 쓴 코드 볼수 있음
		Integer b = Integer.valueOf("10");
		System.out.println("a = "+ a);
		System.out.println("b=  "+ b);
		//(변경 이유)   -128부터 +127까지는 컴퓨터 기본 구조에서 사용하는 숫자(1byte)
		
		
		//int 가 좋은 상황예시
		//-덧셈 
		//인티저사용시 객체는 더할 수 없다..
		Integer c = Integer.sum(a, b);
		System.out.println("c=  "+ c);
		//인트사용시
		int v1 =10,v2 =10;
		int v3=v1+v2;
		System.out.println("c=  "+ c);
		
		//진법변환
		int n =100;
		StringBuffer buffer = new StringBuffer(); //StringBuffer 쓰는 이유 문자를 더할때
		for(int i=n; i>0; i/=2) {
			System.out.println(i%2);
			buffer.insert(0,i%2); //i를2로 나눈 나머지를 제일 앞(0)에 넣어라
		}
			System.out.println(buffer.toString());
			//이거 너무 번거롭다
			System.out.println(Integer.toBinaryString(n));//2진수 (binary)
			System.out.println(Integer.toOctalString(n)); //8진수(octal)
			System.out.println(Integer.toHexString(n)); //16진수(hex)
			
			//int는 간단한계산할 때 좋다
			//Integer은 복잡한계산할때 메소드를 불러서 할 수 있는 장점이 있다
			
			//요약: 간단한건 int, 복잡한건 integer
			
			//int 와 integer은 호환이 된다(하이브리드)
			Integer x = 10; // int ->Integer
			int y =x; //Integer -> int
			//쓰다가 복잡한건 integer을 사용해서 쓸 수 있다
			//결정적 둘의 차이점
			//(1) null (참조 대상이  없음)
			//int p = null;(error)
			Integer q = null; //ok
			
			//(2) 형태검사 또는 지정
			Object r =100;
			System.out.println( r instanceof String); //r의 데이터가 String 형태에요?
			//System.out.println(r instanceof int); //r의 데이터가 int 형태에요?(error)
			System.out.println(r instanceof Integer);
			
			
			
			
			
			
			
	}
}
