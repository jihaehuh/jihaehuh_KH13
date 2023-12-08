/*package condition2;

public class Test02지하철요금 {
	public static void main(String[]args) {
		int age=15;
		int deposit =500;
		
		//조건의 우선순위를 잘 생각해서 맨위로 올려줘야한다.
		
		
		if(age>=0 && age>8) {
		System.out.println("무료입니다.");
		}
		if(age>=8 && age>14) {//8세 이상 14세미만
			int charge =500;
			int cost =charge +deposit;
			System.out.println(cost+"원 입니다.");
		}
		else if(age>=14 && age>20) {//14세 이상20세 미만
			int charge1 =800;
			int cost1=charge1 +deposit;
			System.out.println(cost1+"원 입니다.");
		}
		else if(age>=20 && age>65) {//20세 이상 65세 미만
			int charge2 =1400;
			int cost2=charge2 +deposit;
			System.out.println(cost2+" 원 입 니다.");
		}
		else{// 65세이상
			System.out.println("무료입니다.");
		}
	}
}
*/
package condition2;

public class Test02지하철요금 {
	public static void main(String[]args) {
		//가장 쓸데 없는 범위는 뭘까? 
		//-가장 넓은 범위를 가지고 있는 것을 먼저 잡는게 좋다.
		//입력
		int age =25;

		//계산 과정을 조건으로 만들꺼임
		int price; //변수를 우선 선언만 해줌
		if(age >=65 || age <8) {//65세 이상 이거나 8세 미만(어르신 또는 영유아)
			price =0;	
		}
		//else if(age >=20 &&age<65) //이미 위에서 한번 물어봤음
		else if(age >=20) {
			price=1400;
			
		}
		else if(age >=14) {
			price=800;
		
		}
		else {
			price =500;

		}
		
		int card =500;
		int result = price+card;
		
		//출력
		System.out.println("요금 :"+price+"원");
		System.out.println("카드보증금"+ card+"원");
		System.out.println("결제 금액 :"+result+"원");
	
	}
}