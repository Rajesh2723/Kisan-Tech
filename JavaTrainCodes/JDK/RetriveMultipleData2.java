package ex02ddm;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import Dbutils.DButils;

public class RetriveMultipleData2 {

	public static void main(String[] args) {
		 String fetchQuery="SELECT * FROM employee  ";
		 try(Connection c=DriverManager.getConnection(DButils.URL, DButils.USER,
				 DButils.PWD);
				Statement pStmt=c.createStatement( );){
			
			 ResultSet rSet=pStmt.executeQuery(fetchQuery);
			 
			 if(rSet.next()) {
				 int id=rSet.getInt("_id");
				 String name=rSet.getString("name");
				 double salary=rSet.getDouble("salary");
				 Date dateOfJoining=rSet.getDate("doj");
				 System.out.println(id+","+name+","+salary+","+dateOfJoining);
				 String bio=rSet.getString("bio");
				 Blob pic=rSet.getBlob("picture");
				 String outputFilePath="Files/ "+id+"_bio.txt";
				 FileWriter fwriter=new FileWriter(outputFilePath);
				 fwriter.write(bio);
				 if(fwriter!=null)fwriter.close();
				 String outputImageFile="Files/"+id+"_pic.jpg";
				 InputStream iStream=pic.getBinaryStream();
				 FileOutputStream f=new FileOutputStream(outputImageFile);
				 byte[] buffer=new byte[1024];
				 int bytesRead;
				 while((bytesRead=iStream.read(buffer))!=-1) {
					 f.write(buffer,0,bytesRead);
				 }
				 
			 }
		 }catch(Exception e) {
			 
		 }

	}

}
