import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test5 extends JFrame {
	public Test5(){
		super("클릭 연습 용 응용플그램 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("C");
		c.add(label);
		
		//레이블에 정대위치 지정
		label.setLocation(100,100);
		label.setSize(20,20);
		label.addMouseListener(new MouseAdapter() {
			public void aaa(MouseEvent e) {
				JLabel la = (JLabel)e.getSource();
				Container c = la.getParent();
				
				//컨테이너 트기 내에서 랜덤한 레이블 위치 지정
				int xbound = c.getWidth() - la.getWidth();// 레이블의 폭만큼 감소
				int ybound = c.getHeight() - la.getHeight();// 레이블의 높이만큼 감소
				int x =(int)(Math.random()*xbound);
				int y =(int)(Math.random()*ybound);
				la.setLocation(x,y);
			}
		});
		
		setSize(300,300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Test5();
	}

}
