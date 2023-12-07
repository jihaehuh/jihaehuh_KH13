package data4;

public class Test03논리연산 {
	public static void main(String[]args) {
		//논리연산
		// -논리끼리 계산할 때 사용
		//-&&(and) , ||(or) 을 이용하여 조합
		
		//Ex) 19살은 청소년인가요?
		//-기준: 청소년은 중학교1학년(14살)고등학교 3학년(19살)까지
		
		int age =80;
		// boolean teen =14 <= age <= 19;           자바는 한번에 계산이 안된다. 그래서 나눠서 계산을 해줘야함
		boolean teen =14 <= age && age <=19;         //&& 기호 사용
		System.out.println("청소년인가요? "+ teen);
		
		//-무임승차 대상은 65세 이상이거나 (또는) 8세 미만입니다.
		boolean free = age >=65 || age <8;
		System.out.println("무임승차 대상인가요? "+ free);
		
		
	}
}
 