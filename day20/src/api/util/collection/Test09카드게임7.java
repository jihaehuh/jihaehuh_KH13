package api.util.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test09카드게임7 {
	public static void main(String[] args) {

		//카드를 생성하기 위한 모양과 숫자를 각각 구현
		//List의 데이터 개수가 고정이라면 "불변" 리스트 생성 가능
		//List<String> shapes = Arrays.asList("하트", "다이아몬드", "스페이드", "클로버");//Java 8
		List<String> shapes = List.of("하트", "다이아몬드", "스페이드", "클로버");//Java 9+

		List<String> numbers = List.of(
				"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"
		);

		//비어있는 카드 덱 생성
		List<String> deck = new ArrayList<>();

		//카드덱에 카드 추가
		for(int i=0; i < shapes.size(); i++) {
			for(int k=0; k < numbers.size(); k++) {
				deck.add(shapes.get(i)+numbers.get(k));
			}
		}

		//카드 덱 섞기
		Collections.shuffle(deck);
		//System.out.println("카드 장 수 = " + deck.size());

		//입력으로 변경
		Scanner sc = new Scanner(System.in);
		System.out.print("장수(1~52) : ");
		int count = sc.nextInt();
		if(count >= 1 && count <= 52) {
			for(int i=0; i < count; i++) {
				System.out.println(deck.get(0));
				deck.remove(0);
			}
		}
		else {
			System.out.println("유효하지 않은 장수");
		}
		sc.close();
	}
}