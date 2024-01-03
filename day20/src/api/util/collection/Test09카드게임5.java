package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test09카드게임5 {
	public static void main(String[] args) {

		//카드를 생성하기 위한 모양과 숫자를 각각 구현
		List<String> shapes = new ArrayList<>();
		shapes.add("하트");
		shapes.add("다이아몬드");
		shapes.add("클로버");
		shapes.add("스페이드");

		List<String> numbers = new ArrayList<>();
		numbers.add("A");
		numbers.add("2");
		numbers.add("3");
		numbers.add("4");
		numbers.add("5");
		numbers.add("6");
		numbers.add("7");
		numbers.add("8");
		numbers.add("9");
		numbers.add("10");
		numbers.add("J");
		numbers.add("Q");
		numbers.add("K");

		//비어있는 카드 덱 생성
		List<String> deck = new ArrayList<>();

		//카드덱에 카드 추가
		deck.add(shapes.get(0)+numbers.get(0));
		deck.add(shapes.get(0)+numbers.get(1));
		deck.add(shapes.get(0)+numbers.get(2));
		deck.add(shapes.get(0)+numbers.get(3));
		deck.add(shapes.get(0)+numbers.get(4));
		deck.add(shapes.get(0)+numbers.get(5));
		deck.add(shapes.get(0)+numbers.get(6));
		deck.add(shapes.get(0)+numbers.get(7));
		deck.add(shapes.get(0)+numbers.get(8));
		deck.add(shapes.get(0)+numbers.get(9));
		deck.add(shapes.get(0)+numbers.get(10));
		deck.add(shapes.get(0)+numbers.get(11));
		deck.add(shapes.get(0)+numbers.get(12));

		deck.add(shapes.get(1)+numbers.get(0));
		deck.add(shapes.get(1)+numbers.get(1));
		deck.add(shapes.get(1)+numbers.get(2));
		deck.add(shapes.get(1)+numbers.get(3));
		deck.add(shapes.get(1)+numbers.get(4));
		deck.add(shapes.get(1)+numbers.get(5));
		deck.add(shapes.get(1)+numbers.get(6));
		deck.add(shapes.get(1)+numbers.get(7));
		deck.add(shapes.get(1)+numbers.get(8));
		deck.add(shapes.get(1)+numbers.get(9));
		deck.add(shapes.get(1)+numbers.get(10));
		deck.add(shapes.get(1)+numbers.get(11));
		deck.add(shapes.get(1)+numbers.get(12));

		deck.add(shapes.get(2)+numbers.get(0));
		deck.add(shapes.get(2)+numbers.get(1));
		deck.add(shapes.get(2)+numbers.get(2));
		deck.add(shapes.get(2)+numbers.get(3));
		deck.add(shapes.get(2)+numbers.get(4));
		deck.add(shapes.get(2)+numbers.get(5));
		deck.add(shapes.get(2)+numbers.get(6));
		deck.add(shapes.get(2)+numbers.get(7));
		deck.add(shapes.get(2)+numbers.get(8));
		deck.add(shapes.get(2)+numbers.get(9));
		deck.add(shapes.get(2)+numbers.get(10));
		deck.add(shapes.get(2)+numbers.get(11));
		deck.add(shapes.get(2)+numbers.get(12));

		deck.add(shapes.get(3)+numbers.get(0));
		deck.add(shapes.get(3)+numbers.get(1));
		deck.add(shapes.get(3)+numbers.get(2));
		deck.add(shapes.get(3)+numbers.get(3));
		deck.add(shapes.get(3)+numbers.get(4));
		deck.add(shapes.get(3)+numbers.get(5));
		deck.add(shapes.get(3)+numbers.get(6));
		deck.add(shapes.get(3)+numbers.get(7));
		deck.add(shapes.get(3)+numbers.get(8));
		deck.add(shapes.get(3)+numbers.get(9));
		deck.add(shapes.get(3)+numbers.get(10));
		deck.add(shapes.get(3)+numbers.get(11));
		deck.add(shapes.get(3)+numbers.get(12));

		for(int i=0; i < deck.size(); i++) {
			String card = deck.get(i);
			System.out.println(card);
		}


//		//카드 덱 섞기
//		Collections.shuffle(deck);
//		//System.out.println("카드 장 수 = " + deck.size());
//		
//		//입력으로 변경
//		Scanner sc = new Scanner(System.in);
//		System.out.print("장수(1~52) : ");
//		int count = sc.nextInt();
//		if(count >= 1 && count <= 52) {
//			for(int i=0; i < count; i++) {
//				System.out.println(deck.get(0));
//				deck.remove(0);
//			}
//		}
//		else {
//			System.out.println("유효하지 않은 장수");
//		}
//		sc.close();
	}
}