package tw.org.iii.cageeetext;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyPanelv4 extends MyPanel{
	private MouseListener mListener = new MouseListener() {  //產生一個的時候 可以用這個
		
		@Override
		public void mouseReleased(MouseEvent e) {
			System.out.println(a);
		}
		
		@Override
		public void mousePressed(MouseEvent e) {		
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
		}
	};
	
	private MouseListener mListener2 = new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println(b);
		}
	};
	
	private int a = 10;
	private int b = 20;
	private int c = 30;
	
	public MyPanelv4(){
		addMouseListener(mListener);
		addMouseListener(mListener2);
		MouseListenerv100 mListener3 = new MouseListenerv100(this); // 整個物件實體
		addMouseListener(mListener3);
	}
public int getC() {return c;}
class MouseListenerv100 extends MouseAdapter{ //可以產生多個物件實體
	
	private MyPanelv4 obj;
	public MouseListenerv100(MyPanelv4 obj) {
		this.obj = obj;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(obj.getC());
	}
}
}
