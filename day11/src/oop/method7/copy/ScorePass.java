/*
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
	
	//매개변수가 없으면 실행을 못함 _외부에서의 데이터를 전달받고 안에서 실행하도록 도와줌
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
*/
//강사님 풀이[1] _ 총점과 평균을 변수로 취급
/*
package oop.method7;

public class ScorePass {
	//멤버 변수 -학년,반,이름,국어,영어,수학,총점,평균
	int level;
	int group;
	String name;
	int korean,english,math;
	int total;
	double average;
	
	//멤버 메소드
	void data(int level,int group,String name,int korean,int english,
			int math, int total, double average) {
		this.level =level;
		this.group= group;
		this.name =name;
		this.korean =korean;
		this.english=english;
		this.math=math;
		this.total=total;
		this.average=average;
	}
	
	void information() {
		System.out.println("학년 : "+ this.level);
		System.out.println(" 반 : "+ this.group);
		System.out.println("이름 : "+ this.name);
		System.out.println("총점:"+ total +"점,"+" 평균: " + average+"점");
	}
	
	
}
*/
//강사님 풀이 [2]_총점과 평균을 변수로 사용하지 않음
package oop.method7.copy;

public class ScorePass {
	int level;
	int group;
	String name;
	int korean,english,math;
	
	void data(int level,int group,String name,int korean,int english,
			int math) {
		this.level =level;
		this.group= group;
		this.name =name;
		this.korean =korean;
		this.english=english;
		this.math=math;
	}
	void information() {
		System.out.println("<학생 정보>");
		System.out.println(this.level+"학년 " +this.group+"반 "+this.name);
		System.out.println("국어 : " + this.korean+"점");
		System.out.println("영어 : " + this.english + "점");
		System.out.println("수학 : " + this.math + "점");

		int total = this.korean + this.english + this.math;
		System.out.println("총점 : " + total + "점");
		double average = total / 3d;
		System.out.println("평균 : " + average + "점");
		
		if(this.korean >=40 && this.english >=40 
				&&this.math >=40 && average >=60) {
			System.out.println("당신은 통과입니다.");
		}
		else {
			System.out.println("당신은 재평가입니다.");
		}
	}
}




















