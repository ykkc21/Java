import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{

	public Login(){
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("ID : ");
		JLabel pass = new JLabel("Password : ");
		JTextField textID = new JTextField(10);
		JPasswordField textPass = new JPasswordField(10);
		
		JButton logBtn = new JButton("Log In");
		
		logBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = "Den";
				String pass = "1234";
				
				if(id.equals(textID.getText()) &&pass.equals(textPass.getText())){
					JOptionPane.showConfirmDialog(null, "°£¿µÈÆ");
				}
			}
		});
		
		panel.add(label);
		panel.add(textID);
		panel.add(pass);
		panel.add(textPass);
		panel.add(logBtn);
		
		add(panel);
		
		setSize(600,400);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Login();
	}

}
