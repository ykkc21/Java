package ccc;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class ppp extends JFrame{
	public ppp (){
		super("���� ���� -�޸���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.WHITE);
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		mune();
		pppp();
		
		
		setSize(850,500);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new  ppp();
	}
	
	
	private void mune() {
		JMenuBar a = new JMenuBar();
		
		JMenu ww = new JMenu("����(F)");
		ww.add(new JMenuItem("���θ����"));
		ww.add(new JMenuItem("����"));
		ww.add(new JMenuItem("����"));
		ww.add(new JMenuItem("�ٸ��̸����� ����"));
		
		JMenu qq = new JMenu("����(E)");
		qq.add(new JMenuItem("�������"));
		qq.add(new JMenuItem("�߶󳻱�"));
		qq.add(new JMenuItem("����"));
		qq.add(new JMenuItem("�ٿ��ֱ�"));
		qq.add(new JMenuItem("����"));
		
		
		JMenu rr = new JMenu("����(O)");
		rr.add(new JMenuItem("�ڵ� �ٹٲ�(W)"));
		rr.add(new JMenuItem("�۲�(F)"));
		
		JMenu ff = new JMenu("����(V)");
		ff.add(new JMenuItem("���� ǥ����"));
		
		JMenu ii = new JMenu("����(H)");
		ii.add(new JMenuItem("������ ����(H)"));
		ii.add(new JMenuItem("�޸��� ����(A)"));
		
		
		a.add(ff);
		a.add(ww);
		a.add(qq);
		a.add(rr);
		a.add(ii);
		setJMenuBar(a);

	}
	
	private void pppp() {
		JTextArea memo = new JTextArea();
		memo.setBackground(Color.WHITE);
		this.add(memo);

	}

}
