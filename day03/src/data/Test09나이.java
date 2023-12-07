

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

/*
package data;
public class Test09나이 {
	public static void main(String[] args) {
				int nY =2023,nM =12;
				int aY=2000,aM=1;
				int oneY=12;
				
				int y =nY-aY;
				int m =nM-aM;
				int tM=y*oneY+m;
				int age = tM/12;
				
				System.out.println("만"+age+"살");
				
				
	
 }	
}
*/