package array3;

public class Test02버블정렬 {
	public static void main(String[]args) {
		//버블은 두개씩 비교한다
		//두개 이외의 것들도 조금씩 앞으로 오는 변화가 생긴다.
		// 두개 두개 두개 1개 _ 100개를 비교하게되면 99번까지 비교
		int [] numbers = new int [] {30,50,20,10,40};
		//int [] numbers = new int[]{50,30,20,10,40};
		
		//버블 정렬(bubble sort) - 인접한 두개의 값을 비교하여 교체하는 방식
		//1회차 0:1 1:2 2:3 3:4      
		//2회차 0:1 1:2 2:3
		//3회차 0:1 1:2
		//4회차 0:1 
		
		for(int k= numbers.length-1 ; k >=1 ;k--) {   //k가 왜 4부터인가? 
		
		//1회차 - 1부터 4까지 증가 시키며 i 와 i-1을 비교
		for (int i =1; i <=4; i++) {
			System.out.println("K= "+k + ",i = "+ i + ",(i-1) = "+( i-1));
			if(numbers[i-1] > numbers [i]) {
				int backup =numbers[i-1];
				numbers[i-1] = numbers[i];
				numbers[i] =backup;
				}
			}
		}
		/*//2회차- 1부터 3까지 증가 시키며 i 와 i-1을 비교
		for (int i =1; i <=3; i++) {
			if(numbers[i-1] > numbers [i]) {
				int backup =numbers[i-1];
				numbers[i-1] = numbers[i];
				numbers[i] =backup;
			}
		}
			//3회차- 1부터 2까지 증가 시키며 i 와 i-1을 비교
			for (int i =1; i <=2; i++) {
				if(numbers[i-1] > numbers [i]) {
					int backup =numbers[i-1];
					numbers[i-1] = numbers[i];
					numbers[i] =backup;
				}
			}
			//4회차- 1부터 1까지 증가 시키며 i 와 i-1을 비교
			for (int i =1; i <=1; i++) {
				if(numbers[i-1] > numbers [i]) {
					int backup =numbers[i-1];
					numbers[i-1] = numbers[i];
					numbers[i] =backup;
				}
			}
		*/
		for(int i=0; i <numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
			
	