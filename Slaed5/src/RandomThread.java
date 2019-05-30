import java.awt.Color;
import java.awt.Container;

import javax.swing.JLabel;

public class RandomThread extends Thread {
private Container contentPane;
private boolean flag=false; // 스레드의 종료 명령을 표시하는 플래그 true는 종료 실시
public RandomThread(Container contentPane){
	this.contentPane = contentPane;
}

void finish(){
	flag = true;
}

public void run(){
	while(true){
		int x = ((int)(Math.random()*contentPane.getWidth()));
		int y = ((int)(Math.random()*contentPane.getHeight()));
		JLabel label = new JLabel("JAVA");//새로운 레이블 생성
		label.setSize(80,30);
		label.setLocation(x,y);
		contentPane.add(label);
		contentPane.repaint();
		
		try {
			Thread.sleep(300); //0.3초동안  잠을 잔다.
			if(flag == true){
				contentPane.removeAll();
				label = new JLabel("finish");
				label.setSize(80, 30);
				label.setLocation(100, 100);
				label.setForeground(Color.RED);
				contentPane.add(label);
				contentPane.repaint();
				return; // 스레드 종료
			}
		}
		catch (Exception e) {
				return;
		}
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
