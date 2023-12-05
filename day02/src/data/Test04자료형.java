package data;

public class Test04자료형 {
	public static void main(String[]args) {
		//자료형이란?
		//-데이터를 저장하기 위해 구분하는 방법
		//-숫자는 크게 소수점 유무로 없으면 정수, 있으면 실수
		//-빠른 처리를 위해 각자 여러형태를 미리 정해두었다.
		//-정수 : byte,short,int,long (4가지) <int가 기본>
		//-실수 : float,double (2가지) <double이 기본>
		
		// 정수의 첫번째 특징 : 크기가 있다.
		int a = 10;  
		//int b = 2323333333;	//자리가 부족하다
		long b=2323333333L; 	//(해결법) 충분한 자리를 갖는 변수 long 사용(끝에 L붙이기!)
		System.out.println(b);
		
		//정수의 두번째 특징: 계산하다가 넘어갈 경우 뒤집힌다. (순환)
		//int c = 1234567 * 1234567;
		long c = 1234567 * 1234567L;		// 더 큰 변수를 사용해주기 (끝에 L붙이기!)
		System.out.println(c);  
		
		//(중요) 정수의 계산 결과는 정수가 나온다 (나눗셈에서도)
		int d =10;
		int e =3;
		System.out.println(d/e);		//몫
		System.out.println(d%e);	//나누기
	}
}
