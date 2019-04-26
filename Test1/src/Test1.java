import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.GapContent;

public class Test1 extends JFrame{
	public Test1(){
		setTitle("그림판 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		main();
		setSize(1250,800);
		setVisible(true);
	}
	
	
	public void main(){
		JMenuBar q = new JMenuBar();
		JButton a = new JButton("파일");
		JButton b = new JButton("홈");
		b.setBackground(Color.WHITE);
		JButton c = new JButton("보기");
		a.setBackground(new Color(0, 128, 255));
		a.setForeground(Color.WHITE);
		
		a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { // 파일버튼 누르면 실행
				
				JButton q = (JButton)e.getSource();
				Container a = getContentPane();
				a.setLayout(new FlowLayout(FlowLayout.LEFT));
				Panel w = new Panel();
				Panel b = new Panel();
				JButton z = new JButton("닫기");
				
				if(q.getBackground().equals(new Color(0,128,255))){
					q.setBackground(new Color(0, 70, 230));
					w.setPreferredSize(new Dimension(450, 500));
					w.setBackground(Color.GRAY);
					w.add(z);
					w.add(b);
					b.setPreferredSize(new Dimension(230,500));
					b.setBackground(Color.MAGENTA);
					a.add(w);
					
					z.addActionListener(new ActionListener() { //파일버튼 누룬다음 닫기버튼 누르면 실행
						public void actionPerformed(ActionEvent e) {
							JButton v = (JButton)e.getSource();
							if(v.getText().equals("닫기")){
								q.setBackground(new Color(0, 128, 255));
								w.setBackground(Color.GREEN);
								w.setVisible(false);
							}
							
						}
					});
					
					setSize(1250,850);
					setVisible(true);
					
				}
			}
		});
		
		b.addActionListener(new ActionListener() { //홈버튼 누르면 실행
			public void actionPerformed(ActionEvent e) {
				JButton a = (JButton)e.getSource();
				Container c = getContentPane();
				c.setLayout(new FlowLayout(FlowLayout.LEFT));
				Panel x = new Panel();
				if(a.getBackground().equals(Color.WHITE)){
					x.setLayout(new FlowLayout(FlowLayout.LEFT));
					x.setPreferredSize(new Dimension(1250, 90));
					x.setBackground(Color.CYAN);
					c.add(x);
					setSize(1250,800);
					setVisible(true);
				}else{
					
				}
			}
		});
		q.add(a);
		q.add(b);
		q.add(c);
		setJMenuBar(q);
	}
	
	
	public static void main(String[] args) {
		new Test1();

	}

}
