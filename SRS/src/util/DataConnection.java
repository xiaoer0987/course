package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataConnection {
	public Connection connection = null;
	public DataConnection(){
		try{
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/srs.db");
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	/*private static final String SqliteDBDRIVER = "org.sqlite.JDBC";
	private static final String MysqlDBDRIVER = "com.mysql.jdbc.Driver";
	private static final String SqliteDBURL = "jdbc:sqlite:C:/sqlite/srs.db";
	private static final String MysqlDBURL = "jdbc:mysql://localhost:3306/test?characterEncoding=UTF-8";
	private static final String DBUSER = "root";
	private static final String DBPASSWORD = "123456";
	
	
	private static Connection conn;
	public static  Connection getConnection( String type) throws Exception {

	if (type.equals("sqlite")) {
		
			Class.forName(SqliteDBDRIVER);
			conn = DriverManager.getConnection(SqliteDBURL);	
	}else if (type.equals("mysql")){
	
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection(MysqlDBURL, DBUSER, DBPASSWORD);	
	}
	return conn;
}
*/
	
	
	
	/*public void close() throws Exception {
		if (this.conn != null) {
			try {
				this.conn.close();
			} catch (Exception e) {
				throw e;
			}
		}
	}*/
}
