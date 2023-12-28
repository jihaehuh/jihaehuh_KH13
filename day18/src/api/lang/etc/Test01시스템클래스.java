package api.lang.etc;

public class Test01시스템클래스 {
	public static void main(String[] args) {
		//System 클래스
		//-생성자가 없다 =객체를 못만든다
		//생성자가 없는 클래스
		//-생성자가 없다는 것은 (1) 객체 아예 생성 불가 (2)객체생성 개수 제한(싱글톤패턴)
		//-모든 필드와 메소드가 static이면  (1)번에 해당
		//-static이 아닌 필드나 메소드가 있으면 (2)번에 해당
		//new를 만들어서 쓰는 법 프로토타입 <--->  싱글톤 패턴
		
		
		//시스템 클래스는 (1)번에 해당된다
		
		//현재시각 구하기
		//-기준시(UTC)인 1970-01-01 00:00:00초
		//-시간 출력용이 아니라 시간차이를 구하는 용도
		long time = System.currentTimeMillis();
		System.out.println("time = "+ time);
		
		//프로그램 종료
		//-외부 시스템에게 종료하며 상태를 알려줄 수 있다.
		//-0은 정상적인 종료를 의미
		//-0이 아닌 숫자는 비정상적인 종료를 의미하며 개발자가 정하기 나름
		//System.exit(0);
		//System.out.println("이 메세지는 나오지 않습니다");
		
		//시스템 환경정보 읽기
		System.out.println(System.getProperties());
		
		System.out.println(System.getProperty("java.specification.version"));
		System.out.println(System.getProperty("os.name"));
		// ^Windows\s?[0-9.]*$        ,   ^Windows\s?[3.1|95|98|ME|NT|2000|7|8|10|11]*$   윈도우 버전 검사식
		System.out.println(System.getProperty("user.country"));//지역
		System.out.println(System.getProperty("user.language"));//언어
		System.out.println(System.getProperty("user.name"));//사용자명
		
		//(중요) 사용자의 동의없이 파일을 생성할 수 잇는 사용자 홈 위치(운영체제)
		System.out.println(System.getProperty("user.home"));//사용자 홈
		
		//출력도 종류가 나눠져 있다
		System.out.println("Hello");
		System.err.println("Hello");
		
	
	}
}
