package oop.constructor1.copy;

public class Student {
	private String name;
	private int score;
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getScore() {
		return score;
	}
	void setScore(int score) {
		this.score = score;
	}
	//설정  메소드를 생성자로 변경
	//생성자(constructor)
	//-객체의 생성 시점에 데이터를 초기화할 수 있는 전용 구문
	//-원하는 시점에 부를 수 없고 반드시 생성 시점에 불러짐
	//-오버로딩(overloading)가능_반드시 들어가야하는건 넣고 빼도 되는건 빼줄수있게함
	Student(String name){
		//this.setName(name);
		//this.setScore(score);
		this(name,0); //몰아주기
	}
	
	//void data(String name, int score) {//설정메소드
	
	Student(String name, int score) { //생성자
		this.setName(name);
		this.setScore(score);
	}
	void infromation() {
		System.out.println("이름 : "+ this.name);
		System.out.println("점수 : "+ this.score);
	}
}
