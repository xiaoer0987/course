package IFactory;

import IDao.GuitarIDao;
import IDao.InventoryIDao;

public interface IDaoFactory {
public  GuitarIDao GetGuitarInstance() throws Exception;
public  InventoryIDao GetInventoryInstance() throws Exception;
}
