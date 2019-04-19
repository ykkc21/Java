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
		super("직접 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.CYAN);
		c.setLayout(new FlowLayout());
		c.add(new JButton(new ImageIcon("/img/img1.jpg")));
		
		JButton a = new JButton("간영훈");
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
			if(b.getText().equals("간영훈"))
				b.setText("인평자동차 고등학교");
			else
				b.setText("간영훈");
		}
	}

}
