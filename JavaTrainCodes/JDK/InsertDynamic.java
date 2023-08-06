package Ex02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import Dbutils.DButils;

public class InsertDynamic {

	public static void main(String[] args) {
		 final String insertQuery=	
				 "INSERT INTO employee"
				 +"(name, salary, doj, is_on_leave,"
				 + " bio, picture) "
				 + "VALUES (?,?,?,?,?,?)";
		 try(Connection c=DriverManager.getConnection(DButils.URL, DButils.USER,
				 DButils.PWD);
				PreparedStatement pStmt=c.prepareStatement(insertQuery)
				){
			 String name="Yash";
			 double salary=30000;
			 LocalDate dateofJoining=LocalDate.of(2022, 1, 10);
			 boolean isOnLeave=true;
			 
		///////////	 Read the content of the file
			 FileReader fReader=new FileReader("Files/bio.txt");
		BufferedReader reader=new  BufferedReader(fReader);
		StringBuilder sb=new StringBuilder();
		String line="";
		
		while((line=reader.readLine())!=null) {
			sb.append(line).append("\n");
		}
		//// Read the content of the image
		File imageFile =new File("Files/emp1.jpg");
		byte[] imageData=new byte[(int)imageFile.length()];
		FileInputStream fstream=new  FileInputStream(imageFile);
		fstream.read(imageData);	
		if(fstream!=null) {
			fstream.close();
		}
		///Binding the data
		pStmt.setString(1,name);
		pStmt.setDouble(2,salary);
		
		//covert the java.time.LocalDate into java.sql.date
		
		
		pStmt.setDate(3,Date.valueOf(dateofJoining));
		pStmt.setBoolean(4, isOnLeave);
		
		//convert StringBuider into String
		pStmt.setString(5, sb.toString());
		pStmt.setBytes(6, imageData);
		int res=pStmt.executeUpdate();	
	       if(res==1) {
	    	   System.out.println("Inserted");
	       }else {
	    	   System.out.println(" not Inserted");
	       }
		
		
		 }catch(SQLException s) {
			 s.printStackTrace();
		 } catch (FileNotFoundException e) {
			 
			e.printStackTrace();
		} catch (IOException e) {
			 
			e.printStackTrace();
		}
		 
	}

}
