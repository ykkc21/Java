package abcde;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class abcde extends JFrame {

	public abcde() {
		setTitle("¿¬½ÀÁßÀÔ´Ï´Ù.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = this.getContentPane();
		
		// ÆÄ¶û»öÀ¸·Î »ö±òº¯°æ
		c.setBackground(Color.BLUE);
		
		this.setLayout(new FlowLayout());
		
		// btn1 ¸¸µé±â
		JButton btn1 = new JButton("°£¿µÈÆ");
		btn1.setBackground(Color.GRAY);
		//setForeground ±Û¾¾ »ö±ò ¹Ù²Ù±â
		btn1.setForeground(Color.CYAN);
		this.add(btn1);
		
		JButton btn2 = new JButton("¿°½Â¿­");
		 //ÆùÆ®¸¸µé±â        
		//setFont(new Font("¸¼Àº°íµñ", Font.BOLD, 45));
		btn2.setFont(new Font("¸¼Àº°íµñ", Font.BOLD, 45));
		this.add(btn2);
		
		
		setSize(500, 500);
		setVisible(true);
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new abcde();
	}

}
