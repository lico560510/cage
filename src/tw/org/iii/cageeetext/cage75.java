package tw.org.iii.cageeetext;
import java.util.Timer;
import java.util.TimerTask;

public class cage75 {

	public static void main(String[] args) {
		Timer timer = new Timer(); // TRUE是DAEMON前景結束他就結束
		MyTask myTask = new MyTask();
		StopTimer stopTimer = new StopTimer(timer);
		timer.schedule(myTask, 1*000,1*1000);
		timer.schedule(stopTimer, 10*1000);
		System.out.println("here");
		timer.cancel();
	}
	
	
}
class MyTask extends TimerTask { // 不能是內部類別 要有外部的物件實體或是宣告為static
	@Override
	public void run() {
		System.out.println("OK");
	}
}
class StopTimer extends TimerTask{
	Timer timer;
	StopTimer(Timer timer){this.timer = timer;}
	@Override
	public void run() {
		timer.cancel();
		//System.exit(0);
	}
}