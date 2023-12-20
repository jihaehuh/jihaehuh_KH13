//잘못된 풀이 
/*
package oop.constructor3;

import java.util.Scanner;

public class Player {
	private String id;
	private String job;
	private int level;
	private int gold;

	Player() {
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		this.id = sc.next();
		System.out.print("직업 : ");
		this.job = sc.next();
		this.level = 1;
		this.gold = 100;
	}

	void information() {
		System.out.println("<캐릭터 정보>");
		System.out.println("아이디 : " + this.id);
		System.out.println("직업 : " + this.job);
		System.out.println("레벨 : " + this.level);
		System.out.println("소지금 : "+ this.gold);
	}
}

*/
//좋은 풀이
package oop.constructor3;

public class Player {
	private String id;
	private String job;
	private int level;
	private int gold;

	void setId(String id) {
		this.id = id;
	}
	void setJob(String job) {
		//if(job == "전사" || job == "도적" || job == "마법사") {}//안되는 코드
		switch(job) {
		case "전사":
		case "도적":
		case "마법사":
			this.job = job;
		}
	}
	void setLevel(int level) {
		//if(level ==1) 이것도 가능
		if(level < 1) return;
		this.level = level;
	}
	void setGold(int gold) {
		if(gold < 0) return;
		this.gold = gold;
	}
	String getId() {
		return this.id;
	}
	String getJob() {
		return this.job;
	}
	int getLevel() {
		return this.level;
	}
	int getGold() {
		return this.gold;
	}

	Player(String id, String job) {
		//생성자 개수는 아메리카노 주문수
		this.setId(id);
		this.setJob(job);
		this.setLevel(1);
		this.setGold(100);
	}

	void information() {
		System.out.println("<캐릭터 정보>");
		System.out.println("아이디 : " + this.id);
		System.out.println("직업 : " + this.job);
		System.out.println("레벨 : " + this.level);
		System.out.println("소지금 : "+ this.gold);
	}

	void levelUp() {
		this.level++;
	}
}