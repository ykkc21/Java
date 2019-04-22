import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class ex3 extends JFrame{
	public ex3(){
		setTitle("체크박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container  c = getContentPane();
		c.setLayout(new FlowLayout());
		//이미지 체크박스에 사용할 2개의 이미지 객체 생성 
		ImageIcon aa = new ImageIcon("img/cherry.jpg");
		ImageIcon bb = new ImageIcon("img/selectedCherry.jpg"); //선택 상태 이미지
		
		//3개의 체크박스 생성 
		JCheckBox apple = new JCheckBox("사과");
		JCheckBox pear = new JCheckBox("배",true);
		JCheckBox cherry = new JCheckBox("체리",aa);
		
		cherry.setBorderPainted(true); // 체크박스 외곽선이 보이도록 설정
		cherry.setSelectedIcon(bb); // 선택 상태 이미지 등록
		
		//컨텐트팬에 3개의 체크박스 부착
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		
		setSize(250,150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ex3();

	}

}
