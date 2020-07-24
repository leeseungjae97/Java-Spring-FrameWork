package keyHolder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import keyHolder.dao.PartDAO;
import keyHolder.exception.PartException;
import keyHolder.vo.PartVO;

@Service("partInsert")
public class PartInsertImpl implements PartInsert {

	@Autowired
	private PartDAO dao;
	@Override
	public void execute(String partName) throws PartException {
		PartVO part = new PartVO();
		part.setPartName(partName);
		
		dao.insert(part);
		System.out.println(part);
	}

}
