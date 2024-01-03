package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test09카드게임4 {
	public static void main(String[] args) {

		//카드를 생성하기 위한 모양과 숫자를 각각 구현
		List<String> shapes = new ArrayList<>();
		shapes.add("하트");
		shapes.add("다이아몬드");
		shapes.add("클로버");
		shapes.add("스페이드");

		//비어있는 카드 덱 생성
		List<String> deck = new ArrayList<>();

		//카드덱에 카드 추가
		deck.add(shapes.get(0)+"A");
		deck.add(shapes.get(0)+"2");
		deck.add(shapes.get(0)+"3");
		deck.add(shapes.get(0)+"4");
		deck.add(shapes.get(0)+"5");
		deck.add(shapes.get(0)+"6");
		deck.add(shapes.get(0)+"7");
		deck.add(shapes.get(0)+"8");
		deck.add(shapes.get(0)+"9");
		deck.add(shapes.get(0)+"10");
		deck.add(shapes.get(0)+"J");
		deck.add(shapes.get(0)+"Q");
		deck.add(shapes.get(0)+"K");

		deck.add(shapes.get(1)+"A");
		deck.add(shapes.get(1)+"2");
		deck.add(shapes.get(1)+"3");
		deck.add(shapes.get(1)+"4");
		deck.add(shapes.get(1)+"5");
		deck.add(shapes.get(1)+"6");
		deck.add(shapes.get(1)+"7");
		deck.add(shapes.get(1)+"8");
		deck.add(shapes.get(1)+"9");
		deck.add(shapes.get(1)+"10");
		deck.add(shapes.get(1)+"J");
		deck.add(shapes.get(1)+"Q");
		deck.add(shapes.get(1)+"K");

		deck.add(shapes.get(2)+"A");
		deck.add(shapes.get(2)+"2");
		deck.add(shapes.get(2)+"3");
		deck.add(shapes.get(2)+"4");
		deck.add(shapes.get(2)+"5");
		deck.add(shapes.get(2)+"6");
		deck.add(shapes.get(2)+"7");
		deck.add(shapes.get(2)+"8");
		deck.add(shapes.get(2)+"9");
		deck.add(shapes.get(2)+"10");
		deck.add(shapes.get(2)+"J");
		deck.add(shapes.get(2)+"Q");
		deck.add(shapes.get(2)+"K");

		deck.add(shapes.get(3)+"A");
		deck.add(shapes.get(3)+"2");
		deck.add(shapes.get(3)+"3");
		deck.add(shapes.get(3)+"4");
		deck.add(shapes.get(3)+"5");
		deck.add(shapes.get(3)+"6");
		deck.add(shapes.get(3)+"7");
		deck.add(shapes.get(3)+"8");
		deck.add(shapes.get(3)+"9");
		deck.add(shapes.get(3)+"10");
		deck.add(shapes.get(3)+"J");
		deck.add(shapes.get(3)+"Q");
		deck.add(shapes.get(3)+"K");

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