/*
 * Test05배열뒤집기
30, 50, 20, 10, 40을 배열에 저장하고 이 배열의 모든 
데이터의 위치를 반대로 뒤집은 뒤 출력하세요
 */

/*
package array2;

public class Test05배열뒤집기 {
	public static void main(String[]args) {
		//배열준비
				int []numbers = new int [] {30,50,20,10,40};
				
				//-변수를 하나 더 만들어서 백업할 자리를 만들어줌
				int backup =numbers[0];
				numbers[0] =numbers[4];
				numbers[4] =backup;
				
				int backup2 =numbers[1];
				numbers[1] =numbers[3];
				numbers[3] = backup2;
				
				System.out.println(numbers[0]);
				System.out.println(numbers[1]);
				System.out.println(numbers[2]);
				System.out.println(numbers[3]);
				System.out.println(numbers[4]);
	}
}
*/
package array2;

public class Test05배열뒤집기 {
	public static void main(String[]args) {
		//배열준비
				int []numbers = new int [] {30,50,20,10,40};
				
		//위치교체
				//1. numbers[0] 과 numbers[4]를 바꾼다
				//2. numbers[1] 과 numbers[3]을 바꾼다
				/*
				int backup =numbers[0];
				numbers[0] =numbers[4];
				numbers[4] =backup;
				
				backup =numbers[1];
				numbers[1] =numbers[3];
				numbers[3] =backup;;
				
				*/
				//데이터 1개 [30]                교체0번
				//데이터 2개[30,50]			교체1번		numbers [0] <--> numbers[1]
				//데이터3개[30,50,20]			교체1번		numbers [0] <--> numbers[2]
				
				//데이터4개[30,50,20,10]	교체2번		numbers [0] <--> numbers[3], 
																		//numbers [1] <--> numbers[2]
				
				//데이터 5개 [30,50,20,10,40]교체2번	numbers [0] <--> numbers[4], 
																		//numbers [1] <--> numbers[3]
				
				//데이터 n개      교체는 n/2번       numbers [0] <--> numbers[n-1], 
															//numbers [1] <--> numbers[n-2]
				
				int left =0;  //처음 위치
				int right = numbers.length -1; //마지막 위치
				//for(int i= 0; i <=데이터개수/2; i++) {
				for(int i= 1; i <=numbers.length /2; i++) {
					//left위치와 right 위치를 바꾸면 된다.
					int backup =numbers[left];
					numbers[left] =numbers[right];
					numbers[right] =backup;
					
					//다음 턴을 위해서 left는 1 증가
					//right은 1감소 처리
				}
				
				
				for(int i =0; i < numbers.length ; i++) {
					System.out.println(numbers[i]);
					
				}
	}
}