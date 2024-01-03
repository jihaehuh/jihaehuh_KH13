package api.util.collection2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test05집합연산 {
	public static void main(String[] args) {
		
		//서로 다른 두개의 집합을 준비
		Set<Integer> a = Set.of(10,20,30,60);
		Set<Integer> b = Set.of(30,40,50,60);
		
		//합집합(union)
		Set<Integer>union =new TreeSet<>();  //treeset이라 정렬까지 한번에 가능
		//List<Integer> union = new ArrayList <>();
		union.addAll(a);
		union.addAll(b);
		System.out.println("union = "+ union);
		
		//교집합(intersection)
		Set<Integer>intersect = new TreeSet<>();
		intersect.addAll(a); //a는 전부 추가
		intersect.retainAll(b); //b와 겹치는 부분만 남겨라
		System.out.println("intersection = "+ intersect);
		
		//차집합(except,minus)
		Set<Integer> minus = new TreeSet<>();
		minus.addAll(a); //a는 전부 추가
		minus.removeAll(b); //b에  포함된 내용을 제거해라
		System.out.println("minus = "+minus);
	}
}
