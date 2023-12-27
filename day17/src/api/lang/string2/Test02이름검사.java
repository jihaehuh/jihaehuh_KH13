package api.lang.string2;

import java.util.Scanner;

public class Test02이름검사 {
	public static void main(String[] args) {
		
		
		 Scanner sc = new Scanner(System.in);
	     System.out.println("한국 이름을 입력하세요:");

		  String name = sc.nextLine();
		  
		  //regex 는 regular Expression 텍스트를 검색, 매치, 대체하는 데 사용되는 패턴의 표현 방식
		   String regex ="^[가-힣]{1,2}[가-힣]{1,5}$";//이름 검사식
		  //String regex ="^[가-힣]{2,7}$"; //비추천
		   //참고: 낱자까지 모두 검사하고 싶다면 ^[ㄱ-ㅎ ㅏ-| 가 -힣]{2,7}$
		  
		   
		   if (name.matches(regex)) {
			   System.out.println("멋진 한국 이름입니다");
		   }
		   else {
			   System.out.println("올바른 한국이름이 아닙니다");
		   }
		
	}
}
