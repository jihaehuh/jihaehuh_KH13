package api.lang.string2;

public class Test07이메일검사 {
public static void main(String[] args) {
	
	
	
	String email ="stwesd@";
	  String regex = "^[a-z0-9][_\\-a-z0-9]{4,19}[@]{1}$";
		System.out.println(email.matches(regex));
	}
}
