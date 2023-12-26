package api.lang.string;

import java.util.Scanner;

public class Test03로그인 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("id :");
	String Id= sc .next();
	
	System.out.println("pw :");
	String Pw = sc.next();
	
	//String kh = new String("khacademy");
	
	//String ad = new String("adminuser");

	if(Id.equalsIgnoreCase("khacademy") && Pw.equalsIgnoreCase("adminuser") ) {
		System.out.println("로그인 되었습니다.");
	}
	else{
		System.out.println("입력한 정보가 잘못되었습니다.");
	}
	}
}
