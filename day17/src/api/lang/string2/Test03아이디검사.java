package api.lang.string2;

import java.util.Scanner;

public class Test03아이디검사 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
	     System.out.println("아이디를 입력하세요:");
	     
		  String Id = sc.nextLine();
		  String regex = "^[a-z0-9][_\\-a-z0-9]{4,19}$";
		  if(Id.matches(regex)) {//형식과 일치한다면
				System.out.println("멋진 아이디입니다!");
			}
			else {//형식과 일치하지 않는다면
				System.out.println("5~20자의 영문 소문자, "
						+ "숫자와 특수기호(_),(-)만 사용 가능합니다.");
	
			}
	}
}
