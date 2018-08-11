package tw.org.iii.cageeetext;

public class cage41 {

	public static void main(String[] args) {
		int a = 10 ,b = 3;  //NaN not a number
		int c;
		int[] d =new int[3];
		try {
			c = a / b;
			System.out.println(c);  //哪兒有錯誤 就會直接拋出後面的動作不會做
			//System.out.println("before");
			System.out.println(d[13]);
			//System.out.println("after");
		}catch(ArithmeticException e){
			System.out.println("Oooops");
		}catch(RuntimeException e) {   // 比較細的擺上面 比要大的擺下面
				System.out.println("Oooops1");
		}
		System.out.println("GameOver");
	}
}
