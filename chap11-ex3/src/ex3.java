import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class ex3 extends JFrame{
	public ex3(){
		setTitle("üũ�ڽ� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container  c = getContentPane();
		c.setLayout(new FlowLayout());
		//�̹��� üũ�ڽ��� ����� 2���� �̹��� ��ü ���� 
		ImageIcon aa = new ImageIcon("img/cherry.jpg");
		ImageIcon bb = new ImageIcon("img/selectedCherry.jpg"); //���� ���� �̹���
		
		//3���� üũ�ڽ� ���� 
		JCheckBox apple = new JCheckBox("���");
		JCheckBox pear = new JCheckBox("��",true);
		JCheckBox cherry = new JCheckBox("ü��",aa);
		
		cherry.setBorderPainted(true); // üũ�ڽ� �ܰ����� ���̵��� ����
		cherry.setSelectedIcon(bb); // ���� ���� �̹��� ���
		
		//����Ʈ�ҿ� 3���� üũ�ڽ� ����
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		
		setSize(250,150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ex3();

	}

}
