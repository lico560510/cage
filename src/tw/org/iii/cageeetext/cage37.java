package tw.org.iii.cageeetext;

public class cage37 {

	public static void main(String[] args) {
		
	}
}
interface Bard371{
	void m1();
}
interface Bard372{
	void m2();
}
interface Bard373 extends Bard371,Bard372{
	void m3();
}
class Bard374 implements Bard371,Bard372 {
	public void m1() {}
	public void m2() {}
}
class Bard375 implements Bard373 {
	public void m1() {}
	public void m2() {}
	public void m3() {}
}