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
		setTitle("hreadlnterruptEx  �ð����߱� ����");
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
				th.interrupt();//Ÿ�̸� ������ ���� ����
				JButton btn = (JButton)e.getSource();
				btn.setEnabled(false);// ��ư ��Ȱ��ȭ
			}
		});
		
		c.add(btn);
		setSize(300,170);
		setVisible(true);
		
		th.start();//������ ���۽�Ŵ
		
	}
	public static void main(String[] args) {
		new Slide4();

	}

}
