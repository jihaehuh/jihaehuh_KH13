package array3;

public class Test01선택정렬 {
	public static void main(String[]args) {
		//정렬이 빨리 끝나려면 안해도 되는 조건을 잘빼야함
		//낮은가격순 _오름차순, 높은가격순_내림차순, 
		//판매량순_내림차순 ,최신순_ 내림차순, 
		//선택정렬: 젤 작은거부터 맨앞으로 빼기 ||젤큰거를 뒤로 보내기
		
		int []numbers = new int [] {30,50,10,20,40};    // 참조형<-->원시형
		//30 >50 >10 
		//10 이 더 작지만 끝까지 한번 가기 20, 40 
		//30이랑 10 자리 바꿈
		
		//30이랑 50 비교
		for (int i= 0; i < numbers.length; i++)
		if( numbers[0] >numbers[i] ) {
			int backup =numbers[0];
			numbers[0] =numbers[i];
			numbers[i] =backup;
			}
		else if( numbers[1] >numbers[i] ) {
			int backup =numbers[1];
			numbers[1] =numbers[i];
			numbers[i] =backup;
			}
		else {
			int backup =numbers[3];
			numbers[3] =numbers[i];
			numbers[i] =backup;
			
		}
		
		for(int i=0; i <numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
	}
}
