/*
 * Test06점심메뉴추천기
사용자에게 5가지의 점심메뉴를 입력받아 배열에 저장한 뒤 무작위로 한 개를 골라 출력하도록 프로그램을 구현하세요

입력 : 자장면
입력 : 피자
입력 : 육개장
입력 : 회덮밥
입력 : 떡볶이

오늘은 "육개장"을 드시죠!
 */



package array;

import java.util.Random;
import java.util.Scanner;

public class Test06점심메뉴추천기 {
	public static void main(String[]args) {
		//음식 메뉴는 숫자가 아니라 문자열이라 String사용
		
		/*
		//String[] menue = new String[] { //음식 메뉴 5개 
				"피자","탕수육","구내식당","라면","떡볶이"   
		};
		System.out.println(menue[position]);
		*/
		//입력받는 코드로 다시써보면...
		Scanner sc =new Scanner(System.in);
		String[] menue = new String[5]; 
		for(int i =0;i<5;i++) {
			System.out.println("항목 입력: ");
			menue[i]=sc.next();
		}
		//menue[0] =sc.next();
		//menue[1] =sc.next();
		//menue[2] =sc.next();
		//menue[3] =sc.next();
		//menue[4] =sc.next();
		
		//랜덤
		//랜덤은 위치 하나만 추첨
		Random r = new Random();//도구생성
		int position =r.nextInt(menue.length); //어디에서 위치를 무작위로 뽑을지
		//System.out.println("position ="+position);
		
		//System.out.println(menue[position]);
		System.out.println("추첨 결과 :"+menue[position]); //어디서 추첨 결과를 가져올지 
		
		}
	}


