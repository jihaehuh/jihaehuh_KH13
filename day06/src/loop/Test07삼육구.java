/*
 * Test07삼육구
1부터 99사이의 숫자 중 369게임상에서 박수를 쳐야하는 숫자들만 골라서 출력
 */



/*
package loop;

public class Test07삼육구 {
	public static void main(String[]args) {
		//1부터 99사이 
		//3 6 9 게임 박수 칠 숫자 출력
		for(int i =1; i <=99; i ++) {
			//if(3이 포함된다면)
			//if (10의 자리에 3또는 1의 자리에 3)
			boolean ten3 = i / 10 == 3 ;
			boolean one3 = i % 10 == 3;
			//if (10의 자리에 6또는 1의 자리에 6)
			boolean ten6 = i / 10 == 6 ;
			boolean one6 = i % 10 == 6;
			//if (10의 자리에 9또는 1의 자리에 9)
			boolean ten9 = i / 10 == 9 ;
			boolean one9 = i % 10 == 9;
			if ( ten3 ||one3) {
				System.out.println(i);
				}
			else if( ten6 ||one6 ) {
				System.out.println(i);
			}
			else if( ten9 ||one9 ) {
				System.out.println(i);
			}
			else {
			}
		}
	}
}	
*/
/*
package loop;

public class Test07삼육구4 {
	public static void main(String[] args) {

		//1부터 99사이의 3,6,9가 포함된 숫자 출력

		for(int i=1 ; i <= 99 ; i++) {//1부터 99 사이에서
			int ten = i / 10;//10의자리 추출
			int one = i % 10;//1의자리 추출

			boolean ten369 = ten == 3 || ten == 6 || ten == 9;
			//boolean ten369 == ten % 3 == 0;
			boolean one369 = one == 3 || one == 6 || one == 9;

			if(ten369 && one369) {//3, 6, 9가 포함된 숫자라면 - 박수
				System.out.println("짝짝");//출력
			}
			else if(ten369 || one369) {
				System.out.println("짝");
			}
			else {//박수x
				System.out.println(i);//출력
			}
		}

	}
}
*/
/*
package loop;

public class Test07삼육구3 {
	public static void main(String[] args) {

		//1부터 99사이의 3,6,9가 포함된 숫자 출력

		for(int i=1 ; i <= 99 ; i++) {//1부터 99 사이에서
			int ten = i / 10;//10의자리 추출
			int one = i % 10;//1의자리 추출

			boolean ten369 = ten == 3 || ten == 6 || ten == 9;
			//boolean ten369 == ten % 3 == 0;
			boolean one369 = one == 3 || one == 6 || one == 9;
			boolean has369 = ten369 || one369;

			if(has369) {//3, 6, 9가 포함된 숫자라면 - 박수
				System.out.println("박수");//출력
			}
			else {//박수x
				System.out.println(i);//출력
			}
		}

	}
}*/
/*
package loop;

public class Test07삼육구2 {
	public static void main(String[] args) {

		//1부터 99사이의 3,6,9가 포함된 숫자 출력

		for(int i=1 ; i <= 99 ; i++) {//1부터 99 사이에서
			int ten = i / 10;//10의자리 추출
			int one = i % 10;//1의자리 추출

			//boolean has369 = 십의자리에 3,6,9 또는 일의자리에 3,6,9;
			boolean has3 = ten == 3 || one == 3;
			boolean has6 = ten == 6 || one == 6;
			boolean has9 = ten == 9 || one == 9;
			boolean has369 = has3 || has6 || has9;

			if(has369) {//3, 6, 9가 포함된 숫자라면 - 박수
				System.out.println("박수");//출력
			}
			else {//박수x
				System.out.println(i);//출력
			}
		}

	}
}
*/
package loop;

public class Test07삼육구 {
	public static void main(String[] args) {

		//1부터 99사이의 3,6,9가 포함된 숫자 출력

		for(int i=1 ; i <= 99 ; i++) {//1부터 99 사이에서
			int ten = i / 10;//10의자리 추출
			int one = i % 10;//1의자리 추출

			//boolean has369 = 십의자리에 3,6,9 또는 일의자리에 3,6,9;
			boolean has3 = ten == 3 || one == 3;
			boolean has6 = ten == 6 || one == 6;
			boolean has9 = ten == 9 || one == 9;
			boolean has369 = has3 || has6 || has9;

			if(has369) {//3, 6, 9가 포함된 숫자라면
				System.out.println(i);//출력
			}
		}

	}
}
		
		
		
		
		
		
		
		
		
