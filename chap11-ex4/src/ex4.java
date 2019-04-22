import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ex4 extends JFrame{
	public ex4(){
		setTitle("이미지 버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//3개의 이미지를 파일로부터 읽어들인다.
		ImageIcon aaa = new ImageIcon("img/normalIcon.gif");
		ImageIcon bbb = new ImageIcon("img/rolloverIcon.gif");
		ImageIcon ccc = new ImageIcon("img/pressedIcon.gif");
		
		//3개의 이미지를 가진  버튼생성
		JButton bn1 = new JButton("call~~",aaa);
		bn1.setPressedIcon(ccc);//pressedIcon 이미지 등록
		bn1.setRolloverIcon(bbb);//rolloverIcon 이미지 등록
		c.add(bn1);
		
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ex4();

	}

}
