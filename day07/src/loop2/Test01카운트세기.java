package loop2;

public class Test01카운트세기 {
	public static void main(String[]args) {
		//(Q)1부터 100사이의 짝수 개수 -(A)50개
		//1. 1부터 100사이의 범위만들기 (for 사용)
		//2. 조건을 추가하여 짝수만을 출력하도록 구문을 만든다.
		//3. 2번에서 만든영역에 대한 개수를 카운트
		
		//변수로 카운트 할 수 있다.
		int count =0;  //count++ _count 1씩 증가 //반복시작 전에 준비 시키기
		
		
		for(int i=1; i<=100; i++) {//1
			if(i %2 ==0) {//2  i를 2로 나눴을 때 나머지는 0
				//System.out.println(i);
				count++;
			}
		}
				System.out.println("짝수개수 = "+ count); //최종 결과
		
	}
}
