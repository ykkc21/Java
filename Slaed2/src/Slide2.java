import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Slide2 extends JFrame {
	public Slide2(){
		setTitle("Runnable을 구현한 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cc = getContentPane();
		cc.setLayout(new FlowLayout());
		JLabel timeLabel = new JLabel();
		timeLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		cc.add(timeLabel);
		
		TimerRunnable runnable = new TimerRunnable(timeLabel);
		Thread th = new Thread(runnable);
		
		setSize(250,250);
		setVisible(true);
		th.start();
	}
	public static void main(String[] args) {
		new Slide2();

	}

}
