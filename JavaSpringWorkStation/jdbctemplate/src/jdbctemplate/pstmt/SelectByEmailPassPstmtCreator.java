package jdbctemplate.pstmt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementCreator;

public class SelectByEmailPassPstmtCreator implements PreparedStatementCreator{
	private String email;
	private String pass;
	public SelectByEmailPassPstmtCreator(String email, String pass) {
		this.email = email;
		this.pass = pass;
	}
	@Override
	public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
		PreparedStatement pstmt = con.prepareStatement("SELECT * FROM members WHERE email=? AND pass=?");
		pstmt.setString(1, email);
		pstmt.setString(2, pass);
		return pstmt;
	}
}
