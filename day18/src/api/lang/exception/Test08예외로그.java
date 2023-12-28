package api.lang.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test08예외로그 {
	public static void main(String[] args) {
		
		//********정상 Plan A****************===try
		
		try {//plan A
		//(Q) 사용자에게 귤 개수와 인원 수를 입력받아 1인당 개수와 나머지 구하기
		Scanner sc = new Scanner(System.in);
		System.out.println("귤 개수 : ");
		int mandarin = sc.nextInt();  //예외 발생 예상 위치
		if(mandarin<0) {
			//throw new Exception(); //한줄로 쓰려면 이렇게 쓴다
			throw new Exception("귤 개수는 음수일 수 없어요");
		}
		System.out.println("인원 수 : ");
		int people = sc.nextInt();		//예외 발생 예상 위치
		if(people <0) {
			//throw new Exception();	
			throw new Exception("인원수는 음수일 수 없어요");
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
			//예외가 발생했을때 나오는 메세지를 스택 트레이스(Stack Trace)라고 한다
			//스택 트레이스에는 예외,종류,원인,위치 등이 매우 상세하게 나온다
			//개발자한테는 도움이 되는 정보이므로 확인하고 싶다면?
			e.printStackTrace(); //개발할때는 얘를 쓰고 나중에 지우면 된다
			}
		}
		
		//***********************************************************
		
	}

