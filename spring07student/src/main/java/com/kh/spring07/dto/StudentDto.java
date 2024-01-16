package com.kh.spring07.dto;

public class StudentDto {
	private int studentId;
	private String name;
	private float koreanScore;
	private float mathScore;
	private float EnglishScore;
	
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
	public void setKoreanScore(float koreanScore) {
		this.koreanScore = koreanScore;
	}
	public float getMathScore() {
		return mathScore;
	}
	public void setMathScore(float mathScore) {
		this.mathScore = mathScore;
	}
	public float getEnglishScore() {
		return EnglishScore;
	}
	public void setEnglishScore(float englishScore) {
		EnglishScore = englishScore;
	}
	
}
