import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test8 extends JFrame{
 private MyPanel panel  = new MyPanel();
 	public Test8(){
 		setTitle("�̹��� �Ϻκ��� ũ�� �����Ͽ� �׸���");
 		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		setContentPane(panel);
 		
 		setSize(300,300);
 		setVisible(true);
 	}
 	
 	class MyPanel extends JPanel{
 		private ImageIcon aaa = new ImageIcon("img/img1.jpg");
 		private Image img = aaa.getImage();
 		public void paintCompenet(Graphics g){
 			super.paintComponent(g);
 			
 			// �̹��� 100,50���� 200,200�� ������ �гλ��� 20,20���� 250,100�� �������� Ȯ���Ͽ� �׸���.
 			g.drawImage(img, 20, 20, 250, 100, 100, 50, 200, 200, this);
 		}
 	}
	public static void main(String[] args) {
		new Test8();

	}

}
