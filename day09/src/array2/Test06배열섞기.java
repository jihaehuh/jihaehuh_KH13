/*
 * Test06배열섞기
Test05와 동일한 데이터를 배열에 저장하고 다음 규칙에 따라 데이터를 섞어보세요

-실행할 때마다 다른 위치로 바뀌도록 섞고 싶음
-배열의 모든 자리가 1번은 반드시 바뀌어야함
-바뀌는 자리가 같은 자리여도 상관없음
-모든 자리가 교체된 후 배열을 출력
 */
package array2;

import java.util.Random;

public class Test06배열섞기 {
	public static void main(String[]args) {
			Random r =new Random();  //랜덤으로 돌리기
			
			
				//배열준비
				int []numbers = new int [] {30,50,20,10,40};
				
				for(int i =0;  i <4; i++) {  
					int number = r.nextInt(4);
					System.out.println("arr="+number); 	
			}
				int backup =numbers[0];
				numbers[0] =numbers[3];
				numbers[3] =backup;
				
				System.out.println(numbers[0]);
				System.out.println(numbers[1]);
				System.out.println(numbers[2]);
				System.out.println(numbers[3]);
				System.out.println(numbers[4]);
		}
	}

