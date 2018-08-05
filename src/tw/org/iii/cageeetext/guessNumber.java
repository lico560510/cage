package tw.org.iii.cageeetext;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class guessNumber extends JFrame{
	private JButton guess;
	private JTextField input;
	private JTextArea hist;
	private String answer = createAnswer();
	private int counter;
	
 	public guessNumber() {
		setTitle("猜數字遊戲");
		guess = new JButton("猜");
		input = new JTextField();
		hist = new JTextArea();
		input.setFont(new Font("Defult",Font.BOLD,24));
		hist.setFont(new Font("Defult",Font.BOLD+Font.ITALIC,24));
		
		setLayout(new BorderLayout());
		add(hist,BorderLayout.CENTER);
		
		JPanel top = new JPanel(new BorderLayout());
		top.add(guess,BorderLayout.EAST);
		top.add(input,BorderLayout.CENTER);
		
		add(top,BorderLayout.NORTH);
		
		guess.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				doGuess();
			}
		});
		
		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		System.out.println(answer);
	}
	//homework01 游標自動移到輸入欄
 	//homework02 檢查是否為三個數字
 	//homework03 第十次有兩個結果 猜對或沒猜對 開新局
	void doGuess(){
		counter++;
		String result=checkAB();
		hist.append(counter+"."+input.getText()+"=>"+result+"\n");
		input.setText("");
		if(result.equals("3A0B")) {
			JOptionPane.showMessageDialog(this,"congrauation");
		}else if(counter==10) {
			JOptionPane.showMessageDialog(this,"loser answer is ="+answer);
		}
	}
	String checkAB() {
		int a,b;
		a=b=0;
		String inputGuess = input.getText();
		for(int i=0;i<inputGuess.length();i++) {
			if(inputGuess.charAt(i) == answer.charAt(i)) {
				a++;
			}else if(answer.indexOf(inputGuess.charAt(i)) !=-1){
				b++;
			}
		}
		return a+"A"+b+"B";
	}
	String createAnswer(){
		int[] poker = new int [10];
		boolean isRepeat = false;
		int temp;
		for(int i=0;i<poker.length;i++) {
			do {
			temp = (int)(Math.random()*10);
			//檢查機制
			isRepeat = false;
			for(int j=0;j<i;j++) {
				if(poker[j]==temp) {
					isRepeat = true;
					break;
				}
			}
			}while(isRepeat);
			poker[i] = temp;
		}
		return ""+poker[0]+poker[1]+poker[2];
	}
 	public static void main(String[] args) {
		new guessNumber();
	}

}
