package oop.inherit3;

public class Browser {
	//브라우저의 공통점을 모아둔 추상적인 클래스
	//브라우저 라면 있어야 하는 필드
	
	public void url()
	{
		System.out.println("주소 저장 기능 실행");
	}
	public void refresh()
	{
		System.out.println("새로 고침 기능 실행 ");
	}
	public void move()
	{
		System.out.println("페이지 이동 기능 실행 ");
	}
}
