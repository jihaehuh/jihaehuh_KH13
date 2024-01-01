package api.util.scanner;

import java.util.Scanner;

public class Test01Scanner클래스 {
	public static void main(String[] args) {
		//Scanner클래스
		String song = "노는게 제일좋아 친구들 모여라 \n언제나 즐거워\n뽀롱뽀롱뽀롱뽀롱뽀로로";
		//System.out.println(song);
		
		//.next()는 "단어"를 읽는 명령(공백전까지)
		//.nextLine()은 "한줄"을 읽는 명령(\n 전까지)
		Scanner sc = new Scanner(song);
		
		while(/*true sc.hasNext()*/sc.hasNextLine()) {//= 더 읽을게 있다면 계속 하세요
			//System.out.println(sc.hasNext()); //다음이 있냐
			//if(sc.hasNext()== false)break; //더 읽을게 없다면 그만하세요 = 더 읽을게 있다면 계속 하세요
			System.out.println(sc.next());
		}
		sc.close(); //통로형 객체를 정리하는 메소드
		/*
		System.out.println(sc.next());
		System.out.println(sc.next());
		System.out.println(sc.next());
		System.out.println(sc.next());
		*/
	}
}
