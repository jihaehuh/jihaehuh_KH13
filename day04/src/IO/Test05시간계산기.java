/*
 * Test05시간계산기
사용자에게 강의장 입실시각과 퇴실시각을 4자리 정수로 입력받아 수업에 참여한 시간을 계산하여 출력하는 프로그램을 구현

입실시각 입력 : 0925
퇴실시각 입력 : 1827

수업에 참여한 시간은 총 9시간 2분입니다.
 */


/*
package IO;

import java.util.Scanner;

public class Test05시간계산기 {
	public static void main(String[]args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("입실시간을 입력: ");
		int inH,inM=sc.nextInt();;
		
		System.out.println("퇴실시간을 입력:. ");
		int outH,outM =sc.nextInt();
		
		
		int time = outH-inH;
		int minute =outM-inM;
		System.out.println("총"+ time +"시간"+minute+"분");
		
		
		
		
		
		
	}
}
*/
package IO;

import java.util.Scanner;

public class Test05시간계산기 {
	public static void main(String[]args) {
		
		Scanner sc =new Scanner(System.in);
		
		//입력
		System.out.println("입실시간을 입력: ");
		int in =sc.nextInt();
		System.out.println("퇴실시간을 입력:. ");
		int out =sc.nextInt();
		//nt in =925;
		//int out= 1827;
		
		//계산
		int inHour = in /100;
		int inMinute = in%100;
		int outHour = out /100;
		int outMinute = out %100;
		
		
		int inTime = inHour * 60 + inMinute;
		int outTime = outHour * 60 + outMinute;
		int totalTime =outTime-inTime;
		int hour=totalTime /60;
		int minute=totalTime %60;
		
		
		System.out.println("수업에 참여한 시각은 총"+hour+"시간"+minute+"분입니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}














