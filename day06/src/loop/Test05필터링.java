/*
 * Test05필터링
다음 숫자를 화면에 출력해보세요
1부터 20 사이의 홀수
1부터 50 사이의 3의배수
 */
/*
 package loop;
 

public class Test05필터링 {
	public static void main(String[]args) {
		//1부터 20 사이의 홀수
		for(int odd =1; odd <=20; odd+=2) {
			System.out.println(odd);
		}
		//1부터 50 사이의 3의 배수
		/*for(int i =1; i <=50; i=3*num) {
			int num =num+1;
			System.out.println(i);
		}
		
		
	}
}
*////

 package loop;
 

public class Test05필터링 {
	public static void main(String[]args) {
		//1부터 20 사이의 홀수  _1-19 까지 이고, 2씩 커진다.
		//_1,3,5,7,9,11,13,15,17,19
		/*
		for(int i=1;i<=19;i+=2) {
		System.out.println(i);
		}
		*/
		for(int i=1; i<=20;i=i+1) {
			if(i % 2 ==1 ){//i가 홀수면_ 홀수는 나머지가 1 )
			System.out.println(i);
			}
		}
		//1부터 50 사이의 3의 배수 _3부터 48까지 ,3씩 증가
		//_3,6,9,12,15...45,48
		/*
		for(int i=3; i<=48; i+=3) {
			System.out.println(i);
		}
		*/
		for(int i=1;i<=50;i=i+1) {
			if(i % 3 == 0) {//i가 3의 배수라면  _배수는 나머지가 0
				System.out.println(i);
			}
		}	
	}
}







