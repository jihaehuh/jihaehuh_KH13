/*
 * Test03다이어트
오늘부터 다이어트를 위해 줄넘기를 하려고 합니다.
첫날은 힘드니까 100개만 하고 다음날부터는 전날보다 10개씩 더 하려고 합니다.

30일동안 하게되는 일자별 줄넘기 개수 출력
30일동안 하게되는 총 줄넘기 개수 출력
 */
package loop3;

public class Test03 {
	public static void main(String[]args) {
		
		for (int i =0; i <=29; i++) {
			int total = 100 +(i *10);
			System.out.println(total);
		}
	}
}
