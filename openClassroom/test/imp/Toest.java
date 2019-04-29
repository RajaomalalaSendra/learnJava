package openClassroom.test.imp;

import java.sql.*;

public class Toest{
	public static void main(String[] args) {
		try{
			String dbUrl = "jdbc:mysql://localhost:3306/student";
			String userName = "sendra";
			String password = "sendra93";
			// get the connection of the database
			Connection con = DriverManager.getConnection(dbUrl, userName, password);
			// create the statement of the object
			Statement state = con.createStatement();
			// execute the Query
			ResultSet result = state.executeQuery("select * from teacher where id = 2");
			
			// process the result set
			while(result.next()){  
					System.out.println("Teacher full name: "+"  "+result.getString(4)+"  "+result.getString(5) + " Degree: " + result.getString(3) + " Position: " + result.getString(2));    
			}
			con.close();
			}catch(Exception e){ 
				System.out.println(e.getMessage());
			}  
	}  
}