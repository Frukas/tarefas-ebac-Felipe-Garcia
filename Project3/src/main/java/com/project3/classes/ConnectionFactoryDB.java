package com.project3.classes;

import java.sql.Connection;
import java.sql.DriverManager;

import com.project3.interfaces.IConnectionFactory;

public class ConnectionFactoryDB implements IConnectionFactory{
	
	private Connection conn;

	public Connection getDBConnection() throws Exception {
		String url = "jdbc:postgresql://localhost:5432/ProjetosEBAC?user=postgres&password=123";
		conn = DriverManager.getConnection(url);
		return conn;
	}

	public void closeConnection() throws Exception {
		conn.close();		
	}

}
