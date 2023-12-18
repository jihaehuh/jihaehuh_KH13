package oop.method7;

public class ScorePass {
	int grade;
	int team;
	String name;
	int korean;
	int english;
	int math;
	int total;
	int average;
	
	void data(int grade,int team,String name,int korean,int english,int math,int total,int average) {
		this.grade=grade;
		this.team=team;
		this.name =name;
		this.korean =korean;
		this.english=english;
		this.math=math;
		this.total=total;
		this.average=average;
	}
	void information() {
		
		System.out.println("학년 : "+ this.grade);
		System.out.println(" 반 : "+ this.team);
		System.out.println("이름 : "+ this.name);
		
		int total = this.korean+this.english+this.math;
		int average = total/3;
		System.out.println("총점:"+ total +"점,"+" 평균: " + average+"점");
		
		if(average <= 60) {
			System.out.println("재평가 입니다");
		}
		else if(this.korean <= 40 ||this.english <= 40 || this.math <= 40) {
			System.out.println("재평가 입니다");
		}
		else {
			System.out.println("통과입니다");
		}
		System.out.println();
		
	}
	
	
	
}
