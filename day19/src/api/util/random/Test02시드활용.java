package api.util.random;

import java.text.DecimalFormat;
import java.util.Random;

public class Test02시드활용 {
	public static void main(String[] args) {

		long time = System.currentTimeMillis();
		System.out.println("time = " + time);
		long seed = time / 10000;
		System.out.println("seed = " + seed);
		
		Random r = new Random(seed);
		int otp = r.nextInt(1000000);
		DecimalFormat fmt = new DecimalFormat("000000");
		System.out.println("otp = " + fmt.format(otp));
		//랜덤이지만 시간을 정해놓고 그시간안에는 같은 숫자가 나오도록 하기
	}
}
