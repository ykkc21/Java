import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test16 extends JFrame{
	public Test16(){
		setTitle("새로운 버튼 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		MyButton b = new MyButton("New Button");
		b.setOpaque(true);
		b.setBackground(Color.CYAN);
		c.add(b);
		setSize(250, 200);
		setVisible(true);
		
		setSize(200, 300);
		setVisible(true);
	}
	
	class MyButton extends JButton{
		public MyButton(String s){
			super(s); // JButton의 생산자 호출
		}
		//새로운 버튼을 그린다.
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			
			
			//JBuuton의 기본모양 위에  추가적으로 빨간색으로 버튼 크기만한 타원을 그린다.
			g.setColor(Color.RED);
			g.drawOval(0, 0, this.getWidth()-1, this.getHeight()-1);
		}
	}
	
	
	public static void main(String[] args) {
		new Test16();

	}

}
