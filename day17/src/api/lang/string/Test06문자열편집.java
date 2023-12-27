package api.lang.string;

public class Test06문자열편집 {
public static void main(String[] args) {
	//문자열은 불변(immutable)이다.
	//-편집 명령을 쓰면 무조건 신규 문자열이 나온다
	
	String word = "Hello Java!";
	String upper = word.toUpperCase();
	System.out.println("대문자 = "+ upper);
	System.out.println("소문자 = "+ word.toLowerCase());
	
	//문자열 자르기 - substring()
	//원본을 자르는것이 아니라 카피해서 잘라서 새로 만든다
	System.out.println("자르기 = "+ word.substring(0,4)); //마우스 위치로 생각 (0부터)
	System.out.println("자르기 = "+ word.substring(6)); //하나만 알려주는 건 6부터 끝까지 
	
	//불필요한 공백 제거 - trim(),strip()
	//띄어쓰기도 쓸데없는 기준이 있음
	String url = "              www.naver.com                 ";

	System.out.println("여백제거 = "+ url.trim()); //아스키코드만(구식명령) (ㄱ+한자키 누르면 공백 )
	System.out.println("여백제거 = "+ url.strip());//유니코드도(최신명령)
	
	//문자열 치환  (이클립스는 컨트롤 +F키)(찾아 바꾸기 )-replace()
	String text = "나는 피자가 좋아요";
	System.out.println("치환 = "+ text.replace("피자","자바"));
	
	//문자열 분리 -split()
	String[] parts =text.split(" ");
	for(int i =0; i <parts.length; i++) {   //반복문 아님 배열임
		System.out.println("분리 = " + parts [i]);
	}






}
}
