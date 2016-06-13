package IDao;

import model.Guitar;
import model.GuitarSpec;

public interface GuitarIDao {
	public boolean addGuitar(Guitar guitar,GuitarSpec spec) throws Exception;
	public boolean updateGuitar(Guitar guitar) throws Exception;
	public boolean deleteGuitar(String serialNumber) throws Exception;
}
