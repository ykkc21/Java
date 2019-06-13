import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.io.*;
import java.net.Socket;

import javax.swing.*;

public class DicClient extends JFrame {
	private Socket socket = null;	
	private JTextField eng = new JTextField(10);
	private JTextField kor = new JTextField(10);
	private JButton searchBtn = new JButton("ã��");
	
	BufferedReader in = null;
	BufferedWriter out = null;
	
	public DicClient() {
		super("Ŭ���̾�Ʈ"); // ������ Ÿ��Ʋ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //������ ���� ��ư(X)�� Ŭ���ϸ� ���α׷� ����
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("����"));
		c.add(eng);
		c.add(new JLabel("�ѱ�"));
		c.add(kor);
		c.add(searchBtn);	
		try {
			setupConnection();
		} catch (IOException e) {
			handleError(e.getMessage());
		}
		searchBtn.addActionListener(new MyActionListener());
		
		setSize(400,120);
		setVisible(true);
	}
	
	private void handleError(String string) {
		System.out.println(string);
		System.exit(1);
	}
	
	private void setupConnection() throws IOException {
		socket = new Socket("localhost", 9998); // Ŭ���̾�Ʈ ���� ����
		System.out.println("�����");
		in = new BufferedReader(new InputStreamReader(socket.getInputStream())); // Ŭ���̾�Ʈ�κ����� �Է� ��Ʈ��
		out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); // Ŭ���̾�Ʈ���� ��� ��Ʈ��
	}
	
	class MyActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				out.write(eng.getText()+"\n");
				out.flush();
				String text = in.readLine();
				kor.setText(text);
			} catch (IOException e2) {
				handleError(e2.getMessage());
			}
		}	
	}

	public static void main(String[] args) {
		new DicClient();

	}

}