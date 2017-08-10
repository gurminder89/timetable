package timetable;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import javax.swing.JTable;

public class TimeTable extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TimeTable frame = new TimeTable();
					frame.setTitle("Time Table");
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
	public TimeTable() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//contentPane.setLayout(null);
		this.setTitle("Time Table");
		
		
		String[] columnNames = {"First Name", "Last Name",  "Sport", "# of Years", "Vegetarian"};
		
		String[][] timeTable = new String[6][10];
		String[] headerRow = { "", "Monday","Tuesday", "Wednesday", "Thursday", "Friday"};
		timeTable[0] = headerRow;

		table= new JTable(timeTable, columnNames);
		//table.setBounds(409, 242, -379, -212);
		contentPane.add(table);
	}
}
