package ccc;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class ppp extends JFrame{
	public ppp (){
		super("제목 없음 -메모장");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setBackground(Color.WHITE);
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		mune();
		pppp();
		
		
		setSize(850,500);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new  ppp();
	}
	
	
	private void mune() {
		JMenuBar a = new JMenuBar();
		
		JMenu ww = new JMenu("파일(F)");
		ww.add(new JMenuItem("새로만들기"));
		ww.add(new JMenuItem("열기"));
		ww.add(new JMenuItem("저장"));
		ww.add(new JMenuItem("다름이름으로 저장"));
		
		JMenu qq = new JMenu("편집(E)");
		qq.add(new JMenuItem("실행취소"));
		qq.add(new JMenuItem("잘라내기"));
		qq.add(new JMenuItem("복사"));
		qq.add(new JMenuItem("붙여넣기"));
		qq.add(new JMenuItem("삭제"));
		
		
		JMenu rr = new JMenu("서식(O)");
		rr.add(new JMenuItem("자동 줄바꿈(W)"));
		rr.add(new JMenuItem("글꼴(F)"));
		
		JMenu ff = new JMenu("보기(V)");
		ff.add(new JMenuItem("상태 표시줄"));
		
		JMenu ii = new JMenu("도움말(H)");
		ii.add(new JMenuItem("도물말 보기(H)"));
		ii.add(new JMenuItem("메모장 정보(A)"));
		
		
		a.add(ff);
		a.add(ww);
		a.add(qq);
		a.add(rr);
		a.add(ii);
		setJMenuBar(a);

	}
	
	private void pppp() {
		JTextArea memo = new JTextArea();
		memo.setBackground(Color.WHITE);
		this.add(memo);

	}

}
