//풀이 1
/*package data2;

public class Test03급여계산기 {
	public static void main(String[] args) {
		//입력
		int salary = 3000000;
		
		//계산
		
		//출력
		System.out.println(salary * 0.045);//국민연금
		System.out.println(salary * 0.0709);//건보료
		System.out.println(salary * 0.0709 * 0.1281);//장기요양
		System.out.println(salary * 0.009);//고용보험
	}
}
*/


//풀이 2

/*package data2;

public class Test03급여계산기 {
	public static void main(String[] args) {
		//입력
		int salary = 3000000;
		
		//계산
		double pension = salary * 0.045;//국민연금
		double health = salary * 0.0709;//건보료
		double care = health * 0.1281;//장기요양
		double emp = salary * 0.009;//고용보험
		double actual = salary - pension - health - care - emp;
		
		//출력
		System.out.println(actual);
		System.out.println(pension);
		System.out.println(health);
		System.out.println(care);
		System.out.println(emp);
		
	}
}
*/
//풀이3
/*
package data2;


public class Test03급여계산기 {
	public static void main(String[] args) {
		//입력
		int salary = 3000000;
		
		//계산
		//- 변환 연산을 사용하여 double을 int로 바꿔서 저장
		int pension = (int) (salary * 0.045);//국민연금
		//int pension = salary * 45 / 1000;
		int health = (int) (salary * 0.0709);//건보료
		int care = (int) (health * 0.1281);//장기요양
		int emp = (int) (salary * 0.009);//고용보험
		int actual = salary - pension - health - care - emp;
		
		//출력
		System.out.println(actual);
		System.out.println(pension);
		System.out.println(health);
		System.out.println(care);
		System.out.println(emp);
	}
}
*/

//풀이4
package data2;

public class Test03급여계산기 {
	public static void main(String[] args) {
		//입력
		int salary = 3000000;
		
		double pensionRate = 4.5;
		double healthRate = 7.09;
		double careRate = 12.81;
		double empRate = 0.9;
		
		//계산
		//- 변환 연산을 사용하여 double을 int로 바꿔서 저장
		int pension = (int) (salary * pensionRate / 100);//국민연금
		//int pension = salary * 45 / 1000;
		int health = (int) (salary * healthRate / 100);//건보료
		int care = (int) (health * careRate / 100);//장기요양
		int emp = (int) (salary * empRate / 100);//고용보험
		int actual = salary - pension - health - care - emp;
		
		//출력
		System.out.println(actual);
		System.out.println(pension);
		System.out.println(health);
		System.out.println(care);
		System.out.println(emp);
	}
}
