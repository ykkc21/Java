import javax.swing.*;
import java.awt.*;

public class Test01 extends JFrame {
	public Test01() {
		setTitle("��ư ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		// 3 ���� �̹����� ���Ϸκ��� �о���δ�.
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.gif");// normalIcon�� �̹���
		
		// normalIcon�� ���� ��ư ������Ʈ ����
		JButton btn = new JButton("call~~", normalIcon);
		btn.setHorizontalAlignment(SwingConstants.LEFT);
		c.add(btn);
		
		setSize(250,150);
		setVisible(true);
	}
	
	public static void main(String [] args) {
		new Test01();
	}
} 