//(Q)어제 복습한 시간은 총 2시간 45분이고
//오늘 복습한 시간은 총 3시간 35분입니다.
//이틀동안 공부한 시간은 총 몇시간 몇분인가요?
//(hint 가장 작은 단위로 풀어야 한다)

//내 풀이 
package data;

public class Test06복습시간계산 {
	public static void main(String[]args) {
		//입력 부분   -어제 ,오늘 시간/분 값
 		int YdHour =2, YdMinute = 45;				//YdHour = 어제 공부한 시간단위 //YdMinute = 어제 공부한 분 단위
		int TdHour =3, TdMinute =35;						//TdHour =오늘 공부한 시간 단위//TdMinute = 오늘 공부한 분 단위
				
		
		//계산 부분 (중간중간 출력값을 확인해도 좋음)
		int Yd =YdHour*60+YdMinute;   			//어제 공부 시간
		//System.out.println(Yd);
		int Td = TdHour*60 +TdMinute;			//오늘 공부 시간
		//System.out.println(Td);
		
		int TotalH = (Yd + Td )/60; 		//총 공부 시간 단위
		int TotalM= (Yd + Td )%60;		//총 공부 분 단위
		
		//출력 부분  -  문제에서 요구하는 값을 화면에 출력
		
		System.out.println(TotalH +"시간"+ TotalM+"분");
		
	}
}





//강사님 풀이 1
/*package data;

public class Test06복습시간계산 {
	public static void main(String[] args) {
		//입력
		int yesterdayHour = 2, yesterdayMinute = 45;
		int todayHour = 3 , todayMinute = 35;

		//계산
		int yesterdayTotal = yesterdayHour * 60 + yesterdayMinute;
		int todayTotal = todayHour * 60 + todayMinute;

		int total = yesterdayTotal + todayTotal;

		int hour = total / 60;
		int minute = total % 60;

		//출력
		System.out.println(hour);
		System.out.println(minute);

	}
}*/


//강사님 풀이2
/*package data;

public class Test06복습시간계산 {
	public static void main(String[] args) {
		//입력
		int yesterdayHour = 2, yesterdayMinute = 45;
		int todayHour = 3 , todayMinute = 35;

		//계산 - 시간 따로 분 따로
		int minuteTotal = yesterdayMinute + todayMinute;
		int hour = yesterdayHour + todayHour + minuteTotal / 60;
		int minute = minuteTotal % 60;		

		//출력
		System.out.println(hour);
		System.out.println(minute);

	}
}*/