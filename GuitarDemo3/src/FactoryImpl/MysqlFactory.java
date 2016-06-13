package FactoryImpl;

import DaoImpl.MysqlGuitarDaoImpl;
import DaoImpl.MysqlInventoryDaoImpl;
import IDao.GuitarIDao;
import IDao.InventoryIDao;
import IFactory.IDaoFactory;

public class MysqlFactory  implements IDaoFactory {
	
	@Override
	public GuitarIDao GetGuitarInstance() throws Exception {
		// TODO Auto-generated method stub
		return new MysqlGuitarDaoImpl();
	}
	@Override
	public InventoryIDao GetInventoryInstance() throws Exception {
		// TODO Auto-generated method stub
		return new MysqlInventoryDaoImpl();
	}

}