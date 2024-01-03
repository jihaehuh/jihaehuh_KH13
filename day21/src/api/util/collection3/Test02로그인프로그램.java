/*
 * Test02로그인프로그램
Map을 만들고 다음 아이디와 비밀번호를 저장해둔 뒤 사용자에게 아이디와 비밀번호를 입력받아 
로그인을 판정하는 프로그램을 구현하세요

(아이디) khadmin , (비밀번호) admin1234
(아이디) khstudent, (비밀번호) student1234
(아이디) khteacher, (비밀번호) teacher1234
(아이디) khmanager, (비밀번호) manager1234

사용자가 아이디와 비밀번호를 검사하여 통과 시 로그인 성공 출력
통과하지 못할 경우 입력하신 정보가 일치하지 않습니다 출력
 */

package api.util.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Test02로그인프로그램 {
	public static void main(String[] args) {
		
		//저장소 생성
		//Map<String,String> datalist = new TreeMap<>(); //Key순서로 정렬
		Map<String,String> datalist = new HashMap<>();
		
		//데이터 초기값
		datalist.put("khadmin","admin1234");
		datalist.put("khstudent","student1234");
		datalist.put("khteacher","teacher1234");
		datalist.put("khmanager","manager1234");
		
		//데이터 검색
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력: ");
		String id = sc.nextLine();
		System.out.println("비밀번호 입력: ");
		String pw = sc.nextLine();
		
		//판정
		/*//주의 사항은 아이디는 맞고 비번이 틀릴 경우엔 그냥 지나가고 아이디가 틀리면 에러뜬다 (이유는 패스워드가 널값이라서)
		 boolean idOk = datalist.containsKey(id);
		String dbPassword = datalist.get(id);
		//(주의) 있을 지 없을 지 불확실하다면 null을 무엇보다 먼저 검사해야함
		boolean passOk = dbPassword != null && dbPassword.equals(password);
		boolean isOk = idOk && passOk;
		if(isOk) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 정보가 일치하지 않습니다");
		}
		 */
		
		//if(datalist.containsKey(id)&&datalist.containsValue(pw)){//아이디가 존재하고 비밀번호가 존재하면
		if(datalist.containsKey(id) && datalist.get(id).equals(pw)){//아이디가 존재하고 아이디에 해당하는 비밀번호가 일치한다면
				System.out.println("로그인 성공");
		}
		else {
				System.out.println("입력하신 정보가 일치하지 않습니다.");
		}
	}
		
}

