package ex02ddm;

import java.sql.Connection;
import java.sql.DriverManager;

import Dbutils.DButils;

public class DataBaseMetaData {
		public static void main(String[] args) {
			try(Connection c=DriverManager.getConnection(DButils.URL, DButils.USER,
					 DButils.PWD);
		}
}
