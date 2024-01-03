/*
 * Test06영화목록
마리오와 루이지는 각각 2023년 한 해 동안 다음과 같은 영화를 봤습니다.

마리오 : 서울의 봄, 그대들은 어떻게 살 것인가, 3일의 휴가, 괴물
루이지 : 나폴레옹, 사랑은 낙엽을 타고, 서울의 봄, 괴물, 쏘우 X

마리오와 루이지가 모두 본 영화 목록을 출력
마리오와 루이지 중 한 명만 본 영화 목록을 출력
 */

package api.util.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test06영화목록 {
	public static void main(String[] args) {
		//기초데이터 준비
		Set<String> mario = Set.of("서울의 봄","그대들은 어떻게 살 것인가","3일의 휴가","괴물");
		Set<String> luigi = Set.of("나폴레옹","사랑은 낙엽을 타고","서울의 봄","괴물","쏘우 X");
		
		//1. 모두 본 영화(합집합)
				Set<String> union = new TreeSet<>();
				union.addAll(mario);
				union.addAll(luigi);

				System.out.println("<마리오와 루이지 모두 본 영화> "+union.size()+"편");
				for(String title : union) {
					System.out.println("- "+title);
				}
		
		//2. 한 명만 본 영화
				//- (a-b)와 (b-a)를 합쳐서 구하는 방법
				//- (a∪b)에서 (a∩b)를 빼는 방법
				Set<String> intersection = new TreeSet<>();
				intersection.addAll(mario);//마리오 본 영화 더하고
				intersection.retainAll(luigi);//루이지가 본 영화랑 겹치는것만 놔두고

				Set<String> result = new TreeSet<>();
				result.addAll(union);//모두본 영화 더하고
				result.removeAll(intersection);//둘다 본 영화 빼고

				System.out.println("<둘 중 한 명만 본 영화> " + result.size()+"편");
				for(String title : result) {
					System.out.println("- " + title);
				}
		
	}
}
