package tw.org.iii.cageeetext;
//interface 介面 通訊協定 互相約定好的語言

public class cage36 {
	public static void main(String[] args) {//宣告看能不能呼叫 呼叫看骨子裡
		Brad363 obj1 = new Brad363();
		Brad362 obj2 = new Brad363(); //宣告為Brad362的Brad363
	}
}
interface Brad362{ 
	//全部定義都是public
	//不會有實作 只會宣告
	void m1();
	void m2();
}
class Brad363 implements Brad362{ //implement 實作 實現
	public void m1() {}
	public void m2() {}
	void m3() {}
}
class Brad364 implements Brad362{
	public void m1() {}
	public void m2() {}
}