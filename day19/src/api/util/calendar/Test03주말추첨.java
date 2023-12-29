package api.util.calendar;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Test03주말추첨 {
	public static void main(String[] args) {
		//주말은 나중에 고민하기
		//우선 2024년 중 하루를 요일 관계없이 추첨
		Random r = new Random();
	//	int day = r.nextInt(365);;
		
		//날짜설정 -set
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, 2024);  //연도는 4자리
		c.set(Calendar.MONTH,0);  		//월은 0 부터 11일
		//c.set(Calendar.DATE,1+day);
		
		//정보확인 - get
		int year = c.get(Calendar.YEAR);
		//int week = c.get(Calendar.DAY_OF_WEEK); //요일
		//System.out.println("Week = "+week); //일요일은 숫자로 1, 토욜은 숫자로 7
		
		//결론 : 반복문으로 요일 돌리기
		while(true) {
			int day = r.nextInt(365);
			c.set(Calendar.DATE,1+day);
			
			int week = c.get(Calendar.DAY_OF_WEEK); 
			if(week ==1 || week == 7) break;
		}
		
		//시간 출력
		Date d = c.getTime();
		SimpleDateFormat fmt = new SimpleDateFormat("y년M월d일 E요일");
		System.out.println(fmt.format(d));
	}
}
