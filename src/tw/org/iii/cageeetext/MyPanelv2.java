package tw.org.iii.cageeetext;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
//類別是定義屬性與方法
public class MyPanelv2 extends MyPanel{
	public MyPanelv2() {
		//super();  //建構式並沒有在繼承 1完成物件初始化 2讓祖宗八代都存在記憶體裡面
		super(100,100);
		addMouseListener(new MyMouseListener()); // 都會被觸發
	}
	//可以直接存取外界類別的屬性方法
	class MyMouseListener implements MouseListener{ //類別中的類別 工廠生產車有車藍圖 需要輪子藍圖

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("B");
			color=Color.GRAY;
			repaint();   //類別中的類別 可以直接叫 父類別的方法
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		} //類別中的類別 內部類別
		
	}
}
