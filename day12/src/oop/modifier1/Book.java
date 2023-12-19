package oop.modifier1;

public class Book {
	//멤버 필드(변수)
	//-외부에서 접근이 불가능하도록 잠금(Private)처리
	private String title;
	private String author;
	private int price;
	private int page;
	
	//변수가 잠기면 외부에서는 직접 접근할 수 있는 방법이 없다
	//-설정을 위한setter메소드, 확인을 위한getter메소드를 설정해야한다
	void setTitle(String title) {
		this.title=title;
	}
	void setAuthor(String author) {
		this.author=author;
	}
	void setPrice(int price) {
		if(price >=0) {//돈이 0이상일때만..
			this.price=price;
		}
	
	}
	void setPage(int page) {
		if(page >0) {//페이지가 0이상
			this.page=page;
		}
	}
	
	String getTitle()
	{
		return this.author;
	}
	int getPrice() {
		return this.price;
	}
	int getPage()
	{
		return this.page;
	}
	//멤버 메소드
	void data(String title,String author,int price, int page) {
		this.setTitle(title);
		this.setAuthor(author);
		this.setPrice(price);
		this.setPage(page);
		
	}
	void information() {
		System.out.println("<도서정보>");
		System.out.println("이름 : "+ this.title);
		System.out.println("저자 : "+ this.author);
		System.out.println("가격 : "+ this.price);
		System.out.println("페이지 : "+ this.page);
	
	}
}
