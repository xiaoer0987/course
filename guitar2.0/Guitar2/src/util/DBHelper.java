package util;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBHelper {
	private static final long serialVersionUID = 1L;
	public Connection connection = null;
	public DBHelper() {
		// TODO Auto-generated constructor stub
		try{
			Class.forName("org.sqlite.JDBC");
			connection = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/aehyok.db");
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	}


