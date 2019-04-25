import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test9 extends JFrame{
	private MyPanel panel = new MyPanel();
	public Test9(){
		setTitle("Ʋ���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(300, 400);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		private ImageIcon aaa = new ImageIcon("img/img1.jpg");
		private Image img = aaa.getImage();
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setClip(100, 20, 150, 150);// 100,20���� 150x150 �κ��� ���� �������� ����
			g.setColor(Color.YELLOW);
			g.setFont(new Font("Arial", Font.ITALIC, 40));
			g.drawString("Go Gator", 10, 150);
		}
	}
	public static void main(String[] args) {
		new Test9();

	}

}
