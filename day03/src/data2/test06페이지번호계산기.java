/*package data2;

public class test06페이지번호계산기 {
	public static void main(String[]args) {
		
		//입력
		int myP =275;
		//	271~280   (270~279)
		int firstN = 1;
		int lastN = 10;
		//계산
		int firstR = (myP-1) /10*10+firstN;
		int lastR = (myP-1) /10*10+lastN;
		// 출력
		System.out.println(firstR);
		System.out.println(lastR);
	
		
	}
}
*/
/*
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
*/
//강사님 풀이

package data2;

public class test06페이지번호계산기 {
	public static void main(String[]args) {
		
		//입력
		int page=275;
		//	271~280   (270~279)
		int firstN = 1;
		int lastN = 10; 
		int size =5;  //보여줄 번호의 개수
		//진짜 게시판에는 글개수도 들어감
		//int count =10;
		
		//계산
		int begin = (page-1)/10*10+firstN;
		int end = (page-1) /10*10+lastN;
		//int end=begin+(size-1);
		//int count = (page-1)count *count+firstN
		
		// 출력
		System.out.println("시작번호 : "+begin);
		System.out.println("종료번호 : "+end);
	
		
	}
}

