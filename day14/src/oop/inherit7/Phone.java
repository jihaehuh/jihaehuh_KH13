package oop.inherit7;
//이 클래스는 상속에서 상위 클래스 역할을 수행한다
public abstract class Phone {
	//전화기니까 전화기능이 있어야겠ㅈㅣ?
	//근데 어떻게 거는지 모르겟는데....?
	//그래서 abstract를 클래스에 붙여버리면 ..파일에 A가 생겨 
	
	
	private String number;
	//생성자 
	public void setNumber(String number) {
		this.number = number;
	}
	public void information() {
		System.out.println("전화번호 : " + this.number);
	}
	public abstract void call() ;   //추상이 붙으면 abstract를 붙여서
	public abstract void sms();		//만약 잘 안다면 안붙여도 ㄱㅊ , 애매할때 붙이기

	
}
