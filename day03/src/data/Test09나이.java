package data;

public class Test09나이 {
	public static void main(String[] args) {
		//입력
		int current = 20231206;
		int birth = 20000101;
		
		//계산
		int currentYear = current / 10000;
		int currentMonth = current % 10000 / 100;
		int birthYear = birth / 10000;
		int birthMonth = birth % 10000 / 100;
		
		int now = currentYear * 12 + currentMonth;
		int before = birthYear * 12 + birthMonth;
		int gap = now - before;
		//System.out.println(gap);
		
		int age = gap / 12;
		//출력
		System.out.println(age);
	}
}

