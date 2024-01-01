package api.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test03출력형식지정 {
	public static void main(String[] args) {
		//Date 클래스는 SimpleDateFormat클래스를 이용해서 출력형식을 조정
		//Calendar 클래스는 없어서 Date로 변환해서 출력형식을 조정
		//LocalDate 클래스는 신규도구인 DateTimeFormatter를 사용(같은형식)
		
		LocalDate current = LocalDate.now();
		System.out.println(current);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("y년 M월 d일 E요일");
		System.out.println(current.format(fmt));
	}
}
