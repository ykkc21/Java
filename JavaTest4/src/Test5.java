import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test5 extends JFrame {
	public Test5(){
		super("Ŭ�� ���� �� �����ñ׷� ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("C");
		c.add(label);
		
		//���̺� ������ġ ����
		label.setLocation(100,100);
		label.setSize(20,20);
		label.addMouseListener(new MouseAdapter() {
			public void aaa(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				Container c = la.getParent();
				
				//�����̳� Ʈ�� ������ ������ ���̺� ��ġ ����
				int xbound = c.getWidth() - la.getWidth();// ���̺��� ����ŭ ����
				int ybound = c.getHeight() - la.getHeight();// ���̺��� ���̸�ŭ ����
				int x =(int)(Math.random()*xbound);
				int y =(int)(Math.random()*ybound);
				la.setLocation(x,y);
			}
		});
		
		setSize(300,300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Test5();
	}

}
