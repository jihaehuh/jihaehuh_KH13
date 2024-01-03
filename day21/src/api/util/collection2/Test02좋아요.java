/*
 * Test02조회수중복방지
유튜브에서는 크리에이터에게 조회수를 기반으로 한 수익을 제공합니다.
따라서 조회수가 의미 없이 마구잡이로 올라가는 것을 방지하려고 합니다.

사용자가 보고 싶은 영상 제목을 입력합니다
사용자가 입력한 영상 제목을 시청한 기록이 있을 경우 "조회수 증가 없이 영상만 재생합니다"를 출력합니다
사용자가 입력한 영상 제목을 시청한 기록이 없을 경우 "조회수 증가 후 영상을 재생합니다"를 출력합니다
사용자가 종료라는 글자를 입력하기 전까지 반복합니다
사용자가 종료라는 글자를 입력하면 여태까지 시청한 영상 개수를 출력하세요
<예시>
제목 : (비전공자의 자바 도전기)
시청 기록이 없어 조회수 증가 후 영상을 재생합니다
제목 : (비전공자의 자바 도전기2)
시청 기록이 없어 조회수 증가 후 영상을 재생합니다
제목 : (비전공자의 자바 도전기)
이미 시청한 영상이므로 조회수 증가 없이 영상을 재생합니다
제목 : (종료)
총 2개의 영상을 시청하셨습니다
 */


package api.util.collection2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test02좋아요 {
	public static void main(String[] args) {
		
		//정렬이 필요하지 않으므로 HashSet 으로 구현
		Set<String> history = new HashSet<>();
		
	
		
		//샘플 데이터 저장
				//history.add("비전공자의 자바 입문기");
				//history.add("자바로 홈페이지 만들기");
				//history.add("개발자의 미래");

				//사용자 입력
		
		//사용자 입력
		Scanner sc = new Scanner(System.in);
		
		
		//판정
		while(true) {
			System.out.println("제목 : ");
			String title = sc.nextLine();
			//if(title == "종료") {//절대로 실행되지 않는 코드
			if(title.equals("종료")) {
				break;
			}
			//-set은 중복이 불가능하므로 add의 결과로도 존재 여부파악이 가능
		//if(history.contains(title)) {
		if(history.add(title)) { //추가했을때 true가 나오면 본적이 없는 영상
		System.out.println("시청한 적 있는 영상입니다");
			}
		else {
			System.out.println("처음 시정하는 영상입니다");
			history.add(title);
			}
		sc.close();
		System.out.println("총 시청한 영상 개수 : "+history.size());
		}
		
	
		
		
		
		
		
	}
}
