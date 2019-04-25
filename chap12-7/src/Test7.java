import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test7 extends JFrame{
	private MyPanel panel = new MyPanel();
	public Test7(){
		setTitle("패널의 크기에 맞추어 이미지 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(200, 300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		private ImageIcon aaa= new ImageIcon("img/img1.jpg"); // 이미지 로딩
		private Image img = aaa.getImage(); 
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			
			// 이미지를 패널 크키로 조절하여 그린다
			g.drawImage(img, 0, 0, getWidth(),getHeight(),this);
		}
	}
	public static void main(String[] args) {
		new Test7();

	}

}
