package ex02ddm;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Dbutils.DButils;

public class CallableStmt {

	public static void main(String[] args) {
		 //statement
		//precallstatement
		//callable statement
		try(Connection c=DriverManager.getConnection(DButils.URL, DButils.USER,
				 DButils.PWD);
				CallableStatement callStmt=c.prepareCall("{call getStudentsNames(?,?)}");
				){
			callStmt.setString(1, "java");
			callStmt.setDouble(2, 10000);
			callStmt.execute();
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
	}

}
