import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Slide1 extends JFrame{
	public Slide1(){
		setTitle("Thread를 상속받은 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cc = getContentPane();
		cc.setLayout(new FlowLayout());
		
		JLabel timeLabel = new JLabel();
		timeLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		cc.add(timeLabel);
		
		Timer th = new Timer(timeLabel);
		setSize(300,170);
		setVisible(true);
		
		th.start();
		
	}
	public static void main(String[] args) {
		new Slide1();

	}

}
