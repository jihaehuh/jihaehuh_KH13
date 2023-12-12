/*
 * Test03다이어트
오늘부터 다이어트를 위해 줄넘기를 하려고 합니다.
첫날은 힘드니까 100개만 하고 다음날부터는 전날보다
 10개씩 더 하려고 합니다.

30일동안 하게되는 일자별 줄넘기 개수 출력
30일동안 하게되는 총 줄넘기 개수 출력
 */
/*
package loop3;

public class Test03 {
	public static void main(String[]args) {
		
		int value =100;
		int repeat =10;
		int count =100;//아예 처음부터 숫자를 100으로 시작해서 하기
	
		for (int i =1; i <=30; i++) {
			//int count = value +(i *repeat);
			System.out.println(count);
		}
		
	}
}
*/

//강사님 풀이
package loop3;

public class Test03다이어트 {
	public static void main(String[]args) {
		//줄넘기 기준
		//for(int i=100; i <=390; i+=10) {
			//System.out.println(i);
		//}
		//일자 기준-풀긴했지만 식이 길고 찝찝함
		
		//int begin =100;
		//int step =10;
		//for(int day =1; day <=30; day++) {
			//int count =day * step +begin-10;
			//System.out.println(day+"일 차 :"+count+"개 ");
		//}
		//위의 식과 같은 값이지만 계산과정은 훨씬 쉬워짐
		int count =100;
		int step =10;
		int total =0; 
		//참고 _ 반복변수는 한개가 아니어도 된다. 
		for(int day =1; day <=30; day++) {
		// for(int day =1; count =100; day <=30; day++,count +=step) 
			System.out.println(day+"일 차 :"+count+"개 ");
			//count+=10;
			//2번 문제 (총합)
			total +=count;
			count += step;
		}
		System.out.println("총 개수 : " + total+"개 ");
	}
}
