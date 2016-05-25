package util;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;


public class DBHelper implements Serializable {
	
	public Connection connection = null;
	
	public DBHelper(){
		try{
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/aehyok.db");
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	}
	




