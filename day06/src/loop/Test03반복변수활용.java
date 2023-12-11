package loop;

public class Test03반복변수활용 {
	public static void main(String[]args) {
		//(Q) Hello Java 1 부터 Hello Java 10까지 출력하세요
		//숫자 1부터 10이하까지 출력이라는 범위가 생김
		for(int i =1; i <=10 ; i=1+i) {
			//for 내에서는 반복에 사용한 변수 i를 쓸 수 있다.
			//따로 변수를 사용하지 않아도 괜찮다.
			System.out.println("HelloJava"+i);
		}
	}
}
