import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Slide3 extends JFrame {
	public Slide3(){
		setTitle("FlickeringLabelEx ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//�����̴� ���̺� ����
		SLIDE0 label1 = new SLIDE0("����",500);
		
		//�������� �ʴ� ���̺� ����
		JLabel label = new JLabel("�ȱ���");
		
		//�����̴� ���̺� ���� 
		SLIDE0 label2 = new SLIDE0("���⵵ ����",300);
		
		c.add(label1);
		c.add(label);
		c.add(label2);
		
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Slide3();
	}

}
