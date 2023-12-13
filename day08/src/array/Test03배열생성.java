package array;

public class Test03배열생성 {
	public static void main(String[] args) {
		
		int[] a = new int[] {30, 50, 20, 10, 40};
		//a 	----->		[30][50][20][10][40]
		
//		for(int i=0; i <= 4; i++) {
//		for(int i=0; i < 5; i++) {
		for(int i=0; i < a.length; i++) {//a.length는 a 배열의 길이(칸수)
			System.out.println(a[i]);
		}
		
		
//		String b = "피카츄";
		String[] b = new String[] {"피카츄", "라이츄", "파이리", "꼬부기"};
//		b	---->	[피카츄][라이츄][파이리][꼬부기]
		
//		for(int i=0; i <= 3; i++) {
//		for(int i=0; i < 4; i++) {
		for(int i=0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		
		float[] c = new float[] {177.1f, 182.3f, 160.5f, 157.9f, 180.1f, 163.6f};
//		c 	----->	[ ? ][ ? ][ ? ][ ? ][ ? ][ ? ]
		
		for(int i=0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}






