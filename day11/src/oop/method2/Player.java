package oop.method2;

public class Player {
	
	String name;//player 라면 반드시 이름정보가 저장될 곳이 있어야한다
	String event; //player 라면 반드시 종목정보가 저장될 곳이 있어야한다
	String type;  //player 라면 반드시 구분정보가 저장될 곳이 있어야한다
	int gold;  //player 라면 반드시 금메달정보가 저장될 곳이 있어야한다
	int silver; //player 라면 반드시 은메달정보가 저장될 곳이 있어야한다
	int bronze;  //player 라면 반드시 동메달정보가 저장될 곳이 있어야한다
	
	
	
	//객체 정보 출력 하는 메소드
	void information() {
		System.out.println("<선수 정보>");
		System.out.println("이름 : "+ this.name);
		System.out.println("종목 : "+ this.event);
		System.out.println("구분 : "+ this.type);
		System.out.println("금메달 : "+ this.gold+"은메달 : "+ this.silver+"동메달 : "+ this.bronze);
		
	}
	
	//정보 초기화 메소드
	void data (String name, String event, String type, int gold , int silver, int bronze) {
		this.name = name;
		this.event =event;
		this.type =type;
		this.gold =gold;
		this.silver =silver;
		this.bronze =bronze;
	
	}
}
