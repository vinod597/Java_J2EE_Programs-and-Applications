package com.dhatri.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import sun.security.jca.GetInstance;

public class MyConnection {
	private static MyConnection myConnection= new MyConnection();
	public Connection connection;

private MyConnection(){
	try {
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/dhatri","root","root");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) { 
		e.printStackTrace();
	}
}public static MyConnection GetInstance(){
	return myConnection;
	
}
}
