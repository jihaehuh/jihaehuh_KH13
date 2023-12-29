package api.util.date;

import java.util.Date;

public class Test01Date클래스 {
	public static void main(String[] args) {
		//Date 클래스
		
		Date a = new Date();//임포트할때 util로 해야함 (sql 안돼요)
		//java.lang 의 api들은 임포트를 안해도 되지만 util은 임포트해줘야한다
		
		Date b = new Date(2023,12,29);  //*왜 비추천이 뜨는가? 
		//(1)_옛날에는 년도에 1900을 더해서사용하면 문제가 없었다.ex) 1900+95이런식
		//(2)_월도 현재월-1 을 했어야 했다.(컴퓨터는 0부터시작이어서)
		
		//결론: 밀레니엄 버그(Y2K)로 인해 대부분의 기능이 비추천됨
		//-현재시각을 구하는 기능은 여전히 사용
		
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		
	}
}
