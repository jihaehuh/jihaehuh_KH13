package array2;

public class Test01최대값찾기 {
	public static void main(String[]args) {
		 //Q 가장 큰 데이터는 어디있어요?
		//(A) 1번
		//배열은 위치가 중요하다
		//[1]배열 만들기 
		int[]numbers = new int[] {30,50,20,10,60};   //30을 부르려면 numbers의 max
		int max =0; //0번이 가장 큰 위치라고 가정
		//1번부터 4번
		//for(int i=1; i <=4;i++) {  //1번부터 4번까지 반복
		for(int i=1; i <numbers.length;i++) {//1부터 마지막 까지 반복하며
			if(numbers[max] <numbers[i]) {
			
			max =i ; //위치를 갱신
		}
		}
		System.out.println("max = "+max);
		System.out.println("value= "+numbers[max]);
	}
}
