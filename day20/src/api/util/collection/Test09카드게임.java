package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test09카드게임 {
	public static void main(String[] args) {
		
		//비어 있는 카드 덱 생성
		List<String> deck = new ArrayList<>();
		List<String> card = new ArrayList<>();
		List<String> type = new ArrayList<>();
		Random r = new Random();
		//(하트/스페이드/클로버/다이아) 가 각각 13장씩  A,2,3,4,5,6,7,8,9,10,J,Q,K
		card.add("하트");
		card.add("스페이드");
		card.add("클로버");
		card.add("다이아");
		Collections.shuffle(card);
		
		//int cardNum =r.nextInt(4)+1; 
		//System.out.println(card.get(0));
		
		type.add("A");
		type.add("2");
		type.add("3");
		type.add("4");
		type.add("5");
		type.add("6");
		type.add("7");
		type.add("8");
		type.add("9");
		type.add("10");
		type.add("J");
		type.add("Q");
		type.add("K");
		Collections.shuffle(type);
		
		//int typeNum =r.nextInt(13)+1;
		//System.out.println(type.get(0));
		int cardNum =r.nextInt(4)+1; 
		int typeNum =r.nextInt(13)+1;
		for(int i =1; i <=13;i++) {
			
			System.out.println(card.get(i));
			System.out.println(type.get(i));
			
		}
		
		
		
		
		}
	}

