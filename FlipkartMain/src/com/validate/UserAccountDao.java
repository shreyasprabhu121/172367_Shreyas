package com.validate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.pojo.*;
import com.validate.*;

public class UserAccountDao {

public int insert(UserAccount ua) throws SQLException {
 String query = "insert into flipkart values(?,?,?,?)";
    Connection conn = Connection_Factory.getConnection();
 PreparedStatement pStatement = conn.prepareStatement(query);
 pStatement.setString(1, ua.getEmail());
 pStatement.setString(2, ua.getPassword());
 pStatement.setString(3, ua.getName());
 pStatement.setString(4, ua.getPhone());
 int output = pStatement.executeUpdate();
 return output;
 }

public int read(String userName,String password) throws SQLException {
	int i=0;
 String query="select COUNT(*) from flipkart where EMAIL= ? and PASSWORD=?";
 Connection conn = Connection_Factory.getConnection();
 System.out.println(Connection_Factory.getInstance().hashCode());
 PreparedStatement pStatement= conn.prepareStatement(query);
 pStatement.setString(1, userName);
 pStatement.setString(2, password);
 ResultSet count=pStatement.executeQuery();
 while(count.next()) {
	i=count.getInt(1);
 }
 return i;
}
public String fetchName(String userEmail) throws SQLException {
	String name=null;
 String query="select NAME from flipkart where EMAIL= ?";
 Connection conn = Connection_Factory.getConnection();
 System.out.println(Connection_Factory.getInstance().hashCode());
 PreparedStatement pStatement= conn.prepareStatement(query);
 pStatement.setString(1, userEmail);
 ResultSet count=pStatement.executeQuery();
 while(count.next()) {
	name=count.getString(1);
 }
 return name;
}
}