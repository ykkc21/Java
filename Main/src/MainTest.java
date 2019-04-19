import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class MainTest extends JFrame {
	public MainTest(){
		super("���� �����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.CYAN);
		c.setLayout(new FlowLayout());
		c.add(new JButton(new ImageIcon("/img/img1.jpg")));
		
		JButton a = new JButton("������");
		a.addActionListener(new MyActionListener());
		c.add(a);
		
		setSize(850,850);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainTest();
	}
	
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("������"))
				b.setText("�����ڵ��� ����б�");
			else
				b.setText("������");
		}
	}

}
