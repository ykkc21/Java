import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test15 extends JFrame{
private MyPanel panel = new MyPanel();
	public Test15(){
		setTitle("drawPolygon ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(200,300);
		setVisible(true);
	}
	
	class MyPanel extends JPanel{
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.setColor(Color.RED);
			int []x = {80,40,80,120};
			int []y = {40,120,200,120};
			g.drawPolygon(x,y,4);
		}
	}
	public static void main(String[] args) {
		new Test15();

	}

}
