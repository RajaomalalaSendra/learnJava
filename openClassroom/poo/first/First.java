package openClassroom.poo.first;

import java.sql.*;

public class First{
	public static void main(String[] args) {
		try{
			String dbUrl = "jdbc:mysql://localhost:3306/first";
			String userName = "sendra";
			String password = "sendra93";
			// get the connection of the database
			Connection con = DriverManager.getConnection(dbUrl, userName, password);
			// create the statement of the object
			Statement state = con.createStatement();
			// execute the Query
			ResultSet result = state.executeQuery("SELECT * FROM one WHERE one_id % 2 = 0");
			
			// process the result set
			while(result.next()){  
					System.out.println("Teacher full name: "+"  "+result.getString(2)+"  "+result.getString(3) + " Birth: " + result.getString(4));    
			}
			con.close();
			}catch(Exception e){ 
				System.out.println(e.getMessage());
			}  
	}  
}