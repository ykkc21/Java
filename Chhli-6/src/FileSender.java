import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileSender extends JFrame {
	private JTextField fileNameTf = new JTextField(20);
	private JButton selBtn = new JButton("�̹��� ����");
	private JButton sendBtn = new JButton("���� ����");
	private String filePath = null;
	
	public FileSender() {
		setTitle("���� ���� Ŭ���̾�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(fileNameTf);
		c.add(selBtn);
		c.add(sendBtn);
		
		selBtn.addActionListener(new FileChooseActionListener());
		sendBtn.addActionListener(new MyActionListener());
		setSize(350,150);
		setVisible(true);
	
	}
	

	class FileChooseActionListener implements ActionListener {
		private JFileChooser chooser;
		
		public FileChooseActionListener() {
			chooser= new JFileChooser(); // ���� ���̾�α� ����
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			FileNameExtensionFilter filter = new FileNameExtensionFilter(
					        "JPG & GIF & PNG Images", // ���� �̸��� â�� ��µ� ���ڿ�
					        "jpg", "gif", "png"); // ���� ���ͷ� ���Ǵ� Ȯ����. *.jpg. *.gif, *.png�� ������

			chooser.setFileFilter(filter); // ���� ���̾�α׿� ���� ���� ����
				
			// ���� ���̾�α� ���
			int ret = chooser.showOpenDialog(null);
			if(ret != JFileChooser.APPROVE_OPTION) { // ����ڰ�  â�� ������ �ݾҰų� ��� ��ư�� ���� ���
				JOptionPane.showMessageDialog(FileSender.this, "������ �������� �ʾҽ��ϴ�", "���", JOptionPane.WARNING_MESSAGE);
				return;
			}
				
			// ����ڰ� ������ �����ϰ� "����" ��ư�� ���� ���
			filePath = chooser.getSelectedFile().getPath(); // ���� ��θ��� �˾ƿ´�.
			fileNameTf.setText(filePath);
		}
	}
	
	class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(filePath == null)
				return; // ������ ���õ��� �ʾ���
			
			FileInputStream fin = null; // BufferedInputStream
			File f = null;
			BufferedOutputStream fout = null;
			Scanner scanner  = new Scanner(System.in);
			Socket socket = null;
			try {
				socket = new Socket("localhost", 9999); // Ŭ���̾�Ʈ ���� ����
				f = new File(filePath);
				long length = f.length();
				fin = new FileInputStream(f); // Ű����κ����� �Է� ��Ʈ��
				fout = new BufferedOutputStream(socket.getOutputStream()); // �������� ��� ��Ʈ��
				
				byte[] fname = f.getName().getBytes(); // ��θ� ������ ���� �̸�
				int nameSize = fname.length;
				fout.write(Command.FILE_NAME); // FILE_NAME ��� ����
				sentInt(fout, nameSize);  // ���� �̸� ũ�� ����
				fout.write(fname); // ���� ���� �̸� ����
				
				fout.write(Command.FILE_SIZE); // FILE_SIZE ��� ����
				sentInt(fout, (int)length);
				sentInt(fout, (int)(length >>> 32));
				
				fout.write(Command.SEND_BEGIN); // SEND_BEGIN ��� ����
				int count = 0;
				byte b[] = new byte[512];
				while (length > 0) {
					int numRead = fin.read(b,0,b.length);
					if (numRead <= 0) { 
						if (length > 0) { // �� �̻� ���� ���� ���µ� ���� ���� ũ�⸸ŭ �� ���� ���
							System.out.println("���� ������ �߻��߽��ϴ�. ���� ����Ʈ: " + count + " ���� ����Ʈ:" + length);					
							break;
						} 
					} else {
						fout.write(b, 0, numRead);
						length -= numRead;
						fout.flush();
						count += numRead;
					}
				}
				fout.write(Command.SEND_END); // SEND_END ��� ����
				fout.flush();
				fin.close();
				socket.close(); // Ŭ���̾�Ʈ ���� �ݱ�
				System.out.println("���� ������ �Ϸ�Ǿ����ϴ�.");
			} catch (IOException e2) {
				System.out.println("���� ���� �� ������ �߻��߽��ϴ�.");
			}
			
		}
		
	}
	
	private void sentInt(BufferedOutputStream fout, int value) throws IOException {
		fout.write(value & 0x000000ff);
		fout.write((value & 0x0000ff00)>>8);
		fout.write((value & 0x00ff0000)>>16);
		fout.write((value & 0xff000000)>>24);
	}
	
	public static void main(String[] args) {
		new FileSender();
	}

	
}