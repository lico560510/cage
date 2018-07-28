package tw.org.iii.cageeetext;

public class cage16 {

	public static void main(String[] args) {
		/*
		 * Array
		 * 1.Type 型別固定(強型別)
		 * 2.Length 長度固定
		 */
		int[] a;
		a =new int[4]; // new的東西是物件
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		int[] b=new int[3];
		int[] c=new int[] {1,2,3,4,5};
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
		int[] d={1,2,3,4,5}; //只有在宣告同時才能用
		for(int i=0;i<d.length;i++) {
			System.out.println(d[i]);
		}
	}
}