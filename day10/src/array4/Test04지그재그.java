/*
 * Test04지그재그
5x5 배열을 만들고 숫자를 다음과 같이 지그재그로 배치하고 출력하세요
	i	0	  1	    2    3   	4
k  	0	 1    2    3    4    5
	1 	10    9    8    7    6
	2	11    12    13    14    15
	3	20    19    18    17    16
	4	21    22    23    24    25
 */
/*
 package array4;

public class Test04지그재그 {
	public static void main(String[] args) {

		//배열 준비
		int[][] map = new int[5][5];

		//데이터 초기화

		//배열 출력
		for(int i=0; i < map.length; i++) {
			for(int k=0; k < map[i].length; k++) {
				System.out.print(map[i][k]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
*/
/*
package array4;

public class Test04지그재그 {
	public static void main(String[] args) {

		//배열 준비
		int[][] map = new int[5][5];

		//데이터 초기화 - 위치 기준
		int number = 1;
		for(int i=0; i < map.length; i++) {
			if(i % 2 == 0) {//짝수 위치일 때(정방향)
				for(int k=0; k < map[i].length; k++) {
					map[i][k] = number++;
				}
			}
			else {//홀수 위치일 때(역방향)
				for(int k=map[i].length-1; k >= 0; k--) {
					map[i][k] = number++;
				}
			}
		}

		//배열 출력
		for(int i=0; i < map.length; i++) {
			for(int k=0; k < map[i].length; k++) {
				System.out.print(map[i][k]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
*/
package array4;

public class Test04지그재그 {
	public static void main(String[] args) {

		//배열 준비
		int[][] map = new int[5][5];

		//데이터 초기화 - 위치 기준
		int number = 1;
		for(int i=0; i < map.length; i++) {
			for(int k=0; k < map[i].length; k++) {
				if(i % 2 == 0) {//짝수 위치일 때(정방향)
					map[i][k] = number++;
				}
				else {//홀수 위치일 때(역방향)
					//map[i][4-k] = number++;
					map[i][map[i].length - 1 - k] = number++;
				}
			}
		}

		//배열 출력
		for(int i=0; i < map.length; i++) {
			for(int k=0; k < map[i].length; k++) {
				System.out.print(map[i][k]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}