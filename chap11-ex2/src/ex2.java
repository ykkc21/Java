import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ex2 extends JFrame{
	public	ex2(){
		super("���̺� ����");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//���� ���̺� ���� 
		JLabel textlabel = new JLabel("����Դϴ�");
		//�̹��� ���̺� ����
		ImageIcon aaa = new ImageIcon("img/beauty.jpg");
		JLabel imglabel = new JLabel(aaa);
		//���ڿ��� �̹����� ��� ���� ���̺� ����
		ImageIcon nono = new ImageIcon("img/normaiIcon.gif");
		JLabel label = new JLabel("��������� ��ȭ���ּ���",nono,SwingConstants.CENTER);//���̺� ����

		//����Ʈ�ҿ��� 3���� ���̺� ����
		
		c.add(textlabel);
		c.add(imglabel);
		c.add(label);
		
		setSize(400,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ex2();
	}

}
