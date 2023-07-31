package dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","123@45");
		Statement stmt=con.createStatement();
		String query="INSERT INTO employee(name, salary, doj, is_on_leave) \r\n"
				+ "VALUES (\"manish\",30000,\"2023-02-12\",true)";
		int result=stmt.executeUpdate(query);
		if(result==1) {
			System.out.println("data inserted  created");
		}
		else {
			System.out.println("cant create");
		}
		stmt.close();
		con.close();
	}

}
