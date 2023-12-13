package array;

public class Test04배열계산 {
	public static void main(String[] args) {
	
		//점수 데이터 준비
		int[] scores = new int[] {90, 67, 75, 88, 52, 59, 90, 92, 61, 72};
		
		//[1] 불합격자(60점 미만) 점수를 출력(+인원수, 총점, 평균)
		for(int i=0; i < scores.length; i++) {
			if(scores[i] < 60) {
				System.out.println("불합격자 점수 = " + scores[i]);
			}
		}
		
		System.out.println("----");
		
		//[2] 성적우수자(90점 이상) 점수를 출력(+인원수, 총점, 평균)
		for(int i=0; i < scores.length; i++) {
			if(scores[i] >= 90) {
				System.out.println("성적우수자 점수 = " + scores[i]);
			}
		}

		System.out.println("----");
		
		//[3] 총점과 전체 평균을 출력
		int total = 0;
		for(int i=0; i < scores.length ; i++) {
			//System.out.println("점수 = " + scores[i]);
			total += scores[i];
		}
		System.out.println("총점 = " + total);
		
		double average = (double)total / scores.length;
		System.out.println("평균 = " + average);
		
		System.out.println("----");
		
		//[4] 만약 80점인 학생이 전학을 왔을 때 예상되는 등수를 구하세요
		//= 1 + 80점을 초과하는 학생의 카운트
		int rank = 1;
		int point = 80;
		for(int i=0 ; i < scores.length ; i++) {
			if(scores[i] > point) {
				//System.out.println("점수 = " + scores[i]);
				rank++;
			}
		}
		
		System.out.println(point+"점의 예상 순위 = " + rank);
	}
}









