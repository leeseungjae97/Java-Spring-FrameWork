package com.mycompany.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mycompany.exception.MemberException;
import com.mycompany.exception.MemberInsertFailedException;
import com.mycompany.vo.MemberVO;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	private JdbcTemplate jTemp;
	
	
	@Override
	public void insert(MemberVO member) throws MemberException {
		String sql = "INSERT INTO members VALUES(?, ?, ?, default, default);";
		int result=0;
		try {
			result = jTemp.update(sql, member.getEmail(), member.getPass(), member.getNick());
			if(result == 0) {
				throw new MemberInsertFailedException();
			}
		}
		catch (Exception e) {
			throw new MemberInsertFailedException();
		}
	}


	@Override
	public MemberVO login(String email, String pass) throws MemberException {
		String sql = "SELECT * FROM members WHERE email='"+email+"' AND pass='"+pass+"';";
		List<MemberVO> members = jTemp.query(sql, new RowMapper<MemberVO>() {

			@Override
			public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new MemberVO(rs.getString("email"),
						rs.getString("pass"),
						rs.getString("nick"),
						rs.getTimestamp("registeredAt"),
						rs.getTimestamp("removeAt"));
			}
		
		});
		return (members.size() == 0 ? null : members.get(0));
	}
}
