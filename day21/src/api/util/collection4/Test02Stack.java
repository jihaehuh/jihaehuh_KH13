package api.util.collection4;

import java.util.Stack;

public class Test02Stack {
	public static void main(String[] args) {
		//Stack(스택)
		//스택은 큐랑 반대 
		//LIFO(Last-In-First-Out)구조
		
		Stack<String> stack = new Stack<String>(); //스택은 종류가 하나
		
		//데이터 추가 - .push()     :밀어넣는다 /데이터를 집어넣는다
		stack.push("뽀로로");
		stack.push("크롱");
		stack.push("루피");
		stack.push("패티");
		
		//들어가는 건 큐랑 같음
		//하지만 나오는게 다르다
		//Ex) 가장 마지막에 겉옷입고 벗을때는 겉옷 제일 먼저 벗는 거랑 같음
		
		//데이터 확인 - .peek()
		System.out.println("현재 차례 = "+stack.peek());
		
		//데이터 삭제 - pop()
		stack.pop();//패티
		stack.pop();//루피
		
		System.out.println("현재 차례 = "+stack.peek());
		
		//뒤로가기 버튼 누르는게 stack.pop(); 으로 구현
		
		//데이터를 최신순으로 관리할때 쓰는게 stack
		
		//컨트롤 z사용하는것도 pop으로 하는것
		
		
	}
}
