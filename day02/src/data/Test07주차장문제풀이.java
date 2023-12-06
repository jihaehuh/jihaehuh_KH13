package data;

public class Test07주차장문제풀이 {
	public static void main(String[]args) {
		// 입력
		int inHour = 11, inMinute = 50;
		int outHour =17,outMinute =25;
		
		int pricePeriod=10;
		int priceperTime=1500;
		
		//계산
		int in = inHour*60+ inMinute;
		int out=outHour*60+outMinute;
		//System.out.println(in);
		//System.out.println(out);
		int time =out-in;
		//System.out.println(time);
		int hour = time /60;
		int minute =time % 60;
		
		int price =time /pricePeriod*priceperTime;
		
		//출력
		System.out.println(hour+"시간");
		System.out.println(minute+"분");	
		System.out.println(price+"원");
				
}
}