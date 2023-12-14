package array;

import java.util.Scanner;

public class Test05배열입력 {
	public static void main(String[]args) {
		int[]numbers =new int[] {10,20,30,40,50};
		Scanner sc =new Scanner(System.in);
		int[ ] numbers1 =new int[ ] {
				sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),
		};
		
		for (int i =0; i<numbers1.length;i++) {
			System.out.println(numbers1[i]);
			
		}
	}
}
