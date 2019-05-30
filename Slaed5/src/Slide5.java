import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class Slide5 extends JFrame{
	private RandomThread th;
	public Slide5(){
		setTitle("ThreadFinishFkagEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(null);
		
		c.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e){
				th.finish();// 스레드 종료 명령
			} 
		});
		
		setSize(300,200);
		setVisible(true);
		
		th = new RandomThread(c); //스레드 생성
		th.start();
	}
	public static void main(String[] args) {
		new Slide5();

	}

}
