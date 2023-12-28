package api.lang.String3;

public class Test01문자열더하기 {
	public static void main(String[] args) {
		//문자열이 불변이어서 생기는 단점 살펴보기(ex :별생성)
		
		String star ="";
		long begin = System.currentTimeMillis(); //현재 시간을 밀리초(ms)로 반환 _1000분의 1초 =0.001초
		for(int i =1; i <=10; i++) {
			star +="*";
		}
		long end = System.currentTimeMillis();
		long gap =end -begin;
		//System.out.println("star = "+ star);
		System.out.println("gap = "+gap);  //컴퓨터 성능에 따라 초차이가 난다

			//시간복잡도/공간복잡도
			//가장 최악: 빅 오 /최상:빅 오메가/ 평균: 빅 세타
			//구조상 문제발생: 
			//원래잇던 별10에 한개 추가하려면  새로운 공간에 11개를 새로 만들고 
			//원래 있던 리모콘을 끊어내고 새로운곳에 연결하다보니 별을 낭비하게 되고 시간도 더쓰게 된다.

	}
}
