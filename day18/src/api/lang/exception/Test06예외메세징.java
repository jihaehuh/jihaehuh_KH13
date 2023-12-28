package api.lang.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test06예외메세징 {
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
			//다양한 예외들이 모이다보니 ..구분 내지는 추가정보를 얻고싶다
			//예외가 발생하면 catch블록의 매개변수에 정보가 들어오니 이것을 분석!
			
			//java.lang.ArithmeticException: (예외이름)/ by zero(예외 메세지)
			//System.out.println(e);
			//System.err.println(e.getMessage()); //예외메세지만 추출
			
			if(e.getMessage()==null) {//예외메세지가 없다면
				System.err.println("예외발생");  //내가 설정한 예외처리가 아니라면 기본 메세지
			}
			else {
				System.err.println(e.getMessage()); //내가설정한 예외처리일때 나오는 메세지
				
			}
			
		}
		
		//***********************************************************
		
	}
}
