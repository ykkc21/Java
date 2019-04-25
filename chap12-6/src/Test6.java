import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test6 extends JFrame{
	private MyPanel panel = new MyPanel();
	public Test6(){
		setTitle("원본 크기로 원하는 위치에 이미지 그리기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(300, 400);
		setVisible(true);
		
	}
	
	class MyPanel extends JPanel{
		private ImageIcon icon = new ImageIcon("img/img1.jpg");
		private Image img = icon.getImage();
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			
			// 이미지를 페널의 20,20에 원래의 크기로 그린다.
			g.drawImage(img, 20, 20, this);
		}
	}
	public static void main(String[] args) {
		new Test6();

	}

}
