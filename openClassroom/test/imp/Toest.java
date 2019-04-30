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
			String sql = "INSERT INTO teacher " + "VALUES(11, 'Teacher Histo-Geographie', 'PHD in Histo-Geographie', 'Dr. Ranjazafinirina I', 'Mahefanarivonante')";
			String sqlTwo = "INSERT INTO teacher " + "VALUES(10, 'Teacher Histo-Geographie', 'PHD in Histo-Geographie', 'Dr. Ranjazafinirina II', 'Mahefanarivo Nine')";
			state.executeUpdate(sql);
			state.executeUpdate(sqlTwo);
			ResultSet result = state.executeQuery("SELECT * FROM teacher WHERE id % 2 = 0");
			
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