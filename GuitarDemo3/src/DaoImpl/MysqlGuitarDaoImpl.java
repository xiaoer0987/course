package DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import IDao.GuitarIDao;
import allenum.Builder;
import model.Guitar;
import model.GuitarSpec;
import util.DataConnection;

public class MysqlGuitarDaoImpl implements GuitarIDao {

	@Override
	public boolean addGuitar(Guitar guitar,GuitarSpec spec) throws Exception {
		// TODO Auto-generated method stub
		boolean a=false;
		String sql = "(serialNumber,backWood,topWood,price,builder,model,type,numStrings) value(?,?,?,?,?,?,?,?) ";
		Connection conn=DataConnection.getConnection("mysql");
		
		
		System.out.println(conn);
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setString(1, guitar.getSerialNumber());
	
		ptmt.setString(2,String.valueOf(spec.getBackWood()));
		ptmt.setString(3, String.valueOf(spec.getTopWood()));
		ptmt.setDouble(4, guitar.getPrice());
		ptmt.setString(5,String.valueOf(spec.getBuilder()));
		ptmt.setString(6, spec.getModel());
		ptmt.setString(7, String.valueOf(spec.getType()));
		ptmt.setString(8, spec.getNumStrings());
		if (ptmt.executeUpdate()>0) {
		a=true;	
		}
		ptmt.close();
		return a;	
	}

	@Override
	public boolean updateGuitar(Guitar guitar) throws Exception {
		// TODO Auto-generated method stub
		boolean a=false;
		String sql = "update guitar set price=? and serialNumber=? ";
		Connection conn=DataConnection.getConnection("mysql");
		PreparedStatement ptmt = conn.prepareStatement(sql);
		ptmt.setDouble(1, guitar.getPrice());
		ptmt.setString(2, guitar.getSerialNumber());
		ptmt.setInt(3, guitar.getId());
		if (ptmt.executeUpdate()>0) {
		a=true;	
		}
		ptmt.close();
		return a;	
	}

	@Override
	public boolean deleteGuitar(String serialNumber ) throws Exception {
		// TODO Auto-generated method stub
				boolean a=false;
				String sql = "delete from guitar where serialNumber=? ";
				Connection conn=DataConnection.getConnection("mysql");
				PreparedStatement ptmt = conn.prepareStatement(sql);
				ptmt.setString(1,serialNumber );
				if (ptmt.executeUpdate()>0) {
				a=true;	
				}
				ptmt.close();
				return a;	
	}

}
