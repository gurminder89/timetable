package timetable;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;

public class sehudule extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sehudule frame = new sehudule();
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
	public sehudule() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 556, 330);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 21, 46, 14);
		contentPane.add(label);
		
		JLabel lblMonaday = new JLabel("Monaday");
		lblMonaday.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMonaday.setBounds(20, 52, 78, 24);
		contentPane.add(lblMonaday);
		
		JLabel lblTuseday = new JLabel("Tuseday");
		lblTuseday.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTuseday.setBounds(20, 87, 78, 34);
		contentPane.add(lblTuseday);
		
		JLabel lblWednesday = new JLabel("Wednesday");
		lblWednesday.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblWednesday.setBounds(20, 132, 78, 24);
		contentPane.add(lblWednesday);
		
		JLabel lblThusday = new JLabel("Thusday");
		lblThusday.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblThusday.setBounds(20, 167, 78, 24);
		contentPane.add(lblThusday);
		
		JLabel lblFriday = new JLabel("friday");
		lblFriday.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblFriday.setBounds(20, 203, 78, 24);
		contentPane.add(lblFriday);
		
		JLabel lblNewLabel = new JLabel("8:00    8:30   9:00  9:30  10:00  10:30  11:00   11:30  12:00  12:30    ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(89, 11, 441, 24);
		contentPane.add(lblNewLabel);
	}
}
