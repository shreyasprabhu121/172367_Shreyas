package com.pojo;
	
	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class Connection_Factory {
	private static final Connection_Factory ONE= new Connection_Factory();

	private static Connection conn;

	Connection_Factory()
	{
	 try {
	  Class.forName("oracle.jdbc.driver.OracleDriver");
	  conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "orcl11g");
	 } catch (ClassNotFoundException |SQLException e)
	 
	 {
	  e.printStackTrace();
	 }
	}
	public static Connection_Factory getInstance()
	{
	 return ONE;
	}
	 public static Connection getConnection()
	 {
	 return conn;
	    }

}
