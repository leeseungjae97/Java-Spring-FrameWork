package keyHolder.dao;

import keyHolder.exception.PartException;
import keyHolder.vo.PartVO;

public interface PartDAO {
	boolean insert(PartVO part) throws PartException;
	void update(PartVO part)throws PartException;
	void delete(int partId)throws PartException;
	PartVO selectById(int partId)throws PartException;
	PartVO selectByName(String partName)throws PartException;
}
