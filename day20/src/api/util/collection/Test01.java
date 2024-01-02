package api.util.collection;

import java.util.ArrayList;
import java.util.TreeSet;

public class Test01 {
	public static void main(String[] args) {
		//Collection
		//-데이터를 무한대로 저장하기 위한 저장소,저장 시스템
		//-배열과 비슷함 하지만 가변 /불변 차이가 있다(개수가 확실하면 배열사용, 불확실은 TreeSet사용)
		//-내용물(Generic Type)을 같이 작성하는 것을 권장한다
		
		//1.아무 표시 없이 저장소를 만들었으므로 경고 발생(Object 저장)
		TreeSet a = new TreeSet();
		
		//2.<String>표시를 해서 저장소를 만들었으므로 경고 없음( String 저장)
		TreeSet<String> b = new TreeSet<String>();
		
		//3.우측에는 Generic Type을 생략할 수 있다.
		TreeSet<String> c = new TreeSet<>();
		
		ArrayList<String>d = new ArrayList<>(); //자료형 옆에 내가 뭘 저장할지 만들어줘야한다 <String>
		//=배열이랑 가장 비슷함
		
		
		//데이터 추가 .add()명령 사용
		c.add("피카츄");   d.add("피카츄");
		c.add("라이츄");   d.add("라이츄");
		c.add("파이리");   d.add("파이리"); 
		c.add("꼬부기"); 	 d.add("꼬부기"); 
		
		//출력
		System.out.println("c = "+c);  //알아서 정렬해서 저장함 (전화번호부) 	//TreeSet은 오름차순으로 저장하는 특징 //정렬을 최우선 하는 저장소
		System.out.println("d = "+d); //데이터를 집어넣은 순서대로 저장함(통화목록) //순서를 최우선시하는 저장소
		
		
		
		
		
	}
}
