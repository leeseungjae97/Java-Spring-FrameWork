package keyHolder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import keyHolder.dao.ProductDAO;
import keyHolder.exception.ProductException;
import keyHolder.vo.ProductVO;

@Service("productInsert")
public class ProductInsertImpl implements ProductInsert {

	@Autowired
	private ProductDAO dao;
	
	@Override
	public void execute(String name, int price, int partId) throws ProductException {
		ProductVO product = new ProductVO();
		product.setProductName(name);
		product.setProductPrice(price);
		product.setPartId(partId);
		dao.insert(product);
		System.out.println(product);
	}

}
