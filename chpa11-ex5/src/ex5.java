import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ex5 extends JFrame{	
		private JCheckBox [] fruits = new JCheckBox[3]; // üũ�ڽ��� �迭
		private String [] name = {"���","��","ü��"};//üũ�ڽ� ���ڿ��� ����� ���ڿ� �迭 
		private JLabel sumLabel; //��� ���� ����� ���̺�
		
		public ex5(){
			setTitle("üũ�ڽ��� ItemEvent ����");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			
			c.add(new JLabel("��� 100��,�� 800��,ü�� 20000��"));
			
			//3���� üũ�ڽ��� ���� . ����Ʈ�ҿ� �����ϰ� Item ������ ���
			MyItemListener listener = new MyItemListener();
			for(int a = 0; int<f)
		}	
		
	public static void main(String[] args) {
		new ex5();
	}

}
