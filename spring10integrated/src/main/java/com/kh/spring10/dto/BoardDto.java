package com.kh.spring10.dto;

import java.sql.Date;

public class BoardDto {
	private int boardNo; //글번호
	private String boardTitle; //작성자
	private String boardContent; //글내용
	private String boardWriter; //작성자(회원아이디)
	private Date boardWtime; //작성시각
	private Date boardEtime; //수정시각
	private int boardReadcount; //조회수
	
	//toString 만드려면 컨텐트는 빼고 만드는게 좋다
	public int getBoardNo() {
		return boardNo;
	}
	public BoardDto() {
		super();
	}
	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getBoardWriter() {
		return boardWriter;
	}
	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}
	public Date getBoardWtime() {
		return boardWtime;
	}
	public void setBoardWtime(Date boardWtime) {
		this.boardWtime = boardWtime;
	}
	public Date getBoardEtime() {
		return boardEtime;
	}
	public void setBoardEtime(Date boardEtime) {
		this.boardEtime = boardEtime;
	}
	public int getBoardReadcount() {
		return boardReadcount;
	}
	public void setBoardReadcount(int boardReadcount) {
		this.boardReadcount = boardReadcount;
	}
	
	
	
	
	
	
	
}
