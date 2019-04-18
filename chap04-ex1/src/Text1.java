import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;

public class Text1 extends JFrame{
	public Text1() {
		setTitle("���� ������Ʈ ���̱� ����");
		createMenu();
		createToolBar();
		createSplitPane();
		setSize(500,400);
		setVisible(true);
	}
	
	public void createMenu(){
		JMenuBar mb = new JMenuBar();
		mb.add(new JMenu("File"));
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		
		this.setJMenuBar(mb);
		
	}
	
	public void createToolBar(){
		JToolBar bar =new JToolBar("Kitae Menu");
		bar.add(new JButton("New"));
		bar.add(new JButton(new ImageIcon("images/open.jpg")));
		bar.addSeparator();
		bar.add(new JButton(new ImageIcon("images/save.jpg")));
		bar.add(new JLabel("search"));
		bar.add(new JTextField("text field"));
		
		JComboBox<String> combo = new JComboBox<String>();
		combo.addItem("Java");
		combo.addItem("C#");
		combo.addItem("C");
		combo.addItem("C++");
		bar.add(combo);
		add(bar, BorderLayout.NORTH);
	}
	
	public void createSplitPane(){
		String [] fruits={"apple","banana","kiwi","mango","pear","peach","berry","strawberry","blackberry"};
		JList<String> scrollList = new JList<String>(fruits);
		JSplitPane pane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(scrollList),new JScrollPane(new JLabel(new ImageIcon("images/img1.jpg"))));
		add(pane, BorderLayout.CENTER);
	}
	
	public static void main(String[] args){
		new Text1();
	}
	
	
}