/*api.time.Test02기간구하기
사용자에게 YYYY-MM-DD 형태로 두 개의 날짜를 입력받아서 두 날짜의 차이를 구하여 화면에 출력

요구사항
반드시 먼저 입력한 날짜가 나중에 입력한 날짜보다 이전이어야 합니다
그렇지 않을 경우 차이를 계산할 수 없습니다 메세지를 출력
차이는 ?년 ?개월 ?일 형태로 출력해주세요
*/



package api.time;

import java.time.LocalDate;
import java.time.Period;

public class Test02기간구하기 {
	public static void main(String[] args) {
		
		String str1 ="2023-05-08";
		String str2 ="2024-01-01";
		
		LocalDate a = LocalDate.parse(str1);
		LocalDate b = LocalDate.parse(str2);
		
		//LocalDate a = LocalDate.of(2023, 5, 8);
		//LocalDate b = LocalDate.of(2024, 1, 1);
		
		//a가 b 보다 이전인지 판정
		//System.out.println(a.isBefore(b));
		if(a.isBefore(b)) {
			Period period = Period.between(a,b);
			System.out.print(period.getYears()+"년");	//남은 연도	
			System.out.print(period.getMonths()+"개월");	//남은 개월수
			System.out.println(period.getDays()+"일");	//남은 일수 
		}
		else {
			System.out.println("기간을 구할수 없습니다");
		}
	}
}
