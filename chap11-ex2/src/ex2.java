import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ex2 extends JFrame{
	public	ex2(){
		super("레이블 예제");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//문자 레이블 생성 
		JLabel textlabel = new JLabel("사랑함니다");
		//이미지 레이블 생성
		ImageIcon aaa = new ImageIcon("img/beauty.jpg");
		JLabel imglabel = new JLabel(aaa);
		//문자열과 이미지를 모두 가진 레이블 생성
		ImageIcon nono = new ImageIcon("img/normaiIcon.gif");
		JLabel label = new JLabel("보고싶으면 전화해주세요",nono,SwingConstants.CENTER);//레이블 생성

		//컨텐트팬에서 3개의 레이블 부착
		
		c.add(textlabel);
		c.add(imglabel);
		c.add(label);
		
		setSize(400,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ex2();
	}

}
