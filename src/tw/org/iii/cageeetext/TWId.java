package tw.org.iii.cageeetext;

public class TWId {//類別
	static final String letters="ABCDEFGHJKLMNPQRSTUVXYWZIO";
	private String id; //String內容不能改變
	TWId(){
		this((int)(Math.random()*2)==0);
	}
	TWId(boolean isMale){
		this(isMale,(int)(Math.random()*26));
	}
	TWId(int area){
		this((int)(Math.random()*2)==0,area);//Math.random()*2)==0   會傳回0 1 就是true false
	}
	TWId(boolean isMale,int area){
		String i1 = letters.substring(area,area+1);
		String i2 = isMale?"1":"2";
//		String newid = i1 + i2 +
//				(int)(Math.random()*10)+(int)(Math.random()*10)+
//				(int)(Math.random()*10)+(int)(Math.random()*10)+
//				(int)(Math.random()*10)+(int)(Math.random()*10)+
//				(int)(Math.random()*10);
		String newid = i1.concat(i2).
				concat(String.valueOf((int)(Math.random()*10))).
				concat(String.valueOf((int)(Math.random()*10))).
				concat(String.valueOf((int)(Math.random()*10))).
				concat(String.valueOf((int)(Math.random()*10))).
				concat(String.valueOf((int)(Math.random()*10))).
				concat(String.valueOf((int)(Math.random()*10))).
				concat(String.valueOf((int)(Math.random()*10)));
		for(int i=0;i<=9;i++) {
			if(checkId(newid+i)) {
				this.id = newid + i;
				break;
			}
		}
	}
	private TWId(String id) {
		this.id = id;
	}
	static TWId createTWId(String id) {
		if(checkId(id)) {
			return new TWId(id);
		}else {
			return null;
		}
	}
	static boolean checkId(String id) {
		//加static是 class TWId的 與物件無關  
		//沒有static只能在跟著class使用
//		String c1 = id.substring(0,1);
//		String c2 = "ABCDEFGHIJKLMNIPQRSTUVWXYZ";
//		int pos = c2.indexOf(c1);
		boolean isRight=false;
		if(id.matches("^[A-Z][1-2][0-9]{8}$")) { //{}重複字數 正規表示法
			int n12 = letters.indexOf(id.charAt(0))+10;
			int n1 = n12/10;
			int n2 = n12%10;
			int n3 = Integer.parseInt(id.substring(1, 2));
			int n4 = Integer.parseInt(id.substring(2, 3));
			int n5 = Integer.parseInt(id.substring(3, 4));
			int n6 = Integer.parseInt(id.substring(4, 5));
			int n7 = Integer.parseInt(id.substring(5, 6));
			int n8 = Integer.parseInt(id.substring(6, 7));
			int n9 = Integer.parseInt(id.substring(7, 8));
			int n10 = Integer.parseInt(id.substring(8, 9));
			int n11 = Integer.parseInt(id.substring(9, 10));
			int sum =n1*1+n2*9+n3*8+n4*7+n5*6+n6*5+n7*4+n8*3+
					n9*2+n10*1+n11*1;
			isRight = sum % 10 ==0;
		}
		return isRight;
	}
	String getId() {
		return id;
	} //brad@brad.tw
	boolean isMale() {
		int male = Integer.parseInt(id.substring(1, 2));
		if(male==1) {
			System.out.println("male");
		}else {
			System.out.println("female");
		}
		return true;
	}
//	String getArea() {
//		
//	}
}
