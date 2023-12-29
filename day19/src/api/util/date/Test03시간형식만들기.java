package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03시간형식만들기 {
	public static void main(String[] args) {
		
		
		
		Date Time = new Date();
		SimpleDateFormat fmt1 = new SimpleDateFormat("y년M월d일");
		SimpleDateFormat fmt2 = new SimpleDateFormat("a h시 m분");
		SimpleDateFormat fmt3 = new SimpleDateFormat("H :mm:ss"); //H는 하나여도 두개여도 괜찮다
		SimpleDateFormat fmt4 = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");//요일은 day of week
		
		System.out.println(fmt1.format(Time));
		System.out.println(fmt2.format(Time));
		System.out.println(fmt3.format(Time));
		System.out.println(fmt4.format(Time));
		//2023년 7월 11일
		//오후 1시 5분
		//13:05:30
		//2023-07-11 화 13:05:30
	}
}
