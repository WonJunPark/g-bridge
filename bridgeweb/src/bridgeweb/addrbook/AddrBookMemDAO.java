package bridgeweb.addrbook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddrBookMemDAO implements AddrBookDAO {
	private int seq;
	Map<Integer,AddrBook> addrBookStorage;
	
	public AddrBookMemDAO() {
		seq=0;
		addrBookStorage = new HashMap<>();
	}
	
	@Override
	public boolean insertDB(AddrBook addrbook) {
		seq++;
		addrbook.setAb_id(seq);
		addrBookStorage.put(seq, addrbook);
		System.out.println(addrbook.getAb_name()+","+addrbook.getAb_email());
		return true;
	}

	@Override
	public boolean deleteDB(int ab_id) {
		addrBookStorage.remove(ab_id);
		return true;
	}

	@Override
	public boolean updateDB(AddrBook addrbook) {
		addrBookStorage.put(addrbook.getAb_id(), addrbook);
		return true;
	}

	@Override
	public List<AddrBook> getDBList() {
		return new ArrayList<>(addrBookStorage.values());
	}

	@Override
	public AddrBook getDB(int ab_id) {
		return addrBookStorage.get(ab_id);
	}

}
