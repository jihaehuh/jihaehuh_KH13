/*
 * Test02이차원배열생성
다음 데이터가 있을 때 이를 저장하고 출력하세요

점수만 있다면 1차원으로 만들테지만 
반 3개와 점수 12 개가있으므로 2차원으로 만든것이다.

2차원       1차원
	dataset		  [0]	    [1]		   [2]		   [3]
	[0]	1반 : 180.3 , 165.2 , 177.9 , 158.2
	[1]		2반 : 168.5 , 155.3 , 172.1 , 169.7
	[2]	3반 : 158.5 , 170.2 , 182.5 , 175.8

출력은 세로로 먼저 하시고, 표처럼 배치되어 출력되도록 변경해보세요
 */

//데이터의 개수는 차원이랑 상관없다
//점수가 1개가 있어도 1차원이고 2개가 있어도 1차원
/*
 * package array4;

public class Test02이차원배열생성2 {
	public static void main(String[] args) {

		//배열 생성
		double[][] dataset = new double[][] {
			{180.3, 165.2, 177.9, 158.2},
			{168.5, 155.3, 172.1, 169.7},
			{158.5, 170.2, 182.5, 175.8}
		};

		//출력
		System.out.print(dataset[0][0] + "\t");
		System.out.print(dataset[0][1] + "\t");
		System.out.print(dataset[0][2] + "\t");
		System.out.print(dataset[0][3] + "\t");
		System.out.println();

		System.out.print(dataset[1][0] + "\t");
		System.out.print(dataset[1][1] + "\t");
		System.out.print(dataset[1][2] + "\t");
		System.out.print(dataset[1][3] + "\t");
		System.out.println();

		System.out.print(dataset[2][0] + "\t");
		System.out.print(dataset[2][1] + "\t");
		System.out.print(dataset[2][2] + "\t");
		System.out.print(dataset[2][3] + "\t");
		System.out.println();

	}
}
 */
package array4;

public class Test02이차원배열생성 {
	public static void main(String[] args) {

		//배열 생성
		double[][] dataset = new double[][] {
			{180.3, 165.2, 177.9, 158.2},
			{168.5, 155.3, 172.1, 169.7},
			{158.5, 170.2, 182.5, 175.8}
		};

		//출력
		for(int i=0; i < dataset.length; i++) {//줄
			for(int k=0; k < dataset[i].length; k++) {//칸
				System.out.print(dataset[i][k] + "\t");
				//for(int k=0; k <= 3; k++) {//칸
				//	System.out.print(dataset[i][k] + "\t");
			}
			System.out.println();
		}

	}
}

	
