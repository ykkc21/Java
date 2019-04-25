import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test3 extends JFrame {
	private MyPanel panel = new MyPanel();
	
	public Test3() {
		setTitle("Color, Font ��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel); // ������ panel �г��� ����Ʈ������ ���

		setSize(350, 470);
		setVisible(true);
	}

	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.BLUE); // �Ķ��� ����
			g.drawString("I Love Java.~~", 30,30); // (30,30) ��ġ�� ���ڿ� ���
			g.setColor(new Color(255, 0, 0)); // ������ ����
			g.setFont(new Font("Arial", Font.ITALIC, 30)); // Arial ��Ʈ ����
			g.drawString("How much?", 30, 60); // (30,60) ��ġ�� ���ڿ� ���
			g.setColor(new Color(0x00ff00ff)); // �������� �Ķ����� ���� �� ����
			for(int i=1; i<=5; i++) {
				g.setFont(new Font("Jokerman", Font.ITALIC, i*10));
				g.drawString("This much!!", 30, 60+i*60); 
			}
		}
	}
	
	public static void main(String [] args) {
		new Test3();
	}
}
