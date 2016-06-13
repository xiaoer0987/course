package FactoryImpl;

import DaoImpl.SqliteGuitarDaoImpl;
import DaoImpl.SqliteInventoryDaoImpl;
import IDao.GuitarIDao;
import IDao.InventoryIDao;
import IFactory.IDaoFactory;

public class SqliteFactory implements IDaoFactory {

	@Override
	public GuitarIDao GetGuitarInstance() throws Exception {
		// TODO Auto-generated method stub
		return new SqliteGuitarDaoImpl();
	}

	@Override
	public InventoryIDao GetInventoryInstance() throws Exception {
		// TODO Auto-generated method stub
		return new SqliteInventoryDaoImpl();
	}

}