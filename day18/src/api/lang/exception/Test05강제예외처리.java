package api.lang.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test05강제예외처리 {
	public static void main(String[] args) {
		//예외(Exception)
		//-프로그램 실행 중에 발생하는 돌발 상황
		//-프로그래밍 기법으로 해결 가능
		//에러(Error)
		//-=프로그램이 실행되지 않는 상황
		
		
		
		//근데 try부분이 길어지면 catch도 똑같이 길어져야하는데 너무 번거롭자나!!!
		
		//문제 : 예외를 해결 했는지도 모르겠고 catch가 너무 많다
		//해결: 
		//-올인원 catch 블록을 구현한다
		//- 결론 : 앞으로 모든 catch 블록은 Exception으로 만든다. 끝!
		
		
		//********정상 Plan A****************===try
		
		try {//plan A
		//(Q) 사용자에게 귤 개수와 인원 수를 입력받아 1인당 개수와 나머지 구하기
		Scanner sc = new Scanner(System.in);
		System.out.println("귤 개수 : ");
		int mandarin = sc.nextInt();  //예외 발생 예상 위치
		if(mandarin<0) {//귤 개수가 음수라면 문제가 된다 (자바는 모르네?)
			//Exception ex = new Exception();
			//throw /*예외객체*/ex;
			throw new Exception(); //한줄로 쓰려면 이렇게 쓴다
		}
		System.out.println("인원 수 : ");
		int people = sc.nextInt();		//예외 발생 예상 위치
		if(people <0) {//인원수가 음수라면 문제가 된다(자바는 모르네?)
			throw new Exception();	
			}
		int dist = mandarin /people ;		//예외 발생 예상 위치
		int rest = mandarin % people;	
		System.out.println("한 사람당 " + dist + "개 씩 줄 수 있습니다.");
		System.out.println("다 주면 "+ rest +"개 남네요.");
		}
		//**********************************************************
		
		//*********비상 Plan B 는 두개**********===catch 
		//catch(RuntimeException e){ //PlanB
		catch(Exception e) { //PlanB
		//catch(Object e) {//error 
		//catch(Throwable e) {//PlanB (Error까지 처리된다)
			System.out.println("프로그램 오류 발생 ");//-잘못된 입력 에러 &&나누기 에러
		}
		
		//***********************************************************
		
	}
}
