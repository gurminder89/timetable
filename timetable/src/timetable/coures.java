package timetable;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;

public class coures extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					coures frame = new coures();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public coures() {
		setTitle("course");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("course1");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxNewCheckBox.setBounds(19, 23, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("course2");
		chckbxNewCheckBox_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxNewCheckBox_1.setBounds(19, 68, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("course3");
		chckbxNewCheckBox_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxNewCheckBox_2.setBounds(19, 119, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("course4");
		chckbxNewCheckBox_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxNewCheckBox_3.setBounds(19, 168, 97, 23);
		contentPane.add(chckbxNewCheckBox_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(19, 198, 389, 2);
		contentPane.add(separator);
		
		JButton btnNewButton = new JButton("Print");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(146, 211, 120, 40);
		contentPane.add(btnNewButton);
	}
}
