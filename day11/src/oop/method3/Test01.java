package oop.method3;


public class Test01 {
	public static void main(String[]args) {
		Plan c1 =new Plan();
		Plan c2 =new Plan();
		Plan c3=new Plan();
		
		c1.data("Sk","5g언택트 52",52000,200,1000,2000);
		c2.data("KT","5g세이브",45000,100,900,1500);
		c3.data("LG","5g시그니처",130000,500,2000,2500);
		
		
		c1.information();
		c2.information();
		c3.information();
		
	}	
}
