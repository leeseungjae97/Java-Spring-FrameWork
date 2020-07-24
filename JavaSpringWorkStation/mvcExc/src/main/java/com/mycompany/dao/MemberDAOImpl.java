package com.mycompany.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mycompany.exception.MemberException;
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
}
