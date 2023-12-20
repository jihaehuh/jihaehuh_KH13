package oop.keyword5;

//회원 클래스
//-아이디는 최초 설정 이후 " 절대로 " 변경되면 안됩니다
public class Member {
	private final String id; //값이 없는데 잠겨버리면 우짜누...
	private String password;
	
	//final항목이 필드로 존재한다면 반드시 생성자에서 초기화를 해야한다
	public Member(String id, String password) {
		this.id =id;//이렇게쓰지말고 세터게터 메소드로 만들어라
		//final은 세터 메소드가 없어요,,,,
		this.password =password;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
		return id;
	}
	//final 필드는 setter메소드 생성이 불가능하다
	//public void setId() {
	//	this.id=id; //왜 안되냐면 불러서 실행하는 친구인데 몇번 부를지 몰라서 안댐
	//}
}
