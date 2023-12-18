package oop.basic1;

public class Test01객체생성 {
	public static void main(String[]args) {
		//메세지를 생성해보자
		//객체 생성
		
		//여러개 만들때는 훨씬 좋다
		
		
		Message a = new Message();   //메세지 생성 코드
		//a-------> (복잡한 데이터 덩어리; sender,content,time,people)
		
		a.sender="초롱초롱 라이언";
		a.content="오늘은 일찍와?";
		a.time="오후 2:29";
		a.people =1;
		//a.name = "라이언";    객체를 만들지 않아서 사용할 수없음
		
		System.out.println(a.sender);
		System.out.println(a.content);
		System.out.println(a.time);
		System.out.println(a.people);
		
		
		//객체생성
		Message b= new Message();
		
		b.sender = "뽀롱뽀롱 뽀로로";
		b.content = "아니! 늦게갈껀데!";
		b.time = "오후 12:33";
		b.people = 0;

		System.out.println(b.sender);
		System.out.println(b.content);
		System.out.println(b.time);
		System.out.println(b.people);
	}
}
