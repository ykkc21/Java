package mainTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class abcd extends JFrame {

	public abcd() {
		setTitle("�������Դϴ�.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = this.getContentPane();
		
		// �Ķ������� ���򺯰�
		c.setBackground(Color.BLUE);
		
		this.setLayout(new FlowLayout());
		
		// btn1 �����
		JButton btn1 = new JButton("������");
		btn1.setBackground(Color.GRAY);
		//setForeground �۾� ���� �ٲٱ�
		btn1.setForeground(Color.CYAN);
		this.add(btn1);
		
		JButton btn2 = new JButton("���¿�");
		 //��Ʈ�����        
		//setFont(new Font("�������", Font.BOLD, 45));
		btn2.setFont(new Font("�������", Font.BOLD, 45));
		this.add(btn2);
		
		
		setSize(500, 500);
		setVisible(true);
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new abcd();
	}

}
