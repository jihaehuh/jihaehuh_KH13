package oop.keyword6;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		//입력 받기 
		Scanner sc = new Scanner(System.in);
		System.out.print("타이틀 : ");
		String title = sc.next();
		System.out.println("폭 , 높이 순서대로 입력");
		int width = sc.nextInt();
		int height = sc.nextInt();
		
		//출력 
		GameScreen screen = new GameScreen(title, width, height);
		screen.information();
	}
}
