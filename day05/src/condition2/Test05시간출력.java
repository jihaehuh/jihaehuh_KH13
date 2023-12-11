/*
 * Test05시간출력
SNS에서는 작성한 글이 몇 초 전에 작성되었는지에 따라 다음과 같이 출력하도록 구성되어 있습니다.
사용자가 초를 입력하면 입력된 값에 따라 시간 정보를 출력해보세요

방금전 - 작성한지 10초가 되지 않은 글
?초전 -작성한지 10초이상 1분이 되지 않은 글
?분전 = 작성한지1분이상 1시간이 되지 않은 글
?시간전 = 작성한지 1시간이상 1일미만이 되지 않은 글
?일전 = 작성한지1일이상인 글
 */
/*
package condition2;

import java.util.Scanner;

public class Test05시간출력{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("초를 입력해주세요: ");
		int second= sc.nextInt();
		
		
		boolean sec =second <10;
		boolean sec2 = second<60;
		boolean minute = second < 60*60;
		boolean hour = second < 60*60*24;
		
		
		
		if(sec) {// 작성한지 10초가 되지않은 글 0초 이상 10초 미만
			System.out.println("방금 전 작성 되었습니다.");
		}
		else if(sec2) {//작성한지 10초 이상 60초 미만
			System.out.println(second+" 초 전 작성 되었습니다.");
		}
		else if(minute) {//작성한지 1분 이상 1시간 미만 
			System.out.println(second/60 + " 분 전 작성 되었습니다.");
		}
		else if(hour) {//작성한지 1시간 이상 1일 미만 
			System.out.println(second/60/60 + " 시간 전 작성 되었습니다.");
		}
		else {// 작성한지 1일 이상
			System.out.println("작성한지 1일 이상되었습니다.");
		}

	}
}	
*/
//강사님 풀이
package condition2;

import java.util.Scanner;

public class Test05시간출력{  //현재시각 - 작성시각 = 얼마나 지났는지   (가장 작은 단위는 초)
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		//입력
		System.out.println("초를 입력해주세요: ");
		int time= sc.nextInt();
		
		//계산
		
		//계산+출력
		String timeText;
		if(time <10) {
			timeText ="방금 전";
		}
		else if(time <60) {
			int second =time;
		timeText =second  +"분 전 ";
		}
		else if(time < 60*60) {
			int minute =time/60;
			timeText =minute +"분 전";
		}
		else if (time<24*60*60) {
			int hour =time/60/60;
			timeText =hour +"시간 전";
		}
		else {
			int day =time /24/60/60;
			timeText =day +"일 전 ";
		}
		//출력
		System.out.println("작성 시각 :"+timeText);
		
		
		
		
		
		
		
		
		
		
		
	}
}




















