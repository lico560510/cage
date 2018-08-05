package tw.org.iii.cageeetext;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class cage38 extends JFrame {
	public cage38() {
		private MyPanel myPanel;
		public cage38() {
			setLayout(new BorderLayout());
			myPanel = new MyPanel();
			add(mypanel)
			addWindowListener(new MyListener());
			setSize(640, 480);
			setVisible(true);	
		}
	}

	public static void main(String[] args) {
		new cage38();
	}
}
class MyListener extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Closing");
		System.exit(0);//command line return value; 0=> return normal; non-zero=>return error
	}
}

//class MyWindowListener implements WindowListener{
//
//	@Override
//	public void windowActivated(WindowEvent e) {
//		System.out.println("opened");
//	}
//
//	@Override
//	public void windowClosed(WindowEvent e) {
//		System.out.println("colsed");
//	}
//
//	@Override
//	public void windowClosing(WindowEvent e) {
//		System.out.println("Closing");
//		System.exit(0);//command line return value; 0=> return normal; non-zero=>return error
//	}
//
//	@Override
//	public void windowDeactivated(WindowEvent e) {
//		System.out.println("Deactivated");
//	}
//
//	@Override
//	public void windowDeiconified(WindowEvent e) {
//		System.out.println("Deiconified");
//	}
//
//	@Override
//	public void windowIconified(WindowEvent e) {
//		System.out.println("icon");
//	}
//
//	@Override
//	public void windowOpened(WindowEvent e) {
//		System.out.println("Opened");
//	}
//}