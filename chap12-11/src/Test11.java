import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test11 extends JFrame{
	private MyPanel panel = new MyPanel();
	public Test11(){
		setTitle("drawOval ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(panel);
		
		setSize(200, 170);
		setVisible(true);
	}
	
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g){
			g.setColor(Color.RED);
			g.drawOval(20, 20, 80, 80);
		}
	}
	public static void main(String[] args) {
		new Test11();

	}

}
