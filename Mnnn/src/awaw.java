import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.management.loading.PrivateClassLoader;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class awaw extends JFrame{
	public awaw(){
		setTitle("����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		JButton btn = new JButton("���ϱ� ����");
		JButton btn1 = new JButton("���� ����");
		JButton btn2 = new JButton("������  ����");
		JButton btn3 = new JButton("���ϱ� ����");
		c.add(btn);
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new plWindow();
			}
		});
		c.add(btn1);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				new Dialog2();
			}
		});
		c.add(btn2);
		c.add(btn3);
		
		setSize(300,300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new awaw();
	}

}

class plWindow extends JFrame{
	private int sum = 0;
	private JTextField a = new JTextField(20);
	private JTextField b = new JTextField(20);
	plWindow(){
		setTitle("���ϱ� �Ҳ���");
		
		JPanel aaa = new JPanel();
		JPanel vvv = new JPanel();
		vvv.setPreferredSize(new Dimension(200, 90) );
		vvv.setBackground(Color.CYAN);
		aaa.add(vvv);
		aaa.setLayout(new FlowLayout(FlowLayout.CENTER));
		aaa.setPreferredSize(new Dimension(400, 350));
		this.add(aaa);
		
		aaa.add(a);
		aaa.add(b);
		
		JButton ccc = new JButton("���ұ��??");
		ccc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		aaa.add(ccc);
		
		setSize(300, 300);
		setVisible(true);
		
	}
}


class Dialog2 extends JFrame{
	private int sum = 0;
	private JTextField a = new JTextField(20);
	private JTextField b = new JTextField(20);
	Dialog2(){
		setTitle("�����Ҳ���");
		
		JPanel qqq = new JPanel();
		JPanel ooo = new JPanel();
		qqq.setLayout(new FlowLayout());
		qqq.setPreferredSize(new Dimension(300, 300));
		ooo.setLayout(new FlowLayout(FlowLayout.CENTER));
		ooo.setBackground(Color.CYAN);
		ooo.setPreferredSize(new Dimension(200, 90));
		qqq.add(ooo);
		this.add(qqq);
		
		qqq.add(a);
		qqq.add(b);
		
		JButton ccc = new JButton("�E���??");
		ccc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		qqq.add(ccc);
		
		setSize(300,300);
		setVisible(true);
	}
}
