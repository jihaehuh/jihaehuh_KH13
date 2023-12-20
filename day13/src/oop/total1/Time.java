package oop.total1;

public class Time {
	//멤버 필드
	private int time;
	private int hour;
	private int minute;
	private int second;
	
	//멤버 메소드 생성

	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public int getTime() {
		return second;
	}
	public void setTime(int time) {
		this.time = time;
	}
	//필요한 계산
	public int getResultHour() {
		return this.getTime()/3600;
	}
	public int getResultSecond() {
		return this.getResultHour()%3600; 	
	}
	
	

	//생성자
	public int getResultHour(int hour, int minute,int second) {
		 return getResultSecond()/3600;
		}
	public int getResultSecond(int hour, int minute,int second) {
		return getResultHour()%3600;
	}
	//출력
	void information() {
		System.out.println(" <시간 계산기 >");
		System.out.println(this.get);
	}

	
	
	
	
	
}
