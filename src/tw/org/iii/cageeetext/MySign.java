package tw.org.iii.cageeetext;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MySign extends JFrame{
	private JButton clear , undo ,redo ,saveJPG ,saveObject,loadObject;
	private MyView myView;
	
	public MySign() {
		super("簽名");
		
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new FlowLayout());
		clear = new JButton("clear");
		undo = new JButton("undo");
		redo = new JButton("redo");
		saveJPG = new JButton("saveJPG");
		saveObject = new JButton("saveObject");
		loadObject = new JButton("loadObject");
		top.add(clear); top.add(undo); top.add(redo);
		top.add(saveJPG); top.add(saveObject);
		top.add(loadObject);
		add(top,BorderLayout.NORTH);
		myView = new MyView();
		add(myView, BorderLayout.CENTER);
		
		clear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myView.clear();
			}
		});
		undo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myView.undo();
			}
		});
		redo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myView.redo();
			}
		});
		saveJPG.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				myView.saveJPEG();
			}
		});
		saveObject.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				saveObject();
			}
		});
		loadObject.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				loadObject();
			}
		});
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private void loadObject() {
		try {
			ObjectInputStream oin =
				new ObjectInputStream(
						new FileInputStream("dir1/brad1.obj"));
			LinkedList<LinkedList<MyPoint>> lines = 
					(LinkedList<LinkedList<MyPoint>>)oin.readObject();
				oin.close();
				myView.setLines(lines);
		} catch (IOException | ClassNotFoundException e) {
		}
	} //回家做小畫家
	private void saveObject() {
		LinkedList<LinkedList<MyPoint>> lines = myView.getLines();
		try {
			ObjectOutputStream oout=
					new ObjectOutputStream(
							new FileOutputStream("dir1/brad1.obj"));
			oout.writeObject(lines);
			oout.flush();
			oout.close();
			JOptionPane.showMessageDialog(this, "save OK");
		}catch(Exception e) {
			
		}
	}


	public static void main(String[] args) {
		new MySign();
	}
}
