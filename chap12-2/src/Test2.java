import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test2 extends JFrame{
	private MyPanel panel = new MyPanel();
	public Test2(){
		setTitle("drawSteing 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel); // 생성한 panel 패널을 컨텐트팬으로 사용
		
		setSize(250,200);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawString("자바는 재밌다.~~~", 30, 30); // 패널의 30,30 위치에 문자열 출력
			g.drawString("얼마나? 하늘만큼 땅만큼 !!!!", 60, 60);
		}
	}
	
	
	
	public static void main(String[] args) {
		new Test2();		
	}

}
