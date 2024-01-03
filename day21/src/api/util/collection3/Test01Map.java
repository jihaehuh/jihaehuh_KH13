package api.util.collection3;

import java.util.HashMap;
import java.util.Map;

public class Test01Map {
	public static void main(String[] args) {
		//Map <K,V>
		//-두개의 데이터를 세트로 저장하는 저장소
		//-K(Key)는 중복이 불가능
		//-V(Value)는 중복이 가능
		//-HashMap,TreeMap -Tree랑 Hash 자체가 비선형구조이고 주목적은 탐색
		//-한개를 매우 빠르게 불러오는 것이 목적(개별관리)
		
		Map<String,Integer> people = new HashMap<>(); //long이 쓰고 싶으면 Long 
		//해쉬랑 트리는 빠른 탐색을 위해 사용
		
		
		//데이터 추가
		//people.add("유재석",50); //add()는 데이터를 한개 추가하는_ 명령 쓸수없는 코드
		people.put("유재석", 51);
		people.put("박명수", 52);
		people.put("정준하", 52);
		people.put("유재석",50); //같은 Key에 해당하는 Value 덮어쓰기
		
		people.put("김종국", 47);
		
		//데이터 검색-Key,Value 명령이 따로 존재한다
		System.out.println(people.containsKey("유재석"));//T
		System.out.println(people.containsKey("지석진"));//F
		System.out.println(people.containsValue(50));//T
		System.out.println(people.containsValue(55));//F
		
		//데이터삭제-key만가지고 지우거나 Key,Valu로 지우는 방법이 있다
		people.remove("박명수");
		//people.remove("박명수",52);
		
		
		//데이터 추출 -.get()
		System.out.println(people.get("유재석"));//50
		System.out.println(people.get("노홍철")); //null
		
		//개수확인
		System.out.println("개수 = "+people.size());
		//데이터는 두개를 넣었지만 1개에요 (그래서 읽을때 한 세트라고 한다)
		
		//출력
		System.out.println(people);
	}
}
