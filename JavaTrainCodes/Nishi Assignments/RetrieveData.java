package ex02ddm;

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
			 }
		 }catch(Exception e) {
			 
		 }

	}

}
