/*
 Test05PC방계산기
KH PC방은 다음과 같이 운영하고 있습니다.

요금은 1시간당 1000원
분단위로 요금 부과
단, 10원단위까지만 돈을 받는다

예를 들어서 4분동안 게임을 했다면 66.6666원이 실제 요금이 되지만 60원만 받습니다.
고객이 12시 20분부터 15시 30분까지 게임을 했을 때 예상 요금을 구하여 출력하세요.
 */







package data2;

public class Test05PC방계산 {
	public static void main(String[]args) {
		// 입력
				//int startHour = 12, startMinute = 20;
				int in =1220;
				//int finishHour =15,finishMinute =30;
				int out =1530;
				//int hour=1000;
				//float perPrice= 1000/60f;
				int unitPrice = 1000;
			//계산
				/*int start = startHour*60+ startMinute;
				System.out.println(start);
				int finish=finishHour*60+finishMinute;
				System.out.println(finish);
				
				int time =finish-start;
				System.out.println(time);
				*/
				
				int inHour = in /100;
				int inMinute = in %100;
				int outHour=out/100;
				int outMinute =out%100;
				
				int intime =inHour *60 +inMinute;
				int outTime =outHour *60 +outMinute;
				
				int time =outTime -intime;
				//System.out.println(time);
		
				int hour = time /60;
				int minute =time%60;
				
				//분당요금 
				//double minutePrice =unitPrice /60.0;
				//double minutePrice =unitPrice /60d;
				double minutePrice =(double)unitPrice /60;
				
				int result =(int) (time*minutePrice);
				result =result/10*10;
				//int realResult =(int)(result/10*10);
			//출력
				
				System.out.println(hour);
				System.out.println(minute);
				System.out.println(result);
				//System.out.println(realResult);
				
				
				// 10원 단위 빼고 받는 방법 
				//10개씩 묶임 => 나누기 10이 들어감
			
				
	}
}
