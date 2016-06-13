package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataConnection {
	
	private static final String SqliteDBDRIVER = "org.sqlite.JDBC";
	private static final String MysqlDBDRIVER = "com.mysql.jdbc.Driver";
	private static final String SqliteDBURL = "jdbc:sqlite:C:/sqlite/guitar.db";
	private static final String MysqlDBURL = "jdbc:mysql://localhost:3306/test?characterEncoding=UTF-8";
	private static final String DBUSER = "root";
	private static final String DBPASSWORD = "123456";
	
	
	private static Connection connection;
	public static  Connection getConnection( String type) throws Exception {

	if (type.equals("sqlite")) {
		
			Class.forName(SqliteDBDRIVER);
			connection = DriverManager.getConnection(SqliteDBURL);	
	}else if (type.equals("mysql")){
	
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection(MysqlDBURL, DBUSER, DBPASSWORD);	
	}
	return connection;
}

	
	
	
	public void close() throws Exception {
		if (this.connection != null) {
			try {
				this.connection.close();
			} catch (Exception e) {
				throw e;
			}
		}
	}
}