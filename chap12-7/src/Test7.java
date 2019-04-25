import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test7 extends JFrame{
	private MyPanel panel = new MyPanel();
	public Test7(){
		setTitle("�г��� ũ�⿡ ���߾� �̹��� �׸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(200, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		private ImageIcon aaa= new ImageIcon("img/img1.jpg"); // �̹��� �ε�
		private Image img = aaa.getImage(); 
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			
			// �̹����� �г� ũŰ�� �����Ͽ� �׸���
			g.drawImage(img, 0, 0, getWidth(),getHeight(),this);
		}
	}
	public static void main(String[] args) {
		new Test7();

	}

}
