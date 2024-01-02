package api.util.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test05편의점게임 {
	public static void main(String[] args) {
		/*
		//[1] 사용자가 입력한 항목이 List에 포함되어 있는지 확인

		//- 저장소 준비
		List<String> memory = new ArrayList<>();

		memory.add("핫도그");
		memory.add("피자");
		memory.add("삼각김밥");

		//- 사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String input = sc.nextLine();

		//- 저장소 검사
		System.out.println(memory.contains(input));
		*/
		/*
		//[1] 사용자가 입력한 항목이 List에 포함되어 있는지 확인

		//- 저장소 준비
		List<String> memory = new ArrayList<>();

		memory.add("핫도그");
		memory.add("피자");
		memory.add("삼각김밥");

		//- 사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String input = sc.nextLine();

		//- 저장소 검사
		if(memory.contains(input)) {//입력한 적 있는 값이면
			System.out.println("게임 오버");
		}
		else {//입력한 적 없는 값이면
			System.out.println("계속 진행");
		}
		
		*/
		/*
		//[2] 반복 처리

		//- 저장소 준비
		List<String> memory = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		memory.add("핫도그");
		memory.add("피자");
		memory.add("삼각김밥");

		while(true) {
			//- 사용자 입력
			System.out.print("입력 : ");
			String input = sc.nextLine();

			//- 저장소 검사
			if(memory.contains(input)) {//입력한 적 있는 값이면
				System.out.println("게임 오버");
			}
			else {//입력한 적 없는 값이면
				System.out.println("계속 진행");
			}
		}
		*/
		/*
		//[3] 처음에 메모리가 비어있는 상태에서 시작하며, 겹치지 않을 경우 추가 

				//- 저장소 준비
				List<String> memory = new ArrayList<>();

				Scanner sc = new Scanner(System.in);

				while(true) {
					//- 사용자 입력
					System.out.print("입력 : ");
					String input = sc.nextLine();

					//- 저장소 검사
					if(memory.contains(input)) {//입력한 적 있는 값이면
						System.out.println("게임 오버");
						break;
					}
					else {//입력한 적 없는 값이면
						//System.out.println("계속 진행");
						memory.add(input);//단어 등록
					}
				}
		*/
		//[4] 게임 오버 시 여태까지 입력한 항목들을 출력

				//- 저장소 준비
				List<String> memory = new ArrayList<>();

				Scanner sc = new Scanner(System.in);

				while(true) {
					//- 사용자 입력
					System.out.print("입력 : ");
					String input = sc.nextLine();

					//- 저장소 검사
					if(memory.contains(input)) {//입력한 적 있는 값이면
						System.out.println("게임 오버");
						break;
					}
					else {//입력한 적 없는 값이면
						//System.out.println("계속 진행");
						memory.add(input);//단어 등록
					}
				}

				//memory의 모든 내용을 출력
				System.out.println("<여태까지 입력한 항목들>");
				for(int i=0; i < memory.size(); i++) {
					String item = memory.get(i);
					System.out.println("- " + item);
				}
		}
			
	}
