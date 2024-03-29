package jdbc.select;


//DTO 
//-Data Transfer Object 의 줄임말
//-변환용 객체
//-포장 상자와 같다
//-테이블당 1개씩 테이블과 똑같이 생성
public class PocketmonDto {
	//필드- DB의 컬럼명을 작성
	private int pocketmonNo;
	private String pocketmonName;
	private String pocketmonType;
	
	//필드를 만들고 추가로 setter/getter/기본생성자(매개변수가 한개도 없는 것)를 구현
	
	public int getPocketmonNo() {
		return pocketmonNo;
	}
	public void setPocketmonNo(int pocketmonNo) {
		this.pocketmonNo = pocketmonNo;
	}
	public String getPocketmonName() {
		return pocketmonName;
	}
	public void setPocketmonName(String pocketmonName) {
		this.pocketmonName = pocketmonName;
	}
	public String getPocketmonType() {
		return pocketmonType;
	}
	public void setPocketmonType(String pocketmonType) {
		this.pocketmonType = pocketmonType;
	}
	public PocketmonDto() {
		super();
	}
	
}
