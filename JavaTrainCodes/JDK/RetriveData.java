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

import Dbutils.DButils;

public class RetriveData {

	public static void main(String[] args) {
		 String fetchQuery="SELECT * FROM employee WHERE _id = ?";
		 try(Connection c=DriverManager.getConnection(DButils.URL, DButils.USER,
				 DButils.PWD);
				 PreparedStatement pStmt=c.prepareStatement(fetchQuery)){
			 int idToFetch=1;
			 pStmt.setInt(1,idToFetch);
			 ResultSet rSet=pStmt.executeQuery();
			 System.out.println(rSet);
			 if(rSet.next()) {
				 int id=rSet.getInt("_id");
				 String name=rSet.getString("name");
				 double salary=rSet.getDouble("salary");
				 Date dateOfJoining=rSet.getDate("doj");
				 System.out.println(id+","+name+","+salary+","+dateOfJoining);
				 String bio=rSet.getString("bio");
				 Blob pic=rSet.getBlob("picture");
				 String outputFilePath="Files/fetchedData.txt";
				 FileWriter fwriter=new FileWriter(outputFilePath);
				 fwriter.write(bio);
				 if(fwriter!=null)fwriter.close();
				 String outputImageFile="Files/fetchedImage.jpg";
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
