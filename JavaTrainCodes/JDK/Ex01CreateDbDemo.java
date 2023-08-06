package Ex01.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex01CreateDbDemo {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=
				DriverManager.getConnection("jdbc:mysql://localhost:3306","root","1234");
       Statement stmt=con.createStatement();
       String query="Create Schema compan";
       int res=stmt.executeUpdate(query);
       if(res==1) {
    	   System.out.println("created");
       }else {
    	   System.out.println(" nt created");
       }
       stmt.close();
       con.close();
	}

}