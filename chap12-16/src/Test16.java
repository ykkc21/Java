import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test16 extends JFrame{
	public Test16(){
		setTitle("���ο� ��ư �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		MyButton b = new MyButton("New Button");
		b.setOpaque(true);
		b.setBackground(Color.CYAN);
		c.add(b);
		setSize(250, 200);
		setVisible(true);
		
		setSize(200, 300);
		setVisible(true);
	}
	
	class MyButton extends JButton{
		public MyButton(String s){
			super(s); // JButton�� ������ ȣ��
		}
		//���ο� ��ư�� �׸���.
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			
			
			//JBuuton�� �⺻��� ����  �߰������� ���������� ��ư ũ�⸸�� Ÿ���� �׸���.
			g.setColor(Color.RED);
			g.drawOval(0, 0, this.getWidth()-1, this.getHeight()-1);
		}
	}
	
	
	public static void main(String[] args) {
		new Test16();

	}

}
