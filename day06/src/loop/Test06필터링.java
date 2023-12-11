/*Test06필터링
1부터 99 사이의 숫자 중에서 5가 포함된 숫자들만 출력
*/
package loop;

public class Test06필터링 {
	public static void main(String[]args) {
		//1-99
		//for 와 if를 사용하여 필터링 _1-99 까지 5가 포함된수
		for(int i =1; i <=99; i ++) {
			//if(5가 포함된다면)
			//if (10의 자리에 5또는 1의 자리에 5)
			boolean ten = i / 10 == 5;
			boolean one = i % 10 == 5;
			if ( ten ||one) {
				System.out.println(i);
				}
			}
			//비추천_ 
			//_5-45
			//_50-59
			//_65-95
		/*
		for(int i=5;i <=45; i +=10) {
			System.out.println(i);
		}
		for(int i=50;i <=59; i ++) {
			System.out.println(i);
		}
		for(int i=65;i <=95; i +=10) {
			System.out.println(i);
		}
		*/
	}
}
