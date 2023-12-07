/*Test02비만계산기
BMI(체질량지수) 계산 공식은 다음과 같습니다.
키가 180cm, 몸무게가 80kg인 사람의 BMI 지수를 구하여 출력하세요
*/

package data2;

public class Test02비만계산기 {
	public static void main(String[]args) {
		double cm =180;
		double kg =80;
		double m =cm /100;
		double bmi =kg/(m*m);
		//double bmi =kg/m/m;
		
		System.out.println(bmi);
		
		
		
		
		}
	}