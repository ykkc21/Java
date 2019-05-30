import javax.swing.JLabel;

public class Timer extends Thread {
private JLabel timeLabel;
public Timer(JLabel timeLabel){
	this.timeLabel = timeLabel;
}

public void run(){
	int n=0;
	while(true){
		timeLabel.setText(Integer.toString(n));
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
