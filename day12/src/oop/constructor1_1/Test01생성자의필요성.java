package oop.constructor1_1;

public class Test01생성자의필요성 {
	public static void main(String[]args) {
		Student a = new Student("피카츄",50);  
		a.infromation();
		
		
		//이제는 데이터는 안만들고 생성자를 만들것이다.
		//객체를 만들고 정보를 따로 저장하는게 불편...
	}
}
