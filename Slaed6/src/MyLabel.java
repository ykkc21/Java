import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JLabel;

public class MyLabel extends JLabel {
int barSize = 0;
int maxBarSize;

MyLabel(int maxBarSize){
	this.maxBarSize = maxBarSize;
}

public void paintComponent(Graphics g){
	super.paintComponent(g);
	g.setColor(Color.MAGENTA);
	int width = (int)(((double)(this.getWidth()))/maxBarSize*barSize);
	if(width == 0) return;
	g.fillRect(0, 0, width, this.getHeight());
}

synchronized void fill(){
	if(barSize == maxBarSize){
		try {
			wait();
		} catch (InterruptedException e) {return;}
	}
	barSize++;
	repaint(); //바 다시그리기
	notify();
}

synchronized void consume(){
	if(barSize == 0){
		try {
			wait();
		} catch (InterruptedException e) 
			{return;}
	}
	barSize--;
	repaint();
	notify();
  }
}
