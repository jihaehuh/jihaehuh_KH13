package oop.keyword3;

public class Test01사각형넓이 {
	public static void main(String[]args) {
		
		//static 항목들은 클래스 이름과 합쳐서 바로 사용이 가능
		Calculator c =new Calculator();
		System.out.println("넓이 : "+ c.rect(5, 7));
	}
}
