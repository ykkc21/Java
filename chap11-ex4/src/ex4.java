import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ex4 extends JFrame{
	public ex4(){
		setTitle("�̹��� ��ư ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//3���� �̹����� ���Ϸκ��� �о���δ�.
		ImageIcon aaa = new ImageIcon("img/normalIcon.gif");
		ImageIcon bbb = new ImageIcon("img/rolloverIcon.gif");
		ImageIcon ccc = new ImageIcon("img/pressedIcon.gif");
		
		//3���� �̹����� ����  ��ư����
		JButton bn1 = new JButton("call~~",aaa);
		bn1.setPressedIcon(ccc);//pressedIcon �̹��� ���
		bn1.setRolloverIcon(bbb);//rolloverIcon �̹��� ���
		c.add(bn1);
		
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ex4();

	}

}
