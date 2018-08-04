package boon;

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

public class guessNumber extends JFrame {
	private JButton guess;
	private JTextField input;
	private JTextArea hist;
	private String answer = createAnswer();
	private int counter;
	public guessNumber() {
		setTitle("猜字遊戲");
		guess = new JButton("猜");
		input = new JTextField();
		hist = new JTextArea();
		input.setFont(new Font("Defult",Font.BOLD,24));
		hist.setFont(new Font("Defult",Font.BOLD,24));
		
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
				input.requestFocus();
			}
		});
		setSize(640,480);
		setVisible(true);
		System.out.println(answer);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		input.requestFocus();
		
	}
	void doGuess(){
		counter++;
		String result = checkAB();
		if(checknumber(input.getText()) == true) {
		hist.append(counter+"."+input.getText()+"=>"+result+"\n");
		}else {
			hist.append(counter+". "+input.getText()+"=>"+"What did you say \n");
		}
		input.setText("");
		if(result.equals("3A0B")) {
			JOptionPane.showMessageDialog(this,"congrauation");
		}else if(counter==10){
			JOptionPane.showMessageDialog(this,"suck! answer is => "+answer);
		}
	}
	boolean checknumber(String number) {
		boolean match=false;
		if(number.matches("^[0-9]{3}$")) {
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					do {
						
					}while(String.valueOf(number).charAt(i) == String.valueOf(number).charAt(j));
				}
			}
			match=true;
		}
		return match;
	}
	String checkAB(){
		int a,b;
		a=b=0;
		String inputGuess = input.getText();
		for(int i = 0; i<inputGuess.length(); i++) {
			if(inputGuess.charAt(i) == answer.charAt(i)) {
				a++;
			}else if(answer.indexOf(inputGuess.charAt(i))!=-1) {
				b++;
			}
		}
		
		return a+"A"+b+"B";
	}
	String createAnswer() {
		int[] eichanswer = new int[3];
		boolean isRepeat = false;
		int temp;
		for(int i=0;i<eichanswer.length;i++) {
			do {
				temp = (int)(Math.random()*10);
				isRepeat = false;
				for(int j=0;j<i;j++) {
					if(eichanswer[j]==temp) {
						isRepeat = true;
						break;
					}
				}
			}while(isRepeat);
			eichanswer[i]=temp;
		}
		return ""+eichanswer[0]+eichanswer[1]+eichanswer[2];
	}
	public static void main(String[] args) {
		new guessNumber();
	}
}
