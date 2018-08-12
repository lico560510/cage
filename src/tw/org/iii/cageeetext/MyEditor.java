package tw.org.iii.cageeetext;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class MyEditor extends JFrame{
	private JButton open,save,newfile,saveas;
	private JTextArea editor;
	private File nowFile = null;
	public MyEditor() {
		super("超強記事本");
		setLayout(new BorderLayout());
		JPanel top = new JPanel(new FlowLayout());
		newfile = new JButton("new");top.add(newfile);
		open = new JButton("open");top.add(open);
		save = new JButton("save"); top.add(save);
		saveas = new JButton("save as");top.add(saveas);
		add(top,BorderLayout.NORTH);
		editor = new JTextArea();
		JScrollPane jsp = new JScrollPane(editor);
		add(jsp,BorderLayout.CENTER);
		open.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				openfile();
			}
		});
		save.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				saveFile();
			}
		});
		saveas.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				saveAs();
			}
		});
		newfile.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				clear();
			}
		});
		
		setSize(640,480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	protected void clear() {
		nowFile = null;
		editor.setText("");
	}

	private void saveAs(){
		JFileChooser jFileChooser = new JFileChooser();
		if (jFileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
			nowFile = jFileChooser.getSelectedFile();
			saveFile();
		}
	}
	
	private void saveFile() {
		if (nowFile != null) {
			try {
				editor.write(new FileWriter(nowFile));
				JOptionPane.showMessageDialog(this, "Save OK");
			} catch (IOException e) {
				System.out.println(e);
			}
		}else {
			saveAs();
		}
	}
	private void openfile() {
		JFileChooser jfChooser = new JFileChooser();
		if(jfChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			nowFile = jfChooser.getSelectedFile();
			if(nowFile.canRead()&&nowFile.isFile()) {
				readFile();
			}else {
				nowFile = null;
			}
		}
	}

	private void readFile() {
		try {
			FileReader reader = new FileReader(nowFile);
			int len = 0; char[] buf = new char[4096];
			while((len = reader.read(buf))!=-1) {
				editor.append(new String(buf, 0, len));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		new MyEditor();
	}
}