package timetable;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JSeparator;
import javax.swing.JButton;

public class Courses extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Courses frame = new Courses();
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
	public Courses() {
		setTitle("course");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		// contentPane.setLayout();

		DaatabaseHelper databaseHelper = new DaatabaseHelper();
		List<String> courseList = databaseHelper.getStudentCourses(123);

		for (String courseName : courseList) {
			JCheckBox chckbxNewCheckBox = new JCheckBox(courseName);
			chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 12));
			// chckbxNewCheckBox.setBounds(19, 23, 200, 50);
			contentPane.add(chckbxNewCheckBox);
		}

		JSeparator separator = new JSeparator();
		separator.setBounds(19, 198, 389, 2);
		contentPane.add(separator);

		JButton printButton = new JButton("Print");
		printButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		printButton.setBounds(146, 211, 120, 40);
		contentPane.add(printButton);

		addActionListenerToPrint(printButton);
	}

	private void addActionListenerToPrint(JButton printButton) {
		printButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// write the condition here

				contentPane.setVisible(false);
				TimeTable obj = new TimeTable();
				obj.setVisible(true);

			}
		});

	}
}
