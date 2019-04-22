import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class ex6 extends JFrame{
	public ex6(){
		setTitle("������ư ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c =getContentPane();
		c.setLayout(new FlowLayout());
		
		//�̹��� ������ư�� ����� ���� 2���� �̹��� ��ü ����
		ImageIcon aaa = new ImageIcon("img/cherry.jpg"); // ���� ���¸� ��Ÿ���� �̹���
		ImageIcon bbb = new ImageIcon("img/selectedCherry.jpg"); // ���� ���¸� ��Ÿ���� �̹���
		
		// ��ư �׷�  ��ü ����
		ButtonGroup g = new ButtonGroup();
		
		//��ư �׷� ��ü ����
		JRadioButton apple = new JRadioButton("���");
		JRadioButton pear = new JRadioButton("��",true);
		JRadioButton cherry = new JRadioButton("ü��",aaa); // �̹��� ����
		
		cherry.setBorderPainted(true); //�̹��� ������ư�� �ܰ��� ���
		cherry.setSelectedIcon(bbb); // ���� �����̹��� ���
		
		
		//��ư �׷쿡 3���� ���� ��ư ����
		g.add(apple);
		g.add(pear);
		g.add(cherry);
		
		//����Ʈ�ҿ� 3���� ������ư ����

		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ex6();

	}

}
