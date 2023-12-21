package oop.inherit6;
//상위 클래스는 3개가 필요함
public class File {
	//필드
	private String filename;
	private long filesize;

	//생성자
	public File(String filename) {
		this(filename, 0L);
	}
	public File(String filename, long filesize) {
		this.setFilename(filename);
		this.setFilesize(filesize);
	}

	//setter&getter
 	public void setFilename(String filename) {
		this.filename = filename;
	}
	public void setFilesize(long filesize) {
		if(filesize < 0L) return;
		this.filesize = filesize;
	}
	public String getFilename() {
		return filename;
	}
	public long getFilesize() {
		return filesize;
	}

	//메소드
	public void execute() {  
		System.out.println(this.filename + " 파일 실행");
	}
	public void information() {
		System.out.println("<파일 정보>");
		System.out.println("이름 : " + this.filename);
		System.out.println("크기 : " + this.filesize+"바이트");
	}
}