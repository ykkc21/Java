import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;



public class AddTest extends JFrame{
	private JLabel resultLabel = new JLabel("계산 결과 풀력");
	private JTextField tt = new JTextField(20);
	public AddTest(){
		setTitle("계산기 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container cc = getContentPane();
		cc.setBackground(Color.BLUE);
		cc.setLayout(new FlowLayout(FlowLayout.LEFT));
		/*JPanel aa = new JPanel();
		aa.setLayout(new FlowLayout(FlowLayout.LEFT));
		aa.setPreferredSize(new Dimension(300, 200));
		aa.setBackground(Color.PINK);
		cc.add(aa);*/
		
		JPanel aa = new JPanel();
		aa.setLayout(new FlowLayout(FlowLayout.LEFT));
		aa.setBackground(Color.PINK);
		aa.setPreferredSize(new Dimension(300,50));
		cc.add(aa);
		tt.setPreferredSize(new Dimension(300, 50));
		aa.add(tt);
		
		JButton a = new JButton("1");
		a.setBackground(Color.PINK);
		JButton b = new JButton("2");
		b.setBackground(Color.PINK);
		JButton c = new JButton("3");
		c.setBackground(Color.PINK);
		JButton d = new JButton("4");
		d.setBackground(Color.PINK);
		JButton e = new JButton("5");
		e.setBackground(Color.PINK);
		JButton f = new JButton("6");
		f.setBackground(Color.PINK);
		JButton g = new JButton("7");
		g.setBackground(Color.PINK);
		JButton h = new JButton("8");
		h.setBackground(Color.PINK);
		JButton i = new JButton("9");
		i.setBackground(Color.PINK);
		JButton j = new JButton("+");
		j.setBackground(Color.PINK);
		JButton k = new JButton("-");
		k.setBackground(Color.PINK);
		JButton l = new JButton("%");
		l.setBackground(Color.PINK);
		JButton n = new JButton("x");
		n.setBackground(Color.PINK);
		JButton m = new JButton("전체 출력");
		
		JPanel xx = new JPanel();
		JPanel xxx = new JPanel();
		xxx.setLayout(new FlowLayout(FlowLayout.LEFT));
		xxx.setBackground(Color.GREEN);
		xxx.setPreferredSize(new Dimension(300, 80) );
		
		xx.setLayout(new FlowLayout(FlowLayout.LEFT));
		xx.setBackground(Color.PINK);
		xx.setPreferredSize(new Dimension(300,200));
		xx.add(a);
		a.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton a = (JButton)e.getSource();
				if(a.getBackground().equals(Color.PINK)){
					tt.setText("1");
					a.setBackground(Color.CYAN);
				}else{
					
				}
				
			}
		});
		xx.add(b);
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton a = (JButton)e.getSource();
				if(a.getBackground().equals(Color.PINK)){
					tt.setText("2");
					a.setBackground(Color.CYAN);
				}else{
					
				}
				
			}
		});
		xx.add(c);
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton a = (JButton)e.getSource();
				if(a.getBackground().equals(Color.PINK)){
					tt.setText("3");
					a.setBackground(Color.CYAN);
				}else{
					
				}
				
			}
		});
		xx.add(d);
		d.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton a = (JButton)e.getSource();
				if(a.getBackground().equals(Color.PINK)){
					tt.setText("4");
					a.setBackground(Color.CYAN);
				}else{
					
				}
				
			}
		});
		xx.add(e);
		e.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton a = (JButton)e.getSource();
				if(a.getBackground().equals(Color.PINK)){
					tt.setText("5");
					a.setBackground(Color.CYAN);
				}else{
					
				}
				
			}
		});
		xx.add(f);
		f.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton a = (JButton)e.getSource();
				if(a.getBackground().equals(Color.PINK)){
					tt.setText("6");
					a.setBackground(Color.CYAN);
				}else{
					
				}
				
			}
		});
		xx.add(g);
		g.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton a = (JButton)e.getSource();
				if(a.getBackground().equals(Color.PINK)){
					tt.setText("7");
					a.setBackground(Color.CYAN);
				}else{
					
				}
				
			}
		});
		xx.add(h);
		h.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton a = (JButton)e.getSource();
				if(a.getBackground().equals(Color.PINK)){
					tt.setText("8");
					a.setBackground(Color.CYAN);
				}else{
					
				}
				
			}
		});
		xx.add(i);
		i.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JButton a = (JButton)e.getSource();
				if(a.getBackground().equals(Color.PINK)){
					tt.setText("9");
					a.setBackground(Color.CYAN);
				}else{
					a.setBackground(Color.PINK);
				}
				
			}
		});
		xxx.add(j);
		xxx.add(k);
		xxx.add(l);
		xxx.add(n);
		xxx.add(m);
		xx.add(xxx);
		this.add(xx);
	
		
	
		setSize(345,500);
		setVisible(true);
		
		
	}
	

	
	
	
	
	
	public static void main(String[] args) {
		new AddTest();

	}

}
