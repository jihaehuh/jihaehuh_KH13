package loop;

public class test01반복문 {	
	public static void main(String[]args) {
		//(Q)화면에 Hello Java를 5번 출력하세요
		
		
		//반복을 위해서는 변수가 하나 필요하다 (반복수, 반복 변수)
		//-반복수를 변화시켜 원하는 만큼의 횟수를 만든다
		for(int i=1; i <=5; i =i+1 ) { //i는 변수의 이름; 5까지 ;계속1번씩 실행해라
		// 선언부 //조건부 //증감부
		//ex) 1000번 실행해라 _ i =1;i <=1000,i =i+1;
			System.out.println("Hello Java");
		}
		
	}
}
