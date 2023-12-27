package api.lang.string2;

import java.util.Scanner;

public class Test07이메일검사 {
public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("이메일을 입력하세요:");
		//String email = sc.nextLine();
		
		//String emailId =email.substring(0,'@');
		//String eameilOrgan =email.substring('@','.');
		//String emailExten = email.substring('.',0);
		 String email ="stwesd07@nave9r.com";
		 String emailId="stwesd07";
		 String eameilOrgan ="@nave9r";
		 String emailExten =".com";
	  
		 String regex = "^[a-z0-9][_\\-a-z0-9]{4,19}@[a-zA-Z0-9]{3,20}(\\.co.kr|\\.com|\\.net|\\.org|\\.dev)$";
		 String regexId ="^[a-z0-9][_\\-a-z0-9]{4,19}$";
		 String regexOrgan="^@[a-zA-Z0-9]{3,20}$";
		 String regexExten ="^(\\.co.kr|\\.com|\\.net|\\.org|\\.dev)$";
		  
		 
		 System.out.println(emailId.matches(regexId));
		 System.out.println(eameilOrgan.matches(regexOrgan));
		 System.out.println(emailExten.matches(regexExten));
		 System.out.println(email.matches(regex));
	}
}
