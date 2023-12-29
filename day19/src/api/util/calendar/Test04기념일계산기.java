package api.util.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test04기념일계산기 {
	public static void main(String[] args) {
		//사용자에게 문자열로  yyyy-MM-dd형식의 날짜를 받습니다
		//입력된 날짜를 기준으로 한 기념일을 계산하여 출력
		
		//사용자가 입력한 날짜 부터 계산한 100일을 더해서 구하여 출력
		String input ="2023-12-29";
		int year = Integer.parseInt(input.substring(0, 4));
		int month = Integer.parseInt(input.substring(5, 7));
		int day = Integer.parseInt(input.substring(8));
		
		
		Calendar c = Calendar.getInstance();
		//c.set(Calendar.YEAR, year);
		//c.set(Calendar.MONTH, month-1); //사용자 입력값에 -1 처리해야함
		//100일 
		//c.set(Calendar.DATE, day+100);
		//c.set(year,month-1, day+100); //한번에
		
		//이렇게 만드는 반복문은 안좋아
		/*
		for(int i =100; i <=2 *365; i +=100) {
			c.set(year,month-1, day+100);
		}
		*/
		//구해야 하는 날짜(더해야 하는 날짜)를 미리 저장
				int[] numbers = new int[] {
					100, 200, 300, 365+1, 400, 500, 
					600, 700, 730+1, 800, 900, 1000
				};

				for(int i=0; i < numbers.length; i++) {
					c.set(year, month-1, day + numbers[i]);

					//날짜 출력
					Date d = c.getTime();
					SimpleDateFormat fmt = new SimpleDateFormat("y년 M월 d일 E요일");

					if(numbers[i] % 100 == 0) {
						System.out.println(numbers[i]+"일 뒤 : " +fmt.format(d));
					}
					else {
						System.out.println(numbers[i]/365+"주년 : " + fmt.format(d));
					}
				}
				
	}
}
//[1] set()과 get()으로 풀기
		//int day = c.get(Calendar.DATE);
		//c.set(Calendar.DATE, day+100);
		
		//[2] add()로 풀기 
		//c.add(Calendar.DATE, 100);

/*
package api.util.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test04기념일계산기 {
	public static void main(String[] args) {

		//오늘부터 계산한 1주년을 구하여 출력
		Calendar c = Calendar.getInstance();

		//[1] set() 과 get()으로 풀기
		int day = c.get(Calendar.DATE);
		c.set(Calendar.DATE, day + 100);

		//날짜 출력
		Date d = c.getTime();
		SimpleDateFormat fmt = new SimpleDateFormat("y년 M월 d일 E요일");
		System.out.println(fmt.format(d));
	}
}
*/

/*
 * package api.util.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test04기념일계산기2 {
	public static void main(String[] args) {

		//오늘부터 계산한 1주년을 구하여 출력
		Calendar c = Calendar.getInstance();

		//[2] add() 로 풀기
		c.add(Calendar.DATE, 100);

		//날짜 출력
		Date d = c.getTime();
		SimpleDateFormat fmt = new SimpleDateFormat("y년 M월 d일 E요일");
		System.out.println(fmt.format(d));
	}
}
 */

/*
 * package api.util.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test04기념일계산기3 {
	public static void main(String[] args) {

		//사용자가 입력한 날짜부터 100일 뒤를 구하여 출력
		String input = "2023-12-29";
		int year = Integer.parseInt(input.substring(0, 4));
		int month = Integer.parseInt(input.substring(5, 7));
		int day = Integer.parseInt(input.substring(8));

		Calendar c = Calendar.getInstance();
		//c.set(Calendar.YEAR, year);
		//c.set(Calendar.MONTH, month-1);//사용자 입력값에 -1 처리 해야함
		//c.set(Calendar.DATE, day + 100);
		c.set(year, month-1, day + 100);

		//날짜 출력
		Date d = c.getTime();
		SimpleDateFormat fmt = new SimpleDateFormat("y년 M월 d일 E요일");
		System.out.println(fmt.format(d));
	}
}
 */

/*
 * package api.util.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test04기념일계산기4 {
	public static void main(String[] args) {
		//입력한 날짜부터 100일 간격으로 출력
		String input = "2023-12-29";
		int year = Integer.parseInt(input.substring(0, 4));
		int month = Integer.parseInt(input.substring(5, 7));
		int day = Integer.parseInt(input.substring(8));

		Calendar c = Calendar.getInstance();

		for(int i=100; i <= 2 * 365; i += 100) {
			c.set(year, month-1, day + i);

			//날짜 출력
			Date d = c.getTime();
			SimpleDateFormat fmt = new SimpleDateFormat("y년 M월 d일 E요일");
			System.out.println(i+"일 뒤 : " +fmt.format(d));
		}

	}
}
 */
















