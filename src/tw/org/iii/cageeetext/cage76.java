package tw.org.iii.cageeetext;

public class cage76 {

	public static void main(String[] args) {
		Brad761 t1 = new Brad761("A");
		Brad761 t2 = new Brad761("B");
		t1.start();
		t2.start();//有生命週期 start結束就沒辦法再叫 java.lang.IllegalThreadStateException
		//start only put it in run pool not start runing
		//do not use sleep to control it must sleep over 100ms
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
		}
		System.out.println("OK");
		t1.run();
		t2.run();
	}
}
class Brad761 extends Thread{  // thread extends run able
	String name;
	Brad761(String name){this.name=name;}
	@Override
	public void run() { 
		for(int i=0;i<10;i++) {
			System.out.println(name+":"+i);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}
}
