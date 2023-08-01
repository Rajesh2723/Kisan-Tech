package Ex01.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex02CreateTableDemo {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
		
		Connection con=
				DriverManager.getConnection("jdbc:mysql://localhost:3306/compan","root","1234");
       Statement stmt=con.createStatement();
       String query="CREATE TABLE employee (\r\n"
       		+ "  _id INT NOT NULL AUTO_INCREMENT,\r\n"
       		+ "  name VARCHAR(30) NOT NULL,\r\n"
       		+ "  salary DOUBLE NOT NULL,\r\n"
       		+ "  doj DATE NOT NULL,\r\n"
       		+ "  is_on_leave BIT(1) NOT NULL,\r\n"
       		+ "  bio LONGTEXT,\r\n"
       		+ "  picture BLOB,\r\n"
       		+ "  PRIMARY KEY (_id))";
       int res=stmt.executeUpdate(query);
       if(res==0) {
    	   System.out.println("created");
       }else {
    	   System.out.println(" nt created");
       }
       stmt.close();
       con.close()
;	}

}
