package timetable;

import java.sql.*;



public class DBConnection {

	public static void main(String[]args) {
		String dbUrl = "jdbc:mysql://localhost:3306/timetable";
		String user = "root";
		String password = "";
		
		try {
			//.1 established the connection
			Connection myconn = DriverManager .getConnection(dbUrl, user, password);
			
		
			//2. Create a statement
			Statement myStmt = myconn.createStatement();
			
			//3. execute the query
			ResultSet myRs =myStmt.executeQuery("select * from timetable.student");
			
			//4. process the result object 
			while(myRs.next()){
				System.out.println(myRs.getString("student_id")+ " " + myRs.getString("Student_name"));
			}
			
			myStmt.close();
			myconn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
			
					
		}

	}

}
