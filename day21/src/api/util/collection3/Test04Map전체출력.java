package api.util.collection3;

import java.util.Map;
import java.util.Set;

public class Test04Map전체출력 {
	public static void main(String[] args) {
		//Map역시 전체 데이터 출력이 가능하다
		Map<String, Integer> votes =Map.of(
				"피카츄",30,
				"라이츄",25,
				"꼬부기",12,
				"뮤츠",99
				);
		//Map 의 key만 보면 Set이랑 똑같아요 (Set은 중복이 안되거든요 Set<String>)
		Set<String> names = votes.keySet(); //이름만 모아서 넘겨줌
		System.out.println(names); //순서는 상관하지 않기
		
		for(String name :names) {
			System.out.println("이름 :" + name); //이름
			System.out.println("득표 : "+votes.get(name)); //득표수
		}
		
	}
}
