import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test2 extends JFrame{
	private MyPanel panel = new MyPanel();
	public Test2(){
		setTitle("drawSteing ��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel); // ������ panel �г��� ����Ʈ������ ���
		
		setSize(250,200);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawString("�ڹٴ� ��մ�.~~~", 30, 30); // �г��� 30,30 ��ġ�� ���ڿ� ���
			g.drawString("�󸶳�? �ϴø�ŭ ����ŭ !!!!", 60, 60);
		}
	}
	
	
	
	public static void main(String[] args) {
		new Test2();		
	}

}
