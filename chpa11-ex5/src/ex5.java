import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ex5 extends JFrame{	
		private JCheckBox [] fruits = new JCheckBox[3]; // 체크박스의 배열
		private String [] name = {"사과","배","체리"};//체크박스 문자열로 사용할 문자열 배열 
		private JLabel sumLabel; //계산 합을 출력할 레이블
		
		public ex5(){
			setTitle("체크박스와 ItemEvent 예제");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			
			c.add(new JLabel("사과 100원,배 800원,체리 20000원"));
			
			//3개의 체크박스를 생성 . 컨텐트팬에 삽입하고 Item 리스너 등록
			MyItemListener listener = new MyItemListener();
			for(int a = 0; int<f)
		}	
		
	public static void main(String[] args) {
		new ex5();
	}

}
