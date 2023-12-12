package loop3;

public class Test01누적합계 {
	public static void main(String[]args) {
		
		//(Q) 1 부터 10까지 더해보세요
		//int total =1+2+3+4+5+6+7+8+9+10;
		//System.out.println("total ="+total);
		
		int total =0;
		//반복문으로 바꾸려면..?
		for(int i=1; i <=10; i++) {   //왜 좋은가? 
			total +=i;				//100까지 더하는걸로 바꾸게 된다면 
		}								//10을 100으로 고치면 끝난다.
		/*
		total+=1;
		total+=2;
		total+=3;
		total+=4;
		total+=5;
		total+=6;
		total+=7;
		total+=8;
		total+=9;
		total+=10;
		*/
		System.out.println("total ="+total);
		
	}
}
