import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test3 extends JFrame{
	public Test3(){
		super("Left 키로 문자열 교채");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 Container c = getContentPane();
		 c.setLayout(new FlowLayout());
		 
		JLabel label = new JLabel("Love Java");
		c.add(label);
		
		label.addKeyListener(new KeyAdapter() {
			public void keyPressed (KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_LEFT){
					JLabel la = (JLabel)e.getSource();
					StringBuffer text = new StringBuffer(la.getText());
					la.setText(text.reverse().toString());
				}

			}
		});
		
		c.add(label);
		setSize(250,100);
		setVisible(true);
		
		label.setFocusable(true);
		label.requestFocus();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test3();
	}

}
