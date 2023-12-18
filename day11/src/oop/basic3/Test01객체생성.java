package oop.basic3;

public class Test01객체생성 {
	public static void main(String[]args) {
		EplData e1 =new EplData();
		EplData e2 =new EplData();
		EplData e3=new EplData();
		EplData e4=new EplData();
		 
		e1.Ranking =1;
		e1.name ="아스널";
		e1.Wins =12;
		e1.Draws =3;
		e1.Losses=2;
		
		
		e2.Ranking =2;
		e2.name="리버풀";
		e2.Wins=11;
		e2.Draws=5;
		e2.Losses=1;
		
		e3.Ranking=3;
		e3.name="에스턴 빌라";
		e3.Wins =12;
		e3.Draws=2;
		e3.Losses=3;
		
		e4.Ranking=4;
		e4.name="맨 시티";
		e4.Wins=10;
		e4.Draws=4;
		e4.Losses=3;
		
		System.out.println("<영국 축구 순위");
		System.out.println("순위 : "+ e1.Ranking + " 클럽명 : "+ e1.name +"	승리 : "+ e1.Wins+" 무승부 : "+e1.Draws+" 패배 :"+e1.Losses );
		System.out.println("순위 : "+ e2.Ranking + " 클럽명 : "+ e2.name +"	승리 : "+ e2.Wins+" 무승부 : "+e2.Draws+" 패배 :"+e2.Losses );
		System.out.println("순위 : "+ e3.Ranking + " 클럽명 : "+ e3.name +" 	승리 : "+ e3.Wins+" 무승부 : "+e3.Draws+" 패배 :"+e3.Losses );
		System.out.println("순위 : "+ e4.Ranking + " 클럽명 : "+ e4.name +"	승리 : "+ e4.Wins+" 무승부 : "+e4.Draws+" 패배 :"+e4.Losses );
	}
}
