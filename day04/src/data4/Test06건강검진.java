/*

Test06건강검진
건강검진은 30세 이상인 사람들을 대상으로 2년에 한 번씩 진행합니다.

올해가 짝수 해라면 짝수년도 출생자들이 대상
올해가 홀수 해라면 홀수년도 출생자들이 대상

어떤 사람의 출생년도(ex : 1985)를 입력값으로 두고 이 사람이 올해 
건강검진 대상자인지 판정하여 출력
*/

/*
package data4;

public class Test06건강검진 {
	public static void main(String[]args) {
		int CurrentYear =2023;
		int ageYear =2000;
		
		
		
		
		boolean myAge = CurrentYear - ageYear+1 >=30;
		boolean evenYear = ageYear%2 ==0;
		boolean oddYear =ageYear%1 == 1;
		boolean healthcare = evenYear && oddYear;
	
		
		
		System.out.println("30살 이상인가요?"+myAge );
		System.out.println("올해는 짝수연도 인가요?"+evenYear );
		System.out.println("올해는 홀수연도 인가요?"+oddYear );
		System.out.println("올해는 건강검진 받는 해인가요?"+healthcare );
	}
}
*/
//강사님 풀이
package data4;

public class Test06건강검진 {
	public static void main(String[]args) {
		//입력 
		int birth = 1985;
		int current = 2023;
		
		//계산
		/*
		 * [1] 30세 이상인가?
		 * [2] 올해가 짝수이고 출생년도도 짝수인가?
		 * [3] 올해가 홀수이고 출생년도도 홀수인가?
		 * 
		 *[1][2] 만족 또는 [1][3] 만족 하면 건강검진 대상자
		*/
		int age = current-birth +1;
		
		
		boolean first = age >=30;                         //30세 이상; 
		boolean second = current %2 ==0 && birth %2 ==0;   //올해가 짝수 && 출생년도도 짝수;
		boolean third =current %2 !=0 && birth %2 !=0 ;        //올해가 홀수&& 출생년도도 홀수;
		//boolean third =current %2==1 && birth %2 ==1 ; 위 식과 같음
		boolean result = (first && second ) || (first &&third);
	
		//출력
		System.out.println("나이는 ?"+age +"세" );
		System.out.println("30세 이상?"+first  );
		System.out.println("올해는 짝수 대상자 ?"+second );
		System.out.println("올해는 홀수 대상자?"+third );
		System.out.println("건강검진 대상자?"+result );
		
		
		
		
		
		
		
		
	}
}












