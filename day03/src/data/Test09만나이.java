/*package data;

public class Test09만나이 {
	public static void main(String[]args) {
		
		//입력
		int nowYear=2023,nowMonth=12;
		int ageYear = 2000,agemonth =1;
		int oneYear =12;
		
		
		
		//계산
		int year = nowYear-ageYear;					//연도
		int month=nowMonth-agemonth;				//개월
		int totalMonth = year*oneYear+month;    //총개월수
		int age =totalMonth/12;							//만나이
		
		
		//출력 
		System.out.println("만"+age+"살");
		
	}
}*/

//강사님 풀이

public class Test09만나이 {
	public static void main(String[]args) {
		
		//입력
		int current =20231206;
		int birth =2000101;
		
		//계산
		int CY =current/10000;
		int CM =current % 10000/100;
		System.out.println(CY);
		System.out.println(CM);
		
		
	}
}



















