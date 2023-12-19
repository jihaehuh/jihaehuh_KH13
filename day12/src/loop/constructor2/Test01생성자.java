package loop.constructor2;

public class Test01생성자 {
	public static void main(String[]args) {
		Music a = new Music("perfect Night","르세라핌",104250d,91835d);
		Music b = new Music("첫 눈","EXO",83127d,90805d);
		Music c = new Music("Drama","aespa",64590d,174519d);
		Music d = new Music("To.X","태연",58826d,70313d);
		
		a.information();
		b.information();
		c.information();
		d.information();
		
	}
}
