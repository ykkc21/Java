import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Slide3 extends JFrame {
	public Slide3(){
		setTitle("FlickeringLabelEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//깜빡이는 레이블 생성
		SLIDE0 label1 = new SLIDE0("깜빡",500);
		
		//깜박이지 않는 레이블 생성
		JLabel label = new JLabel("안깜박");
		
		//깜박이는 레이블 생성 
		SLIDE0 label2 = new SLIDE0("여기도 깜박",300);
		
		c.add(label1);
		c.add(label);
		c.add(label2);
		
		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Slide3();
	}

}
