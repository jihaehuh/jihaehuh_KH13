package api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02Date형식 {
	public static void main(String[] args) {
		//Date를 이용해서 구한 현재시각을 원하는 형식으로 출력해보자
		//-자바는 형식을 직접바꾸는 것이 아니라 ~~~Format클래스 형태로 제공
		
		Date d = new Date();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(d);
		System.out.println(fmt.format(d));
		//Year만 뽑고 싶을땐 어떻게 할까?
		//객체에 있는 속성을 꺼낼땐 게터메소드 를 떠올려야한다
		
	}
}
