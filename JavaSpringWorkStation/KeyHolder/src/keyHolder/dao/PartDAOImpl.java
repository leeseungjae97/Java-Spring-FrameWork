package keyHolder.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import keyHolder.exception.PartException;
import keyHolder.exception.PartInputException;
import keyHolder.pstmt.PartInsertCreator;
import keyHolder.vo.PartVO;

@Repository("memberDAO")
public class PartDAOImpl implements PartDAO {
	@Autowired
	private JdbcTemplate jTemp;
	//객체생성과정에서 개발자가 끼어들 수 없기때문에 @Autowired로 받아준다.

	@Override
	public boolean insert(PartVO part) throws PartException {
		boolean result = false;
		KeyHolder holder = new GeneratedKeyHolder();
		
		int effectedRow = jTemp.update(new PartInsertCreator(part, new String[] { "partId" }), holder);
		//update안에 있는 KeyHolder에 column의 내용이 들어간다.
		
		if(effectedRow == 0) {
			throw new PartInputException();
		}
		//정상적으로 입력이 되었다면
		//입력된 part의 정보를 Map holder에서 key정보로 key를 받아와서 넣어준다.
		if(effectedRow > 0) {
			Number key = holder.getKey();
			part.setPartId(key.intValue());
			result = true;
		}
		return result;
	}

	@Override
	public void update(PartVO part) throws PartException {
		 

	}

	@Override
	public void delete(int partId) throws PartException {
		 

	}

	@Override
	public PartVO selectById(int partId) throws PartException {
		String sql ="SELECT * FROM parts WHERE partId='?'";
		jTemp.update(sql, partId);
		return null;
	}

	@Override
	public PartVO selectByName(String partName) throws PartException {
		 
		return null;
	}

}
