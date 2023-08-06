package ex02ddm;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.*;

import Dbutils.DButils;

public class Ex03UpdateData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String updateQuery="UPDATE employee "
				+ "SET salary = ?, is_on_leave = ?,"
				+ " bio =? WHERE _id = ?";
		try(Connection c=DriverManager.getConnection(DButils.URL,DButils.USER,DButils.PWD);
				PreparedStatement pstmt=c.prepareStatement(updateQuery);
				FileReader freader=new FileReader("files/bio_new.txt");
				BufferedReader reader=new BufferedReader(freader)
				)
		{
			
			double newsal=40000;
			boolean newLeaveStatus=false;
			

			StringBuffer newBio=new StringBuffer("");
			String line="";
			
		while((line=reader.readLine())!=null) {
			newBio.append(line).append("\n");
			
		}
		int idToChange=1;
		
		pstmt.setDouble(1, newsal);
		pstmt.setBoolean(2,newLeaveStatus);
		pstmt.setString(3,newBio.toString());
		pstmt.setInt(4, idToChange);
		
		int res=pstmt.executeUpdate();
	       if(res==1) {
	    	   System.out.println("updated");
	       }else {
	    	   System.out.println(" not updated");
	       }
		
		
			
		}catch (SQLException s) {
			s.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
