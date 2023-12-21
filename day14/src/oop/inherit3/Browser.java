package oop.inherit3;

public class Browser {//추상체
	//브라우저 라면 있어야 하는 필드
	
	//공통 	부분들을 모아 만든 상위 클래스
	//공통기능 url,refresh,move
	
	//필드-저장
	private String url;
	
	//메소드
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
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
