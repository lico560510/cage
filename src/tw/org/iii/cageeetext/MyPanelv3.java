package tw.org.iii.cageeetext;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MyPanelv3 extends MyPanel{
	public MyPanelv3() { // 建構式
		addMouseListener(new MyMouseListener());
	}
	
	//MyPanelV3 Object has a Inner class
	class MyMouseListener extends MouseAdapter{ //adapter 只是實做所有MouseListener方便大家
		@Override
		public void mouseClicked(MouseEvent e) {
			//super.mouseClicked(e);  //有沒有繼承都沒差
			
		}
	}
}
