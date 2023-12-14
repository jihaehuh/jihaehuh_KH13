package array;

import java.util.Scanner;

public class Test05배열입력3 {
	public static void main(String[]args) {
		//int[]numbers =new int[] {10,20,30,40,50};//데이터가 정해져있다면
		
	
		Scanner sc =new Scanner(System.in);
		
		int[ ] numbers =new int[ 5];   //데이터가 정해지지않은 경우
				//numbers -----[ 0 ] [ 0 ][ 0 ][ 0 ][ 0 ]
	//numbers =10; //안되는 코드
		
		// numbers =sc.nextInt(); //안되는 코드
		System.out.println("입력:" );
		numbers[0] =sc.nextInt();
		System.out.println("입력:" );
		numbers[1] =sc.nextInt();
		System.out.println("입력:" );
		numbers[2] =sc.nextInt();
		System.out.println("입력:" );
		numbers[3] =sc.nextInt();
		System.out.println("입력:" );
		numbers[4] =sc.nextInt();
		
		for (int i =0; i<numbers.length;i++) {
			System.out.println(numbers[i]);
			
		}
	}
}
