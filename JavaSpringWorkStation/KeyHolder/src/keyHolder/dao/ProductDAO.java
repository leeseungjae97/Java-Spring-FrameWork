package keyHolder.dao;

import keyHolder.exception.ProductException;
import keyHolder.vo.ProductVO;

public interface ProductDAO {
	void insert(ProductVO product)throws ProductException;
}
