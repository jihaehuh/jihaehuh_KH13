package array4;

public class test03이차원배열초기화 {
	public static void main(String[]args) {
		
		//배열 생성
		int [][]dataset =new int[5/*줄*/][5/*칸*/];
		
		//데이터 초기화
		//위치 기준 or 값 기준
		/*
		dataset[0][0] =1;
		dataset[0][1] =2;
		dataset[0][2] =3;
		dataset[0][3] =4;
		dataset[0][4] =5;
		 */
		
		//데이터 초기화 -> 위치기준
		//어느세월에 다쓰냐..... 반복문으로 만들자!
		//int number =1;  //위치를 기준으로 하면 ...   -데이터를 순서대로 넣을때 좋다 
		//for(int i=0; i < dataset.length; i++) {
		//	for(int k=0; k <dataset[i].length; k++) {
			//	dataset[i][k] =number;
			//	number++;
		//	}
	//	}
		//값을 기준으로 하면 ..?
		//빙고판 은 값을 기준으로 위치를 무작위로 돌린다.
		
		//데이터 초기화-> 값 기준
		int x=0 ,y =0;   //좌표기준
		for(int i =1; i <=25; i++) {
			dataset [x][y]=i;
			y++; //오른쪽으로 가진다
			if(y==5 ) {
				//다음줄 첫 번째칸으로 위치를 변경 
				y=0;
				x++;
			}
		}
		
		//배열 출력
		for(int i=0; i < dataset.length; i++) {//줄
			for(int k=0; k < dataset[i].length; k++) {//칸
				System.out.print(dataset[i][k]);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}
