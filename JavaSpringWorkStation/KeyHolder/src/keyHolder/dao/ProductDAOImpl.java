package keyHolder.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import keyHolder.exception.ProductException;
import keyHolder.vo.ProductVO;

@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO {
	
	@Autowired
	private JdbcTemplate jTemp;
	
	@Override
	public void insert(ProductVO product) throws ProductException {
		KeyHolder holder = new GeneratedKeyHolder();
		String[] column = {"productId"};
		int result = jTemp.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				String sql ="INSERT INTO products VALUES(default, ?, ?, ?)";
				PreparedStatement pstmt = con.prepareStatement(sql, column);
				pstmt.setString(1, product.getProductName());
				pstmt.setInt(2,  product.getProductPrice());
				pstmt.setInt(3,  product.getPartId());
				
				return pstmt;
			}
		}, holder);
		if(result == 0 ) {
			System.out.println("제품 등록에 실패하였습니다.");
		}
		if(result > 0) {
			Number key = holder.getKey();
			int id = key.intValue();
			product.setProductId(id);
		}
	}
}
