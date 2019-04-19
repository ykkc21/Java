package ddd;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class dddd extends JFrame{
	public dddd(){
		setTitle("자바이벤트연습");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton a = new JButton("간영훈");
		a.addActionListener(new MyActionListener());
		c.add(a);
		
		setSize(350,150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new dddd();
	}
	//독립된 클래스로 이벤트 리스너를 작성한다.
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("간영훈"))
				b.setText("기능반");
			else
				b.setText("간영훈");
		}
	}
	

}
 