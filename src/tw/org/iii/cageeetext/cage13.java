package tw.org.iii.cageeetext;

public class cage13 {

	public static void main(String[] args) {
		int i=0; //重複宣告
		/*for(;i<10;i++) {// i 只有在for內認識
			System.out.println(i);
		}
		System.out.println(i);*/
		for(m1();;System.out.println("-----")) {// 第一道敘述句 整個迴圈只做一次
			System.out.println(i++);
		}
		//System.out.println(i); // 到達不了的code就發生錯誤
		//for迴圈就是1 2 3-1 3-2 4 5
	}
	public static void m1() {
		int a=10 , b=3;
		System.out.println(a/b);
	}
}
