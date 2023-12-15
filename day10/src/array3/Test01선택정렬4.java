
package array3;

public class Test01선택정렬4 {
	public static void main(String[]args) {
		//정렬이 빨리 끝나려면 안해도 되는 조건을 잘빼야함
		//낮은가격순 _오름차순, 높은가격순_내림차순, 
		//판매량순_내림차순 ,최신순_ 내림차순, 
		//선택정렬: 젤 작은거부터 맨앞으로 빼기 ||젤큰거를 뒤로 보내기
		
		int []numbers = new int [] {30,50,10,20,40};    // 참조형<-->원시형
		//세번째 회차에서 발생하는일
		//[2]부터[4]사이 에서 최소값의 위치를 찾아 [2]과 바꾼다
		
		int min =2; //[2] 이 가장 작은 값의 위치라고 치자
		for(int i=3; i <=4; i++) { // [2]부터[4] 사이의 범위에서
			if(numbers[min] > numbers[i]) { //내 생각 보다더 작은값이 있다면
				min =i;// 내 생각을 수정한다..
			}
		}
		 int backup =numbers[2];
		numbers[2] =numbers[min];
		numbers[min] =backup;
		
		
		for(int i=0; i <numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
	}
}
///for(int k=0; k<=3; k++){}
//라는 규칙을 찾음

