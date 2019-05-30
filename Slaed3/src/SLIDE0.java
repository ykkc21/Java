import java.awt.Color;

import javax.swing.JLabel;

public class SLIDE0 extends JLabel implements Runnable{
private long delay;
public SLIDE0(String text, long delay){
	super(text);
	this.delay = delay;
	setOpaque(true);
	Thread th = new Thread(this);
	th.start();
}
	@Override
	public void run() {
		int a =0;
	while(true){
		if(a==0)
			setBackground(Color.YELLOW);
			else
				setBackground(Color.CYAN);
			if(a == 0){
				a=1;
			}
			else{
				a=0;
			}
			try {
				Thread.sleep(delay);
			} catch (Exception e) {
				return;
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
