/*Test03과속카메라
KH전자에서 개발한 과속단속 카메라는 다음 규칙에 따라 벌금을 
계산하도록 만들어져 있습니다.

50km를 초과하여 달리는 차량을 단속
벌금은 시작이 30000원
제한속도인 50km보다 10km 빨라질 때마다 벌금은 10000원씩 증가

자동차 속도를 입력받아 예상되는 벌금을 출력하세요
(벌금이 없으면 0원이라고 출력하면 됩니다)
*/


/*
package condition;

public class Test03과속카메라 {
	public static void main(String[] args) {
		//입력
		int speed = 42;

		//계산
		boolean over = speed > 50;

		//출력
		if(over) {
			System.out.println("벌금 ?원");
		}
		else {
			System.out.println("벌금 0원");
		}

	}
}
*/

/*
package condition;

public class Test03과속카메라2 {
	public static void main(String[] args) {
		//입력
		int speed = 60;

		//계산
		boolean over = speed > 50;

		//출력
		if(over) {
			int total = (speed - 50) / 10 * 10000 + 30000;
			System.out.println("벌금 "+total+"원");
		}
		else {
			System.out.println("벌금 0원");
		}

	}
}
*/

package condition;

public class Test03과속카메라 {
	public static void main(String[] args) {
		//입력
		int speed = 60;

		int limit = 50;//제한속도
		int per = 10;//벌금구간(km)
		int step = 10000;//벌금증가분(원)
		int base = 30000;//최저벌금(원)

		//계산
		boolean over = speed > limit;

		//출력
		if(over) {
			int total = (speed - limit) / per * step + base;
			System.out.println("벌금 "+total+"원");
		}
		else {
			System.out.println("벌금 0원");
		}

	}
}