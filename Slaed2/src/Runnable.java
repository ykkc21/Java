import javax.swing.JLabel;

class TimerRunnable implements Runnable {
private JLabel timJLabel;
public TimerRunnable(JLabel timJLabel){
	this.timJLabel = timJLabel;
}

public void run(){
	int n = 0;
	while (true) {
		timJLabel.setText(Integer.toString(n));
		n++;
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			return;
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
