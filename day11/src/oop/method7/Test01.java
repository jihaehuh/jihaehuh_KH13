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
