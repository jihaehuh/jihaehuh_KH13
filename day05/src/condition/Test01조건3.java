package condition;

public class Test01조건3 {
	public static void main(String[]args) {
		//홀수 짝수 판정 프로그램
		//-주어진 값이 홀수라면 "홀수입니다."출력
		//-주어진 값이 짝수라면 "짝수입니다."출력
		
		//입력
		int number =123;
		
		//계산
		boolean odd= number %2 !=0;
		
		//출력   - 논리에서는 true라는 말은 당연한거라서 필요없다.  .
		if(odd) {   //==true 는 지워도 된다
			System.out.println("홀수입니다.");
		}
		if(!odd) {   // != 는 !를 앞에 붙여서 false를 나타내준다.
			System.out.println("짝수입니다.");
		}
		
		//System.out.println("홀수입니다."); 
		//number 가 홀수라면 2로 나눈 나머지가 1 -odd가 true 일때
		
		//System.out.println("짝수입니다."); 
		//number 가 짝수라면 2 로 나눈 나머지가 0
		
	}
}
