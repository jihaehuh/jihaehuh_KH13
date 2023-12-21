package oop.inherit5;

public class Test01객체생성 {
	public static void main(String[]args) {
		
		//Purifier p =new Purifier("???",50000);
		IcePurifier p1 = new IcePurifier("코웨이",500000);
		p1.normal();
		p1.cold();
		p1.ice();
		
		HotPurifier p2 = new HotPurifier("쿠쿠",450000);
		p2.normal();
		p2.hot();
		
		MultiPurifier p3 = new MultiPurifier("SK매직",650000);
		p3.normal();
		p3.cold();
		p3.hot();
		
		
		
	}

}
