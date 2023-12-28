/*
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
*/
package api.lang.string2;

public class Test07이메일검사 {
	public static void main(String[] args) {

		String email = "hwang@khacademy.com";

		//String regex = "^[a-z0-9][a-z0-9-_]{4,19}@[a-z]{3,20}(\\.co\\.kr|\\.com|\\.net|\\.org|\\.dev)$";
		String regex = "^[a-z0-9][a-z0-9-_]{4,19}@[a-z]{3,20}(\\.[a-z]{3}|(\\.[a-z]{2}){2})$";

		if(email.matches(regex)) {
			System.out.println("올바른 이메일 입니다");
		}
		else {
			System.out.println("잘못된 이메일 형식입니다 (ex : admin@khacademy.com)");
		}

	}
}