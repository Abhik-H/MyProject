package org.mesonmsit.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection getConnection(){
		
		Connection connection = null;
		Constants.DBLINK = "jdbc:mysql://cyclotrondb.mesonmsit.org/cyclotron_prod";
	    Constants.DBUSER = "cyclotronapp"; 
	    Constants.DBPASS = "0DVpCLwS%r0EepZX"; 
	    Constants.LOG_LEVEL = "INFO";
	    Constants.LAMBDA_ALIAS = "DEV";
	    
	    try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(Constants.DBLINK, Constants.DBUSER, Constants.DBPASS);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return connection;
	}
	
	public static void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
