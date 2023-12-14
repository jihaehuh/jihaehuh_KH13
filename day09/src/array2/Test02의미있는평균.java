/*
 * Test02의미있는평균
사용자에게 5개의 실수를 입력받아 평균을 구하려고 합니다. 

좀 더 의미있는 데이터를 만들기 위해서 가장 작은 값과
 가장 큰 값을 뺀 나머지 데이터로 평균을 구하는 프로그램을 구현하세요.

최소나 최대값이 2개이상이라면 둘 중 아무거나 
한 개를 정해서 하시면 됩니다.
 */

//내 풀이 
/*
package array2;

import java.util.Scanner;

public class Test02의미있는평균 {
	public static void main(String[]args) {
		//사용자에게 5개 실수 입력 받기
		Scanner sc =new Scanner(System.in);
		//[1]배열 만들기 
		//위치는 무조건 int 
		double[]scores = new double[5]; 
		int max=0;
		
		//가장 작은값 ,가장 큰 값은 빼고 나머지로 평균을 구하기 
		for(int i=0; i <scores.length;i++) {//1부터 마지막 까지 반복하며
			System.out.println(i+" 점수 입력: " );  
			scores[i] =sc.nextInt();
		}
		for(int i=0; i <scores.length;i++) {//1부터 마지막 까지 반복하며
			if(scores[max] <scores[i]) {
			
			max =i ; //위치를 갱신
		}
		}
		
		//평균구하기
		int total = 0;
		for(int i=0; i < scores.length ; i++) {
			//System.out.println("점수 = " + scores[i]);
			total += scores[i];
		}
		
		System.out.println("총점 = " + total);
		
		double average = (double)total / scores.length;
		System.out.println("평균 = " + average);
		
		
		
		
		//만약 값이 두개가 같으면 한개로 센다...(중복)
		}
	}
*/

package array2;

import java.util.Scanner;

public class Test02의미있는평균 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);

		//배열 준비
		//data ---->	[ 0.0 ][ 0.0 ][ 0.0 ][ 0.0 ][ 0.0 ]
		double[] data = new double[5];

		//입력
		//for(int i=0; i <= 4; i++) {
		for(int i=0; i < data.length; i++) {
			System.out.print("입력 : ");
			data[i] = sc.nextDouble();
		}

		//최대값 위치 구하기
		int max = 0;//맨앞이 제일 클것이라고 예상
		//for(int i=1; i <= 4; i++) {//1번부터 4번까지 조회하여
		for(int i=1; i < data.length; i++) {//1번부터 마지막까지 조회하여
			if(data[max] < data[i]) {//현재 값이 내가 아는 최대값보다 더 크다면
				max = i;//내가 아는 최대값의 위치를 수정
			}
		}
		//System.out.println("최대값 위치 : " + max);

		//최소값 위치 구하기
		int min = 0;//맨앞이 제일 작을것이라고 예상
		//for(int i=1; i <= 4; i++) {//1번부터 4번까지 조회하여
		for(int i=1; i < data.length; i++) {//1번부터 마지막까지 조회하여
			if(data[min] > data[i]) {//현재 값이 내가 아는 최소값보다 더 작다면
				min = i;//내가 아는 최소값의 위치를 수정
			}
		}
		//System.out.println("최소값 위치 : " + min);

		//합계 구하기
		double total = 0.0;
		//for(int i=0; i <= 4; i++) {
		for(int i=0; i < data.length; i++) {
			total += data[i];
		}
		total -= data[min];//제일작은거
		total -= data[max];//제일큰거

		//double avg = total / 3;
		double avg = total / (data.length-2);

		System.out.println("평균 = " + avg);
	}
}
	
	