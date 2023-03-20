package com.project3.interfaces;

import java.sql.Connection;

public interface IConnectionFactory {

	public Connection getDBConnection() throws Exception;
	public void closeConnection() throws Exception;
}
