package ddd;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class dddd extends JFrame{
	public dddd(){
		setTitle("�ڹ��̺�Ʈ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton a = new JButton("������");
		a.addActionListener(new MyActionListener());
		c.add(a);
		
		setSize(350,150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new dddd();
	}
	//������ Ŭ������ �̺�Ʈ �����ʸ� �ۼ��Ѵ�.
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("������"))
				b.setText("��ɹ�");
			else
				b.setText("������");
		}
	}
	

}
 