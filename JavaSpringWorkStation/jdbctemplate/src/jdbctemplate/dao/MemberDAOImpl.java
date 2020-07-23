package jdbctemplate.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Repository;

import jdbctemplate.mapper.MemberVOMapper;
import jdbctemplate.vo.MemberVO;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	private JdbcTemplate temp;
	
	@Override
	public void insert(MemberVO member) throws Exception {
		//String sql ="INSERT INTO members (email, pass, nick)VALUES('"
		//		+member.getEmail()+"', '"+member.getPass()+"','"+member.getNick()+"')";
		
		//String sql = "INSERT INTO memebrs ('%s', '%s', '%s', default, default)";
		//sql = String.format(sql, member.getEmail(), member.getPass(), member.getNick());
		
		String sql= "INSERT INTO members VALUES(?, ?, ?, default, default)";
		temp.update(sql, member.getEmail(), member.getPass(), member.getNick());
		
	}

	@Override
	public void update(MemberVO member) throws Exception {

	}

	@Override
	public void delete(String email) throws Exception {
		 

	}

	@Override
	public MemberVO selectByEmail(String email) throws Exception {
		List<MemberVO> members = null;
		String sql ="SELECT * FROM members WHERE email='"+email+"'";
		//members = temp.query(sql, new MemberVOMapper());
		members = temp.query(sql, new BeanPropertyRowMapper<MemberVO>(MemberVO.class));
		//만약 DB와 VO의 멤버명이 같다면 BeanPropertyRowMapper를 이용 이름이 같은 멤버들을 인식하여 받아와준다
		return (members.size() == 0 ? null : members.get(0));
	}

	@Override
	public MemberVO selectByEmailPass(String email, String pass) throws Exception {
		List<MemberVO> members = null;
		members = temp.query(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pstmt = con.prepareStatement("SELECT * FROM members WHERE email=? AND pass=?");
				pstmt.setString(1, email);
				pstmt.setString(2, pass);
				return pstmt;
			}
		}, 
		new MemberVOMapper());
		return (members.size() == 0 ? null : members.get(0));
	}

	@Override
	public List<MemberVO> selectList(String column, String str) throws Exception {
		 
		return null;
	}

}
