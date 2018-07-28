package tw.org.iii.cageeetext;

public class cage18 {

	public static void main(String[] args) {
		int[][]a=new int [2][3];
		int[][]b=new int [2][];
		b[0] = new int [3];
		b[1] = new int [2];
		//永遠用一維陣列來看
//		System.out.println(a[0].length);
//		System.out.println(a.length);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		int[] c= {1,3,5,6,7};
		for(int cage:c) {//go each 一個一個取值
			System.out.println(cage);
		}
		System.out.println("---------------------");
		for(int[] aa:b) {
			for(int aaa :aa) {
				System.out.print(aaa+" ");
			}
			System.out.println();
		}
	}
}
