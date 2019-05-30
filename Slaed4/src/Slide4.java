import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Slide4 extends JFrame{
	private Thread th;
	public Slide4(){
		setTitle("hreadlnterruptEx  시간멈추기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timeLabel = new JLabel();
		timeLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		TimerRunnable runnable = new TimerRunnable(timeLabel);
		th = new Thread(runnable);
		c.add(timeLabel);
		
		JButton btn = new JButton("kill time");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				th.interrupt();//타이머 스레드 강제 종료
				JButton btn = (JButton)e.getSource();
				btn.setEnabled(false);// 버튼 비활성화
			}
		});
		
		c.add(btn);
		setSize(300,170);
		setVisible(true);
		
		th.start();//스레드 동작시킴
		
	}
	public static void main(String[] args) {
		new Slide4();

	}

}
