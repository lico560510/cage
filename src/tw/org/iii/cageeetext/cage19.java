package tw.org.iii.cageeetext;

public class cage19 {

	public static void main(String[] args) {
		int a =1;
		while(a<10) { //前測迴圈
			System.out.println(a++);
		}
		for(;a<10;) {
			System.out.println(a++);
		}
		do { //後側迴圈 至少做一次
			System.out.println(a++);
		}while(a<10);
	}
}
