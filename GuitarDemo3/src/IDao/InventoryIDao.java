
package IDao;

import java.util.List;

import model.Guitar;

public interface InventoryIDao {
	public List<Guitar> loaddata() throws Exception;
}