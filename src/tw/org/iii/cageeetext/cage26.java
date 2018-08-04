package tw.org.iii.cageeetext;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
//需要呼叫才需要名字  javax.swing class:jframe
public class cage26 extends JFrame {
	private JButton b1,b2;
	public cage26() {
		//super("我的視窗");
		setTitle("我的視窗");
		//System.out.println("cage"); 在window父類別裡面
		b1 = new JButton("B1");
		b2 = new JButton("B2");
		setLayout(new FlowLayout(FlowLayout.RIGHT,80,0));
		add(b1);add(b2);
		setSize(480, 640);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new cage26(); //父類別無傳參數建構式	
	}
	
}
