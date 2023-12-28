package api.lang.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test01예외처리2 {
	public static void main(String[] args) {
		//예외(Exception)
		//-프로그램 실행 중에 발생하는 돌발 상황
		//-프로그래밍 기법으로 해결 가능
		//에러(Error)
		//-=프로그램이 실행되지 않는 상황
		
		//********정상 Plan A****************===try
		
		try {//plan A
		//(Q) 사용자에게 귤 개수와 인원 수를 입력받아 1인당 개수와 나머지 구하기
		Scanner sc = new Scanner(System.in);
		System.out.println("귤 개수 : ");
		int mandarin = sc.nextInt();  //예외 발생 예상 위치
		System.out.println("인원 수 : ");
		int people = sc.nextInt();		//예외 발생 예상 위치
		
		int dist = mandarin /people ;		//예외 발생 예상 위치
		int rest = mandarin % people;	
		System.out.println("한 사람당 " + dist + "개 씩 줄 수 있습니다.");
		System.out.println("다 주면 "+ rest +"개 남네요.");
		}
		//**********************************************************
		
		//*********비상 Plan B 는 두개**********===catch 
		catch(InputMismatchException e){//PlanB1 -잘못된 입력 에러
			System.out.println("입력이 잘못되었습니다");
		}
		catch(ArithmeticException e){//planB2 - 나누기 에러
			System.out.println("인원수는 0일 수 없습니다");
		}
		//***********************************************************
		
		
		//근데 try부분이 길어지면 catch도 똑같이 길어져야하는데 너무 번거롭자나!!!
	}
}
