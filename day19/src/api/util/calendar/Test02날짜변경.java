package api.util.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test02날짜변경 {
	public static void main(String[] args) {
		
				Calendar c = Calendar.getInstance();
				
				//시간 변경 -.set()
				//c.set(항목,값);
				c.set(Calendar.YEAR, 2024);  //alendar.YEAR (상수)은 1이라고 정해놨음 //연도는 4자리로 설정
				c.set(Calendar.MONTH, 0);		//int java.util.Calendar.MONTH : 2 [0x2]  2라고 저장되어있음 //월은 0부터11일 로 설정
				//캘린더는 다 좋은데 월 설정이 불편하다
				c.set(Calendar.DATE, /*-1 (말도 안되는 날짜를 넣어도 알아서 설정해준다*/1); //int java.util.Calendar.DATE : 5 [0x5]  5로 설정//일은 date도 괜찮고 day of month도 가능
				//시간계산을 쉽게 도와주는게 Calendar이다.
				
				//시간 출력
				Date d = c.getTime();
				SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				System.out.println(fmt.format(d));
			
	}
}
