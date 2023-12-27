
/*
package api.lang.string;

import java.util.Scanner;

//369 게임이랑 7이 들어가는 숫자 예제랑 비슷한 문제
public class Test06공포의쿵쿵따 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		String firstWord = "바나나";
		boolean isCorrect = true;

        System.out.println(firstWord + "! 쿵쿵따!");
        while (isCorrect) {
            String user = sc.next();

            if (user.length() != 3) { //3글자
                System.out.println("땡! 게임오버!");
                isCorrect = false;
            }
            else if (user.equals(firstWord.length() - 3)) {
                firstWord = user;
                System.out.println(firstWord + "! 쿵쿵따!");
            } else {
                System.out.println("땡! 게임오버!");
                isCorrect = false;
            	}
           }
        }
	}

*/

 

		
package api.lang.string;

import java.util.Random;
import java.util.Scanner;

public class Test06공포의쿵쿵따 {
    public static void main(String[] args) {
     //(Q)사용자가 입력한 단어가 "바나나"와 이어지는지 검사 
    	//1. 사용자가 입력한 단어가 "나"로 시작하는지 검사
    	//3 .입력 추가
    	Scanner sc = new Scanner(System.in);
        //6. 랜덤 추가 
    	//String given ="바나나";
    	String[]words = new String[] {
    			"바나나","물고기","초콜릿","이발소","컴퓨터"
    	};
    	
    	Random r = new Random();
    	
    	int position =r.nextInt(words.length);
    	String given = words[position];
    	
    	int round=1; //1라운드 시작
    	
    	
    	//5.반복추가
    	while (true) {
        
        	
       // String given ="바나나"; //밖으로 빼고 누적 계산해줘야함
        System.out.println(given + "! 쿵쿵따!");
        //String input ="나트륨";
        String input =sc.next();   
        
        /*2.given 의 마지막 글자로 input이 시작
    	given 의 마지막 글자 == input의 시작글자 */
    	//char last = given.charAt(2);//+2지점 글자
    	char last = given.charAt(given.length()-1); //마지막 글자
    	char first = input.charAt(0); 
    	//System.out.println(first==last);  //원시형이라서 비교연산으로 비교
    	//System.out.println(input.startsWith("나"));
    	//System.out.println(input.charAt(0) == '나');
    	
    	
    	//4. 판정 추가 
    	boolean isLengthOk = input.length() == 3;
    	boolean isConnect =first ==last;
    	
    	//System.out.println("글자수 = "+ isLengthOk);
    	//System.out.println("연결 = "+ isConnect);
    	
    	boolean isOk = isLengthOk && isConnect;
    	if(isOk) {//제시어를 입력 값으로 변경
    		given = input;
    		round++; //맞추면 라운드 증가
    	}
    	else { //입력이 잘못되었다면
    		break;
    	}
    	System.out.println("게임 끝 !");
    	System.out.println("총" + round +"라운드까지 진행");
    	
    	}
    	
    	
    }
    
}


/*
 * package api.lang.string;

import java.util.Random;
import java.util.Scanner;

public class Test05공포의쿵쿵따8 {
	public static void main(String[] args) {
		//(Q) 업그레이드(제시어랜덤, 라운드추가)
		Scanner sc = new Scanner(System.in);

		String[] words = new String[] {
			"바나나", "물고기", "초콜릿", "이발소", "컴퓨터"
		};
		Random r = new Random();

		//String given = "바나나";
		int position = r.nextInt(words.length);
		String given = words[position];
		int round = 1;//1라운드부터 시작
		while(true) {
			System.out.print(given+"! 쿵쿵따! ");
			String input = sc.next();
			char last = given.charAt(given.length()-1);
			char first = input.charAt(0);

			//판정계산
			boolean isLengthOk = input.length() == 3;
			boolean isConnect = first == last;
			boolean isOk = isLengthOk && isConnect;
			if(isOk) {
				//제시어를 입력값으로 변경
				given = input;
				round++;//맞추면 라운드 증가
			}
			else {//입력이 잘못되었다면
				break;
			}
		}

		//게임오버처리
		System.out.println("게임 끝!");
		System.out.println("총 "+round+"라운드까지 진행");

	}
}
*/
