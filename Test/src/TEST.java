import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.Vector;
import javax.swing.*;

public class TEST extends JFrame {
	private RadioPanel radioPanel = new RadioPanel();
	private JLabel imageLabel = new JLabel(); 
	private Vector<ImageIcon> imageVector = new Vector<ImageIcon>(); 
	
	public TEST() {
		super("Image Gallery Practice Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new BorderLayout());

		loadImages("images"); // ���� ���͸� ���� images ���͸�
		c.add(radioPanel, BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);		
		imageLabel.setIcon(imageVector.get(0)); // �ε��� �̹��� �� ù �̹���
		
		imageLabel.addMouseListener(new MyMouseListener(0)); // 0�� �̹������� ����	
		
		setSize(400,300);
		setVisible(true);
	}
	
	class MyMouseListener extends MouseAdapter {
		private int index;
		
		public MyMouseListener(int startIndex) {
			index = startIndex;
		}
		
		@Override
		public void mouseReleased(MouseEvent e) {
			if(radioPanel.isLeft()) { //���� �������� ������
				index++;
				index %= imageVector.size();
				imageLabel.setIcon(imageVector.get(index));
			}
			else { // ������ �������� ������
				index--;
				if(index == -1)
					index = imageVector.size()-1;
				
				imageLabel.setIcon(imageVector.get(index));				
			}
		}
	}
	
	public void loadImages(String path) {
		File file = new File(path);
		File [] files = file.listFiles();
		for(File f : files) { // path �ؿ� �ִ� ��� ���ϸ� �˾Ƴ���
			if(f.isFile()) { // ������ ��쿡��
				ImageIcon icon = new ImageIcon(f.getPath());
				imageVector.add(icon);
			}
		}
		
	}
	
	class RadioPanel extends JPanel {
		private JRadioButton leftRadio = new JRadioButton("left");
		private JRadioButton rightRadio = new JRadioButton("right");

		public RadioPanel() {
			// ��ư �׷쿡 ������ư �߰�
			ButtonGroup g = new ButtonGroup();
			g.add(leftRadio);
			g.add(rightRadio);
			
			// �гο� ����
			add(leftRadio);
			add(rightRadio);
			
			leftRadio.setSelected(true);
		}
		
		public boolean isLeft() {
			return leftRadio.isSelected();
		}
	}
	public static void main(String[] args) {
		new TEST();
	}
}
