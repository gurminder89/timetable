package timetable;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class login {

	private JFrame frmLogin;
	private JTextField txtStudname;
	private JTextField txtStudID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frmLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLogin = new JFrame();
		frmLogin.setForeground(Color.WHITE);
		frmLogin.setTitle("login");
		frmLogin.setBounds(100, 100, 450, 300);
		frmLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("StudentName");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(65, 42, 98, 36);
		frmLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("StudentID");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(65, 113, 98, 36);
		frmLogin.getContentPane().add(lblNewLabel_1);
		
		txtStudname = new JTextField();
		txtStudname.setBounds(193, 51, 159, 20);
		frmLogin.getContentPane().add(txtStudname);
		txtStudname.setColumns(10);
		
		txtStudID = new JTextField();
		txtStudID.setBounds(193, 122, 159, 20);
		frmLogin.getContentPane().add(txtStudID);
		txtStudID.setColumns(10);
		
		JButton btnLogin = new JButton("Log In");
		
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//write the condition here
				if((txtStudname.getText().equals("gur")) && (txtStudID.getText().equals("123"))) {
					JOptionPane.showMessageDialog(null, "Correct Credentials"); 
					{
					frmLogin.dispose();
					Courses obj = new Courses();
					obj.setVisible(true);
					} 
				}
					else {
						JOptionPane.showMessageDialog(null, "error");
						{
					}
					
				 
				
				//to make the current window disappear
				
				
				//shifting to the next page
				
				
					}
			}
		});
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogin.setBounds(180, 197, 89, 23);
		frmLogin.getContentPane().add(btnLogin);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(58, 189, 339, -3);
		frmLogin.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(40, 181, 368, -3);
		frmLogin.getContentPane().add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(40, 189, 362, 2);
		frmLogin.getContentPane().add(separator_2);
	}
}
