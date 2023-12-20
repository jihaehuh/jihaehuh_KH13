package oop.keyword6;

public class GameScreen {
	//메소드 
	private String title;
	private final int width;
	private final int height;

	
	//생성자
	public GameScreen(String title, int width, int height) {
		this.setTitle(title);
		this.width = width;
		this.height = height;
	}
	//게터 세터
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public int getResolution() {
		return this.width * this.height;
	}
	//출력
	public void information() { 
		System.out.println("<게임화면 정보>");
		System.out.println("타이틀 : " + this.title);
		System.out.println("해상도 : "+this.getResolution()
									+ "("+this.width+" x "+this.height+")");
	}
}