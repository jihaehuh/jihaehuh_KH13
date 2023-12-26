

package api.lang.string;

import java.util.Scanner;

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




/*
 * 
 * 
concat(String str)
지정된 문자열을 이 문자열의 끝에 연결합니다.
boolean
contains(CharSequence s)
이 문자열에 지정된 char 값 시퀀스가 ​​포함되어 있는 경우에만 true를 반환합니다.
		}boolean
		endsWith(String suffix)
		이 문자열이 지정된 접미사로 끝나는지 테스트합니다.
		boolean
		endsWith(String suffix)
		이 문자열이 지정된 접미사로 끝나는지 테스트합니다.
		
		
package api.lang.string;
import java.util.Scanner;

public class Test06공포의쿵쿵따 {
    public static void main(String[] args) {
        // 초기 제시어 설정
        String currentWord = "바나나";

        // Scanner 객체를 사용하여 사용자로부터 단어 입력 받기
        Scanner scanner = new Scanner(System.in);

        // 쿵쿵따 게임 시작
        while (true) {
            // 현재 제시어 출력
            System.out.println(currentWord + "! 쿵쿵따!");

            // 사용자에게 단어 입력 받기
            System.out.print("(" + currentWord.substring(currentWord.length() - 3) + ")");
            String userInput = scanner.nextLine();

            // 입력한 단어가 3글자가 아니면 게임 오버
            if (userInput.length() != 3) {
                System.out.println("땡! 게임오버!");
                break;
            }

            // 입력한 단어와 제시어의 마지막 3글자가 일치하면 제시어 변경
            if (userInput.equals(currentWord.substring(currentWord.length() - 3))) {
                currentWord = userInput;
            } else {
                // 일치하지 않으면 게임 오버
                System.out.println("땡! 게임오버!");
                break;
            }
        }

        // 게임 종료
        scanner.close();
    }
}


/*

package api.lang.string;

import java.util.Scanner;

public class Test06공포의쿵쿵따 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstWord = "바나나";
        boolean isCorrect = true;

        System.out.println(firstWord + "! 쿵쿵따!");

        while (isCorrect) {
            String user = sc.next();

            if (user.length() != 3) {
                System.out.println("땡! 게임오버!");
                isCorrect = false;
            } else if (user.equals(firstWord.substring(firstWord.length() - 3))) {
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
