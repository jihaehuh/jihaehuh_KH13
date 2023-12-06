package data2;

public class test06페이지번호계산기 {
	public static void main(String[]args) {
		
		//입력
		int myPageNum =275;
	//	271~280   (270~279)
		int first = 1;
		int last = 10;
		
		int a = (myPageNum-1) /10*10+first;
		int b = (myPageNum-1) /10*10+last;
		
		System.out.println(a);
		System.out.println(b);
		
		//계산
	
		int firstResult =(myPageNum-1)/10*10+1;
		System.out.println(firstResult);
		int lastResult=(firstResult-1)/10*10+1;
		System.out.println(lastResult);
		// 출력
		//System.out.println(resultfirstPagenum+"부터"+resultlastpagenum);
		
		
		
	
		
	}
}
