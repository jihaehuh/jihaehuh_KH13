/*
 * Test07확률뽑기
다음과 같은 아이템 추첨 확률이 주어졌을 때, 실행하면 확률에 맞게 무작위로 하나의 항목이 추첨되도록 구현

금 상자 : 10%
은 상자 : 20%
철 상자 : 70%
 */
package array;

import java.util.Random;

public class Test07확률뽑기 {
	public static void main(String[]args) {
		
		String[]items =new String[] {
				//"금상자","은상자","철상자","철상자","철상자","철상자"
				//,"철상자","철상자","철상자"
				"금상자","은상자","철상자"    //금:0 은:1 철:2
		};
		
		int gold =10;
		int silver=20;
		
		
		Random r =new Random();
		//int  p =r.nextInt(10)+0;  //0부터 10개
		//int p =r.nextInt(items.length);
		int p =r.nextInt(100); //아예 100개 뽑기 0부터 99
		System.out.println("P = "+p);
		
		int p2;
		if(p <gold) {//금p ==0    //0부터 9까지는 금 
			p2=0;
		}
		else if(p < gold+silver) {//은   p== 1 || p ==2   10부터 29까지는 은
			p2 =1;
		}
		else {//철   30부터 99까지는 철
			p2=2;
		}
		System.out.println("p2 = "+p2);  
		
		System.out.println("추첨 결과 = "+items[p2]);
				
	}
}
