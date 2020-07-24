package keyHolder.pstmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementCreator;

import keyHolder.vo.PartVO;

public class PartInsertCreator implements PreparedStatementCreator {
	private PartVO part ;
	private String[] column;
	public PartInsertCreator(PartVO part, String[] column) {
		this.part = part;
		this.column = column;
	}
	@Override
	public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
		String sql= "INSERT INTO parts(partName) VALUES(?)";
		PreparedStatement pstmt = con.prepareStatement(sql, column);
		pstmt.setString(1, part.getPartName());
		return pstmt;
	}
}
