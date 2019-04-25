import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test5 extends JFrame{
	private MyPanel panel = new MyPanel();
	
	public Test5 (){
		setTitle("fillXXX ��� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(100, 370);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillRect(10, 10, 50, 50); // ���������� �簢�� ĥ�ϱ�
			g.setColor(Color.BLUE); //�Ķ��� ����
			g.fillOval(10, 70, 50, 50); // �Ķ������� Ÿ�� �����
			g.setColor(Color.GREEN); //  �ʷϻ����� Ÿ�� �����
			g.fillRoundRect(10, 130, 50, 50, 20, 20); // �ʷϻ� �ձٻ簢�� ĥ�ϱ�
			g.setColor(Color.MAGENTA); //  ����Ÿ������ ����
			g.setColor(Color.ORANGE);
			int []x= {30,10,30,60};
			int []y= {250,275,300,275};
			g.fillPolygon(x, y, 4); // �������� �ٰ��� �����
		}
	}
	
	public static void main(String[] args) {
		new Test5();

	}

}
