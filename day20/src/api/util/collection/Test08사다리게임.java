package api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test08사다리게임 {
	public static void main(String[] args) {
		//입력추가
		
		Scanner sc = new Scanner(System.in);
		List<String> names = new ArrayList<>();
		List<String> items = new ArrayList<String>();
		
		//인원수 설정 가능하도록 변경
		System.out.println("인원수 설정 : ");
		int count =sc.nextInt();
		sc.nextLine();//다음 입력에 영향을 주기 때문에_이럴때 사용하는거임
		
		System.out.println("이름을 " +count+" 개 입력하세요");
		
		for(int i =0; i<count;i++) {
			names.add(sc.nextLine());
		}
		Collections.sort(names);
		
		System.out.println("당첨항목을" +count+"개 입력하세요");
		for(int i =0; i<count;i++) {
			items.add(sc.nextLine());
		}
		Collections.shuffle(items);
		
		//출력
		for(int i =0; i<count;i++) {
			System.out.println( names.get(i)+ "->"+items.get(i));
		}
		
	 
	 
	 
	}
}
