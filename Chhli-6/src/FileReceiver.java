import java.awt.BorderLayout;
import java.awt.Container;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class FileReceiver extends JFrame {
	private JTextArea log = new JTextArea(); 
	private JLabel imageLabel = new JLabel();
	
	public FileReceiver() {
		super("���� �޴� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(new JScrollPane(log), BorderLayout.NORTH);
		c.add(imageLabel, BorderLayout.CENTER);
		
		setSize(300,300);
		setVisible(true);
		
		startService();
		
	}
	
	private void startService() {
		ServerThread server = new ServerThread();
		server.start();
	}
	
	
	private void drawImage(String file) {
		ImageIcon icon = new ImageIcon(file);
		imageLabel.setIcon(icon);
		this.pack();
	}
	
	private class ServerThread extends Thread {
		
		@Override
		public void run() {
			BufferedInputStream fin = null;
			BufferedOutputStream fout = null;
			ServerSocket listener = null;
			Socket socket = null;
			String saveFileName = null;
			try {
				listener = new ServerSocket(9999);
			} catch (IOException e1) {
				e1.printStackTrace();
			} // ���� ���� ����
			
			while(true) {
				try {	
					socket = listener.accept(); // waiting client connection
					log.setText("�����\n");
					fin = new BufferedInputStream(socket.getInputStream()); // Ŭ���̾�Ʈ�κ����� �Է� ��Ʈ��
					int cmd;
					String fileName = null;
					long length=0;
					
					cmd = fin.read();
					if (cmd == Command.FILE_NAME) { // FILE_NAME ��� ����
						int nameSize = receiveInt(fin); // ���� �̸� ũ��
						log.append("���۹��� ���� �̸� ���� :" + nameSize + "\n");
						byte fname[] = new byte[nameSize];
						fin.read(fname); 
						fileName = new String(fname);
						log.append("���۹��� ���� �̸�:" + fileName + "\n");
						saveFileName = "copy_" + fileName;
						log.append("������ ���� �̸�:" + saveFileName + "\n");
						fout = new BufferedOutputStream(new FileOutputStream(saveFileName));
					} else {
						log.append("��� ���� ����" + cmd + "\n");
						socket.close(); // Ŭ���̾�Ʈ�� ��ſ� ���� �ݱ�
						listener.close(); // ���� ���� �ݱ�
						return;
					}
					cmd = fin.read();
					if (cmd == Command.FILE_SIZE) { // FILE_SIZE ��� ����
						int lenghLow = receiveInt(fin); // ���� ũ���� ���� 4����Ʈ
						int lenghHigh = receiveInt(fin); // ���� ũ���� ���� 4����Ʈ
						length = lenghHigh;
						length <<= 32; // ���� ����Ʈ�� ����� ���� 32��Ʈ ����Ʈ
						length += lenghLow; // ���� 4 ����Ʈ ���ϱ�
						log.append("���۹��� ���� ũ��:" + length + "\n");
					} else {
						log.append("��� ���� ����" + cmd + "\n");
						if (fout != null)
							fout.close();
						socket.close(); // Ŭ���̾�Ʈ�� ��ſ� ���� �ݱ�
						listener.close(); // ���� ���� �ݱ�
						return;
					}
					cmd = fin.read();
					if (cmd == Command.SEND_BEGIN) {
						int numberToRead;
						while (length >0) {
							byte b[] = new byte[2048];
							if (length < b.length) 
								numberToRead = (int)length;
							else
								numberToRead = b.length;
							int numRead = fin.read(b, 0, numberToRead);
							if (numRead <= 0) { 
								if (length > 0) { // �� �̻� ���� ���� ���µ� ���� ���� ũ�⸸ŭ �� ���� ���
									log.append("���� ������ �߻��߽��ϴ�. ���� ����Ʈ: " + numRead + " ���� ����Ʈ:" + length + "\n");
									break;
								}
							} else {
								log.append("."); // ���� ���� ǥ�� 
								fout.write(b, 0, numRead);
								length -= numRead;
							}
						}
						cmd = fin.read();
						if (cmd == Command.SEND_END) { // SEND_END ���
							log.append("\n���� ���� ����. ���� j���� ����Ǿ����ϴ�.\n");
						} else {
							log.append("\n��� ���� ����" + cmd + "\n");
						}
						if (fout != null)
							fout.close();
						socket.close(); // Ŭ���̾�Ʈ�� ��ſ� ���� �ݱ�					
						drawImage(saveFileName);
					}
				} catch (IOException e) {
					e.printStackTrace();
					log.append("���� ���� �� ������ �߻��߽��ϴ�.\n");
				}
			} // end of while
		}

	}

	private int receiveInt(BufferedInputStream fin) throws IOException {
		int value;
		value = fin.read();
		value |= fin.read() << 8;
		value |= fin.read() << 16;
		value |= fin.read() << 24;
		return value;
	}
	
	public static void main(String[] args) {
		new FileReceiver();
	}



}