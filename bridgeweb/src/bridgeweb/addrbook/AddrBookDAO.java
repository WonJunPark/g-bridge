package bridgeweb.addrbook;

import java.util.List;

public interface AddrBookDAO {
	boolean insertDB(AddrBook addrbook);
	boolean deleteDB(int ab_id);
	boolean updateDB(AddrBook addrbook);
	List<AddrBook> getDBList();
	AddrBook getDB(int ab_id);	
}