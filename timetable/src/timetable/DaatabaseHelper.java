package timetable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DaatabaseHelper {
	
	Connection myconn;
	
	public List<String> getStudentCourses(int studentId) {
		
		List<String> courseList = new ArrayList<String>();
		//2. Create a statement
		Statement myStmt;
		try {
			myStmt = getConnection().createStatement();
			//3. execute the query
			ResultSet myRs = myStmt.executeQuery("SELECT course_name FROM student_course s, "
					+ "course c where s.course_id = c.course_id and s.student_id = " + studentId);
			
			while(myRs != null && myRs.next()) {
				String courseName = myRs.getString("course_name");
				courseList.add(courseName);
				System.out.println("Got course name from database ::" + courseName);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return courseList;
		
	}
	
	private Connection getConnection() {
		if(myconn != null) {
			return myconn;
		}
		String dbUrl = "jdbc:mysql://localhost:3306/timetable";
		String user = "root";
		String password = "";
		
		try {
			//.1 established the connection
			 myconn = DriverManager .getConnection(dbUrl, user, password);
			return myconn;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
