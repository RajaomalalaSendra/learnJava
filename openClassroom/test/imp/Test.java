package openClassroom.test.imp;

import java.sql.*;

public class Test{
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
			ResultSet result = state.executeQuery("select * from students");
			
			// process the result set
			while(result.next()){  
					System.out.println("Student full name: "+"  "+result.getString(2)+"  "+result.getString(3));    
			}
			ResultSet resultTwo = state.executeQuery("select * from time");
			// process the result set
			while(resultTwo.next()){  
					System.out.println("Time: "+"  "+resultTwo.getString(2));    
			}
			con.close();
			}catch(Exception e){ 
				System.out.println(e.getMessage());
			}  
	}  
}