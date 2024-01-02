package api.util.collection;

import java.util.ArrayList;
import java.util.Random;

public class Test03로또추첨기 {
	public static void main(String[] args) {
		//[1] ArrayList를 만들고 숫자 6개를 저장한 뒤 출력
/*				ArrayList<Integer> lottoNumbers = new ArrayList<>();

				lottoNumbers.add(30);
				lottoNumbers.add(25);
				lottoNumbers.add(41);
				lottoNumbers.add(17);
				lottoNumbers.add(5);
				lottoNumbers.add(33);

				System.out.println(lottoNumbers);
			
			//[2] Random을 만들고 숫자를 랜덤으로 대체
			ArrayList<Integer> lottoNumbers = new ArrayList<>();
			Random r = new Random();

			lottoNumbers.add(r.nextInt(45) + 1);
			lottoNumbers.add(r.nextInt(45) + 1);
			lottoNumbers.add(r.nextInt(45) + 1);
			lottoNumbers.add(r.nextInt(45) + 1);
			lottoNumbers.add(r.nextInt(45) + 1);
			lottoNumbers.add(r.nextInt(45) + 1);

			System.out.println(lottoNumbers);
			
			//[3] 반복문으로 변환
			ArrayList<Integer> lottoNumbers = new ArrayList<>();
			Random r = new Random();

			for(int i=0; i < 6; i++) {
				lottoNumbers.add(r.nextInt(45) + 1);
			}

			System.out.println(lottoNumbers);
*/			
				//[4] 중복 해결(for)
				ArrayList<Integer> lottoNumbers = new ArrayList<>();
				Random r = new Random();

//				while(번호가 6개가 될때까지) {
				while(lottoNumbers.size() < 6) {
					int number = r.nextInt(45) + 1;
					if(lottoNumbers.contains(number) == false) {
						lottoNumbers.add(number);
					}
				}

				System.out.println(lottoNumbers);
					
					
	}
}
