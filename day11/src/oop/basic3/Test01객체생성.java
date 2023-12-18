/*
package oop.basic3;
//객체 4개 데이터 5개 
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
*/

package oop.basic3;
//객체 4개 데이터 5개 
public class Test01객체생성 {
	public static void main(String[]args) {
		//객체 생성
		EplData a =new EplData();
		EplData b =new EplData();
		EplData c =new EplData();
		EplData d =new EplData();
		
		//객체 초기화
		a.rank = 1;
		a.name ="아스널";
		a.win =12;
		a.draw =3;
		a.lose =2;
		
		b.rank = 2;
		b.name ="리버풀";
		b.win =11;
		b.draw =5;
		b.lose =1;
		
		c.rank = 3;
		c.name ="에스턴 빌라";
		c.win =12;
		c.draw =3;
		c.lose =3;
		
		d.rank = 4;
		d.name ="맨 시티";
		d.win =10;
		d.draw =4;
		d.lose =3;
		
		
		//객체 출력
		
		System.out.println("<영국 축구 순위");
		System.out.println("순위 : "+ a.rank+ " 클럽명 : "+ a.name +"	승리 : "+ a.win+" 무승부 : "+a.draw+" 패배 :"+a.lose );
		System.out.println("순위 : "+ b.rank + " 클럽명 : "+ b.name +"	승리 : "+ b.win+" 무승부 : "+b.draw+" 패배 :"+b.lose );
		System.out.println("순위 : "+ c.rank + " 클럽명 : "+c.name +" 	승리 : "+ c.win+" 무승부 : "+c.draw+" 패배 :"+c.lose );
		System.out.println("순위 : "+ d.rank + " 클럽명 : "+ d.name +"	승리 : "+ d.win+" 무승부 : "+d.draw+" 패배 :"+d.lose );
	}
		
	}