package api.lang.exception;

import java.util.Scanner;

public class Test04생년월일 {
	public static void main(String[] args) {
		//2023-12-28
		try{
		Scanner sc = new Scanner(System.in);
		System.out.println("생년월일 입력: ");
		String birth = sc.next();
		String year = birth.substring(0,4);
		System.out.println(year +"년");
		String month = birth.substring(5,7);
		System.out.println(month +"월");
		String day = birth.substring(8);//8부터끝까지라는 의미
		System.out.println(day +"일");
		}
		catch(Exception e) {
			System.out.println("프로그램 오류 발생 ");
		}
		
	}
}
//substring 말고 split 도 가능함

//강사님 풀이 1
/*package api.lang.exception;

public class Test04생년월일 {
	public static void main(String[] args) {

		//Plan A
		String input = "2023-12-28";

		String yearStr = input.substring(0, 4);
		String monthStr = input.substring(5, 7);
		String dayStr = input.substring(8);

		System.out.println("yearStr = " + yearStr);
		System.out.println("monthStr = " + monthStr);
		System.out.println("dayStr = " + dayStr);

	}
}
*/

//강사님 풀이 2
/*
package api.lang.exception;

public class Test04생년월일2 {
	public static void main(String[] args) {

		//Plan A
		String input = "2023-12-28";

		String yearStr = input.substring(0, 4);
		String monthStr = input.substring(5, 7);
		String dayStr = input.substring(8);

		int year = Integer.parseInt(yearStr);
		int month = Integer.parseInt(monthStr);
		int day = Integer.parseInt(dayStr);

		System.out.println("year = " + year);
		System.out.println("month = " + month);
		System.out.println("day = " + day);

	}
}
*/
//강사님 풀이 3
/*
package api.lang.exception;

import java.util.Scanner;

public class Test04생년월일4 {
	public static void main(String[] args) {

		try {
			//Plan A
			Scanner sc = new Scanner(System.in);
			System.out.print("생년월일 입력 : ");
			String input = sc.next();

			String yearStr = input.substring(0, 4);
			String monthStr = input.substring(5, 7);
			String dayStr = input.substring(8);

			int year = Integer.parseInt(yearStr);
			int month = Integer.parseInt(monthStr);
			int day = Integer.parseInt(dayStr);

			System.out.println("<출생일자>");
			System.out.println("출생년도 = " + year);
			System.out.println("출생월 = " + month);
			System.out.println("출생일 = " + day);
		}
		//catch(NumberFormatException e) {
		catch(Exception e) {
			System.err.println("입력 형식 오류");
		}

	}
}
*/
//강사님 풀이 4
/*
package api.lang.exception;

import java.util.Scanner;

public class Test04생년월일5 {
	public static void main(String[] args) {

		try {
			//Plan A
			Scanner sc = new Scanner(System.in);
			System.out.print("생년월일 입력 : ");
			String input = sc.next();

			String[] parts = input.split("-");

			int year = Integer.parseInt(parts[0]);
			int month = Integer.parseInt(parts[1]);
			int day = Integer.parseInt(parts[2]);

			System.out.println("<출생일자>");
			System.out.println("출생년도 = " + year);
			System.out.println("출생월 = " + month);
			System.out.println("출생일 = " + day);
		}
		//catch(NumberFormatException e) {
		catch(Exception e) {
			System.err.println("입력 형식 오류");
		}

	}
}
*/