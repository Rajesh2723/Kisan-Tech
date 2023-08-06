package ex02ddm;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dbutils.DButils;

public class CallableStmt {

	public static void main(String[] args) {
		  final String URL="jdbc:mysql://localhost:3306/training";
		try(Connection c=DriverManager.getConnection( URL, DButils.USER,
				 DButils.PWD);
				CallableStatement callStmt=c.prepareCall("{call getStudentsNames(?,?)}");
				){
			callStmt.setString(1, "java");	
			callStmt.setDouble(2, 10000);
			callStmt.execute();
			boolean hasRecords=callStmt.execute();
			List<String>names=new ArrayList<String>();
			if(hasRecords) {
				ResultSet rSet=callStmt.getResultSet();
				while(rSet.next()) {
					names.add(rSet.getString("student_name"));
				}
			}else {
				System.out.println("\n Data not Present");
			}
			System.out.println(names);
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
	}

}
