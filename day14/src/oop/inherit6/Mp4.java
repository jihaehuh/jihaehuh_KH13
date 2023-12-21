package oop.inherit6;

public class Mp4 extends MediaFile {
	//추가되는 필드를 정의
	private float speed;

	//getter&setter
	public void setSpeed(float speed) {
		if(speed <= 0f) return;
		this.speed = speed;
	}
	public float getSpeed() {
		return speed;
	}

	public Mp4(String filename) {
		super(filename);
		this.setSpeed(1f);
	}
	public Mp4(String filename, long filesize) {
		super(filename, filesize);
		this.setSpeed(1f);
	}

	//information이 마음에 들지 않는데... 왜 재생속도가 안나오지?
	//재정의(override)를 해서 내용을 바꿔보자!
	public void information() {
		System.out.println("<파일 정보>");
		System.out.println("이름 : " + this.getFilename());
		System.out.println("크기 : " + this.getFilesize()+"바이트");
//		super.information();
		System.out.println("배속 : x" + this.speed);
	}

}