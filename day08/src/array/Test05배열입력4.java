package array;

import java.util.Scanner;

public class Test05배열입력4 {
	public static void main(String[]args) {
		//int[]numbers =new int[] {10,20,30,40,50};//데이터가 정해져있다면
		
	
		Scanner sc =new Scanner(System.in);
		
		int[ ] numbers =new int[ 5];   //데이터가 정해지지않은 경우
				//numbers -----[ 0 ] [ 0 ][ 0 ][ 0 ][ 0 ]
		//numbers =10; //안되는 코드
		
		//반복문으로 만들면?
		//배열은 한 작업당 한 반복문으로 사용한다
		for(int i =0; i <numbers.length;i++) {
			System.out.println("입력:" );  
			numbers[i] =sc.nextInt();
		}
		
		//입력과 출력을 같이 쓰려고 하지마라 
		
		
		
		// numbers =sc.nextInt(); //안되는 코드
		/*System.out.println("입력:" );
		numbers[0] =sc.nextInt();
		System.out.println("입력:" );
		numbers[1] =sc.nextInt();
		System.out.println("입력:" );
		numbers[2] =sc.nextInt();
		System.out.println("입력:" );
		numbers[3] =sc.nextInt();
		System.out.println("입력:" );
		numbers[4] =sc.nextInt();
		*/
		
		for (int i =0; i<numbers.length;i++) {
			System.out.println(numbers[i]);
			
		}
	}
}
