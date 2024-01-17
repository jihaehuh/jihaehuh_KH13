package com.kh.spring07.dto;

public class StudentDto {
	private int studentId;
	private String name;
	private int koreanScore;
	private int mathScore;
	private int EnglishScore;
	
	public StudentDto() {
		super();
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getKoreanScore() {
		return koreanScore;
	}
	public void setKoreanScore(int koreanScore) {
		this.koreanScore = koreanScore;
	}
	public float getMathScore() {
		return mathScore;
	}
	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	public float getEnglishScore() {
		return EnglishScore;
	}
	public void setEnglishScore(int englishScore) {
		EnglishScore = englishScore;
	}
	public int getTotal() {
		return koreanScore+mathScore+EnglishScore;
	}
	public float getAverage() {
		return getTotal() / 3f;
	}
	
}
