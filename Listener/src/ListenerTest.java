import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ListenerTest extends JFrame{
	public ListenerTest(){
		setTitle("리스너 이벤트 Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container x = getContentPane();
		x.setLayout(new FlowLayout(FlowLayout.LEFT));
		x.setBackground(Color.PINK);
		qqq();
		
		
		setSize(500,430);
		setVisible(true);
	}
	
	public void qqq(){
		JButton a = new JButton(new ImageIcon("img/img1.jpg"));
		a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		this.add(a);
	}
	
	public static void main(String[] args) {
		new ListenerTest();
	}

}
