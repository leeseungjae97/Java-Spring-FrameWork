package keyHolder.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import keyHolder.dao.PartDAO;
import keyHolder.dao.ProductDAO;
import keyHolder.vo.PartVO;
import keyHolder.vo.ProductVO;

@Service("partProductInsert")
public class PartProductInsertImpl implements PartProductInsert {
	@Autowired
	private PartDAO partDAO;
	
	@Autowired
	private ProductDAO productDAO;
	
	@Transactional
	@Override
	public void execute(String partName, String productName, int productPrice) throws Exception {
		PartVO part = new PartVO();
		part.setPartName(partName);
		
		partDAO.insert(part);
		
		ProductVO product = new ProductVO();
		product.setProductName(productName);
		product.setProductPrice(productPrice);
		product.setPartId(3000);
		
		productDAO.insert(product);
		
		System.out.println(part);
		System.out.println(product);
	}
}
