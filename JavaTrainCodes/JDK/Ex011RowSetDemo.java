package ex02ddm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

import Dbutils.DButils;

public class Ex011RowSetDemo {

	public static void main(String[] args) {
		String fetchQuery="SELECT _id,name,salary FROM employee";
		 try(Connection c=DriverManager.getConnection(DButils.URL, DButils.USER,
				 DButils.PWD);
				Statement stmt=c.createStatement( );){
	CachedRowSet cachedRowSet=RowSetProvider.newFactory().createCachedRowSet();
	cachedRowSet.setUrl(DButils.URL);
	cachedRowSet.setUsername(DButils.USER);
	cachedRowSet.setPassword(DButils.PWD);
	cachedRowSet.setCommand(fetchQuery);
	cachedRowSet.execute();
	while(cachedRowSet.next()) {
		int id=cachedRowSet.getInt("_id");
		String name=cachedRowSet.getString("name");
		double salary=cachedRowSet.getDouble("salary");
		System.out.println(id+","+name+","+salary);
	}
	}catch(Exception e) {
		e.printStackTrace();
	}

}
}
