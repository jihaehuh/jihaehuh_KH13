/*
package oop.method7;

public class Test01 {
	public static void main(String[]args) {
		ScorePass p1 = new ScorePass();
		ScorePass p2 = new ScorePass();
		ScorePass p3 = new ScorePass();
		ScorePass p4 = new ScorePass();

		p1.data(1,1,"마리오",50,60,50,160,53);
		p2.data(1,1,"루이지",60,90,50,200,66);
		p3.data(1,1,"쿠파",70,70,80,220,73);
		p4.data(1,1,"요시",80,85,35,200,66);

		p1.information();
		p2.information();
		p3.information();
		p4.information();
	}
}
*/
//강사님 풀이[1]

package oop.method7.copy;

public class Test01 {
	public static void main(String[]args) {
		ScorePass p1 = new ScorePass();
		ScorePass p2 = new ScorePass();
		ScorePass p3 = new ScorePass();
		ScorePass p4 = new ScorePass();
		
		p1.data(1,1,"마리오",50,60,50);
		p2.data(1,1,"루이지",60,90,50);
		p3.data(1,1,"쿠파",70,70,80);
		p4.data(1,1,"요시",80,85,35);
		
		//만약에 점수를 변경했을때 총점과 평균의 합계도 변한다...(내가 다 계속 바꿔줘야한다...)
		//원하지 않는 상황을 계속 만들어내는건 객체지향에서는 싫어한다...
		//그래서 2차계산이 필요한 것들은 변수로 넣으면 안된다.
		
		//국어점수를 60점으로 변경이 가능해진다.
		p1.korean=60;
		p1.information();
		p2.information();
		p3.information();
		p4.information();
	}
}

