import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test5 extends JFrame{
	private MyPanel panel = new MyPanel();
	
	public Test5 (){
		setTitle("fillXXX 사용 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(100, 370);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(Color.RED);
			g.fillRect(10, 10, 50, 50); // 빨간색으로 사각형 칠하기
			g.setColor(Color.BLUE); //파란색 적용
			g.fillOval(10, 70, 50, 50); // 파란색으로 타원 만들기
			g.setColor(Color.GREEN); //  초록색으로 타원 만들기
			g.fillRoundRect(10, 130, 50, 50, 20, 20); // 초록색 둥근사각형 칠하기
			g.setColor(Color.MAGENTA); //  마젠타색으로 적용
			g.setColor(Color.ORANGE);
			int []x= {30,10,30,60};
			int []y= {250,275,300,275};
			g.fillPolygon(x, y, 4); // 오렌지색 다각형 만들기
		}
	}
	
	public static void main(String[] args) {
		new Test5();

	}

}
