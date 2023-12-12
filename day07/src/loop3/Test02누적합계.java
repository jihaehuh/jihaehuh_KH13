/*
 * Test02누적합계
다음 누적합계를 구하세요

1부터 100 사이의 짝수 합계를 구하여 출력
1부터 100 사이의 7의 배수의 합계를 구하여 출력
 */
package loop3;

public class Test02누적합계 {
	public static void main(String[]args) {
		
		int total1 =0;
		int total2=0;
		
		for(int i =1; i <=100;i++) {
			if(i %2 ==0 ) { //짝수 구하기
				total1 += i;
			}
			}
		/*int sum = 0;

        for (int i = 2; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println("1부터 100까지의 짝수의 합계: " + sum);
        */
		
			for(int i =1; i <=100;i++) {
			if(i %7==0) {//7의 배수 구하기  
				total2 += i;
			}
		}
		System.out.println("짝수의 합계 = "+ total1 );
		System.out.println("7의 배수의 합계 = "+ total2 );
	}
}
