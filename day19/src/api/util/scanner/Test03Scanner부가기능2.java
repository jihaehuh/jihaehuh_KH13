package api.util.scanner;

import java.util.Scanner;

public class Test03Scanner부가기능2 {
	public static void main(String[] args) {
		String colors = "빨강 주황 노랑 초록 파랑 남색 보라";
		
		//패턴을 알려주는 방법도 있다
		Scanner sc = new Scanner(colors);
		String find = sc.findInLine("[가-힣]+");
		System.out.println("find = "+ find);
		
		sc.close();
	}
}
//스캐너는 키보드 입력뿐만아니라 이렇게 사용할 수 있는 기능이 많다