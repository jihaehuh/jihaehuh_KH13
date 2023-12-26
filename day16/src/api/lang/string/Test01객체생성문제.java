/*
 * api.lang.string 패키지
java.lang 패키지에 있는 StringBuffer 클래스의 문서를 읽고 다음
 요구사항에 대한 코드를 작성하세요
(Test01객체생성문제)

객체 생성
a라는 이름으로 비어 있는 객체 생성  -비어있는 생성자를 찾아라
b라는 이름으로 hello라는 글자를 저장한 객체 생성  -String 생성자 찾기
a와 b의 요약 정보를 출력
a와 b의 보관중인 글자수를 각각 출력
a와 b에 각각 java라는 글자를 추가
a와 b의 요약 정보와 보관 중인 글자 수를 다시 출력
 */
//요약 은 toString 을 사용함
//글자수는 length 사용
//추가는 append사용
//Stringbuffer() 기본생성자

package api.lang.string;

public class Test01객체생성문제 {
	    public static void main(String[] args) {
	        // a라는 이름으로 비어 있는 객체 생성
	        StringBuffer a = new StringBuffer();

	        // b라는 이름으로 hello라는 글자를 저장한 객체 생성
	        
	        StringBuffer b = new StringBuffer("hello");

	        // a와 b의 요약 정보를 출력
	        //System.out.println("a의 요약 정보: " + a.toString());
	        //System.out.println("b의 요약 정보: " + b.toString());
	        System.out.println("a= "+ a); //toString은 생략해도 출력시 동일한 효과가 나온다.
	        System.out.println("b= "+ b); //toString은  데이터를 나타내는 문자열을 반환합니다. =요약
	        
	        // a와 b의 보관중인 글자수를 각각 출력
	        System.out.println("a의 글자 수: " + a.length());   //length는 길이(문자수)를 반환합니다 =글자수 세기
	        System.out.println("b의 글자 수: " + b.length());  //b.length() 이거는 메소드이다.

	        // a와 b에 각각 java라는 글자를 추가
	        a.append("java");  //-뭘 좋아할지 몰라서 다 준비해놨어 할만큼 다 할 수있게 준비 되어있다.
	        b.append("java");  //-(boolean b),(char c),,(char[] str),(char[] str, int offset, int len),(double d),(float f),(int i),(long lng),....등등 엄청 많음

	        // a와 b의 요약 정보와 보관 중인 글자 수를 다시 출력
	        System.out.println("a의 요약 정보: " + a.toString());
	        System.out.println("b의 요약 정보: " + b.toString());
	        System.out.println("a의 글자 수: " + a.length());
	        System.out.println("b의 글자 수: " + b.length());
	    }
}

