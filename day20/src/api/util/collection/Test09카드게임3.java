package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test09카드게임3 {
	public static void main(String[] args) {

		//비어있는 카드 덱 생성
		List<String> deck = new ArrayList<>();

		//카드덱에 카드 추가
		deck.add("하트A");
		deck.add("하트2");
		deck.add("하트3");
		deck.add("하트4");
		deck.add("하트5");
		deck.add("하트6");
		deck.add("하트7");
		deck.add("하트8");
		deck.add("하트9");
		deck.add("하트10");
		deck.add("하트J");
		deck.add("하트Q");
		deck.add("하트K");

		deck.add("클로버A");
		deck.add("클로버2");
		deck.add("클로버3");
		deck.add("클로버4");
		deck.add("클로버5");
		deck.add("클로버6");
		deck.add("클로버7");
		deck.add("클로버8");
		deck.add("클로버9");
		deck.add("클로버10");
		deck.add("클로버J");
		deck.add("클로버Q");
		deck.add("클로버K");

		deck.add("스페이드A");
		deck.add("스페이드2");
		deck.add("스페이드3");
		deck.add("스페이드4");
		deck.add("스페이드5");
		deck.add("스페이드6");
		deck.add("스페이드7");
		deck.add("스페이드8");
		deck.add("스페이드9");
		deck.add("스페이드10");
		deck.add("스페이드J");
		deck.add("스페이드Q");
		deck.add("스페이드K");

		deck.add("다이아몬드A");
		deck.add("다이아몬드2");
		deck.add("다이아몬드3");
		deck.add("다이아몬드4");
		deck.add("다이아몬드5");
		deck.add("다이아몬드6");
		deck.add("다이아몬드7");
		deck.add("다이아몬드8");
		deck.add("다이아몬드9");
		deck.add("다이아몬드10");
		deck.add("다이아몬드J");
		deck.add("다이아몬드Q");
		deck.add("다이아몬드K");

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