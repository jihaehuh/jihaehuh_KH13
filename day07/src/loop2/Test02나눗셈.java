/*Test02나눗셈
어떤 숫자가 입력되었을 때 이 숫자의 약수 개수를 구하여 출력

어떤 숫자가 입력되면 1부터 해당 숫자까지 나누어서 떨어지는 숫자의 개수를 구하여 출력
예를 들어 5가 입력될 경우 5를 1, 2, 3, 4, 5로 나누어 떨어지는지 확인 (2개 / 1, 5)
예를 들어 6이 입력될 경우 6을 1, 2, 3, 4, 5, 6으로 나누어 떨어지는지 확인(4개 / 1, 2, 3, 6)
*/

package loop2;

public class Test02나눗셈 {
	public static void main(String[]args) {
		//입력
		
		int num =271;				//숫자를 입력 받아
		int count =0;
		//계산 
		for(int i =1; i <=num; i++) {//숫자를 나눠 1-5까지로
			//System.out.println(num+"%"+i+"="+num%i); 			
			//System.out.println(num %i);  //그리고 나머지가 0으로 떨어지는
			if(num % i ==0) {
				count++;//개수를 센다
				} 
				//System.out.println(count);
			}										
		//System.out.println(num %1);  //System.out.println(5%1);
		//System.out.println(num %2); //System.out.println(5%2);
		//System.out.println(num %3); //;System.out.println(5%3);
		//System.out.println(num %4); //;System.out.println(5%4);
		//System.out.println(num %5); //System.out.println(5%5);
		//출력
		System.out.println("약수 개수 = "+ count+"개" ); //최종 결과_개수만 출력	
		if(count ==2) {
			System.out.println(" 이 숫자는 소수 입니다.");
		}
		else {
			System.out.println(" 이 숫자는 소수가 아닙니다.");
		}
	}
}
