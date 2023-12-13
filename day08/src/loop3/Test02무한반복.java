package loop3;

import java.util.Random;

public class Test02무한반복 {
	public static void main(String[] args) {
		
		Random r = new Random(); //랜덤 도구 생성
		
		while(true) {
			//System.out.println("무한반복"); //끝나지를 않음 //종료할수있는 상태를 만들어야함
			int dice = r.nextInt(6) + 1;   //범위 1부터6까지 1부터6개
			System.out.println("주사위 = " + dice);
			
			if(dice == 5) {//주사위가 5가 나왔다면=주사위가 5가 나올때까지
				break;//그만둬
			}
		}
		
	}
}