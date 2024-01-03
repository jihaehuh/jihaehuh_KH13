package api.util.collection4;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class Test01Queue {
	public static void main(String[] args) {
		//Queue(큐)
		//-사용법이 정해져 있는 특수 저장소
		//-데이터 1개 추가 /데이터 1개 제거 /데이터 확인
		//비비탄 총 5개 쏘면 먼저 들어간게 먼저 나옴 _선입선출 구조 (ex 버스 줄 서기)
		//줄을 설때 사용 
		//FIFO(First-In-First-Out)구조
		//입출력 시스템의 기본 구성 원리 (키보드,마우스,조작)
		
		Queue<String> queue = new LinkedBlockingQueue<>();   //LinkedBlockingQueue:연결되어 있고 막힘 없이 빠져나갈 수 있게 되어있는 저장소 라는 의미
		//데이터 추가 - .add()
		queue.add("뽀로로");
		queue.add("크롱");
		queue.add("루피");
		queue.add("패티");
		
		//현재 차례 확인 -peek()
		System.out.println("현재 차례 = "+ queue.peek());
		
		//데이터 제거 - .poll()
		queue.poll(); //뽀로로 아웃
		queue.poll(); //크롱 아웃
		System.out.println("현재 차례 = "+ queue.peek());
	
	}
}
