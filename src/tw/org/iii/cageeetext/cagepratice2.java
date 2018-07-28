package tw.org.iii.cageeetext;

public class cagepratice2 {

	public static void main(String[] args) {
		int[] p;
		p=new int [7];
		//int p1,p2,p3,p4,p5,p6;
		//p1=p2=p3=p4=p5=p6=0;
		for(int i=0;i<1000;i++) {
			int scorce=(int)(Math.random()*9+1);
			if (scorce>=1 && scorce<=9) {
				p[scorce>=7?scorce-3:scorce]++;
			}else {
				p[0]++;
			}
//			switch (score) {
//			case 1: p1++; break;
//			case 2: p2++; break;
//			case 3: p3++; break;
//			case 4: p4++; break;
//			case 5: p5++; break;
//			case 6: p6++; break;
//			}
		}
		if (p[0]==0) {
			for(int i=1;i<p.length;i++) {
				System.out.println(i+"點出現"+p[i]+"次");
			}
		}
	}
}
