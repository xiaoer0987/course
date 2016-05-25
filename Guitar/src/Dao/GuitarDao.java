package Dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.sqlite.JDBC;

import entity.Guitar;
import util.DBHelper;

public class GuitarDao {
	
	public static List<Guitar> getAllGuitar(String serialNumber,double price,String builder,String type,String model,String backWood,String topWood){
		
		DBHelper jdbc = new DBHelper();
		Connection connection = jdbc.connection;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		List<Guitar> list = new ArrayList<Guitar>();
		try{
			stmt = connection.prepareStatement("select * from Guitar where serialNmumber=? and price = ? and model = ? and builder=? and backwood=? and topwood=? and type=?");
			
			rs = stmt.executeQuery();
			while(rs.next()){
				Guitar guitar = new Guitar();
				
				guitar.setSerialNumber(rs.getString("serialNumber"));
				guitar.setPrice(rs.getDouble("price"));
				guitar.setBuilder(rs.getString("builder"));
				guitar.setType(rs.getString("type"));
				guitar.setModel(rs.getString("model"));
				guitar.setBackWood(rs.getString("backWood"));
				guitar.setTopWood(rs.getString("topWood"));
				list.add(guitar);
			}
			return list;
		}catch(Exception ex){
			ex.printStackTrace();
			return null;
		}finally{
			if(rs!=null){
				try{
					rs.close();
					rs=null;
				}
				catch(Exception ex){
					ex.printStackTrace();
				}
			}
			if(stmt!=null){
				try{
					stmt.close();
					rs=null;
				}
				catch(Exception ex){
					ex.printStackTrace();
				}
			}
		}
		
		
	}

	public GuitarDao() {
		// TODO Auto-generated constructor stub
	}

}
