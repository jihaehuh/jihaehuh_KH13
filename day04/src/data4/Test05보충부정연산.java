package data4;

public class Test05보충부정연산 {
	public static void main(String[]args) {
		// 배수란? b를a로 나눈 나머지가 0인경우  , b는 a의 배수라 부른다.
		int num =5;
		
		boolean even = num % 2 ==0;   // 짝수는 num을 2로나눈 나머지가 0 이냐?
		System.out.println("짝수 ?"+even );
		
		//boolean odd = num %2 ==1;
		boolean odd =num %2 !=0;
		
		
		//위 아래 다 묻지 않고도 답을 알 수 있는 방법 = 부정연산
		System.out.println("홀수 ?"+odd);
		System.out.println("홀수 ?"+!even ); //부정연산
		
	}
}
