package com.mavrk.brainwaves.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

/*
* @author Sanatt Abrol
*/
public class ConnectionHelper
{
	private String url;
	private String username;
	private String password;
	private static ConnectionHelper instance;
        //private static final String FILENAME = "resources/brainwaves_api";
	private ConnectionHelper()
	{
    	String driver = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//url = "jdbc:mysql://localhost/directory?user=root";
            //ResourceBundle bundle = ResourceBundle.getBundle(FILENAME);
            //driver = bundle.getString("jdbc.driver");
            String dbhost = "localhost";
            String dbport = "3306";
            String dbname = "bwaves";
            username = "root";
            password = "root";
            //Class.forName(driver);
			url = "jdbc:mysql://"+dbhost+":"+dbport+"/"+dbname;
			System.out.println(dbhost);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {
		if (instance == null) {
			instance = new ConnectionHelper();
		}
		try {
			return DriverManager.getConnection(instance.url, instance.username, instance.password);
		} catch (SQLException e) {
			throw e;
		}
	}
	
	public static void close(Connection connection)
	{
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
