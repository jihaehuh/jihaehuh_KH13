package oop.inherit3;

public class Test01브라우저상속 {
	public static void main(String[]args) {
		//상위 or 상속 클래스는 존재하면 안되는 객체가 된다
		//Browser browser =new Browser(); 존재하면 안되는 객체
		Chrome b1=new Chrome();
		b1.setUrl("https://www.google.co.kr/");
		b1.refresh();
		b1.move();
		b1.develop();
		b1.chromeSctore();
		
		Edge b2=new Edge();
		b2.setUrl("https://www.microsoft.com/ko-kr/");
		b2.refresh();
		b2.move();
		b2.fullScreen();
		
		Whale b3 =new Whale();
		b3.setUrl("https://www.naver.com/");
		b3.refresh();
		b3.move();
		b3.papago();
		b3.naverSearch();
		
	}
}
