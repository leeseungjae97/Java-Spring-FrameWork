package jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import jdbc.vo.MembersVO;

@Repository("MembersDAO")
public class MembersDAOImpl implements MembersDAO {
	@Autowired
	private JdbcTemplate temp;
	
	
	@Override
	public void insert(MembersVO member) {
		String sql = "INSERT INTO members VALUES(default, '"+member.getEmail()+"', PASSWORD("+member.getPass()+"))";
		if(temp.update(sql) > 0) {
			System.out.println("등록성공");
		}
		else {
			System.out.println("등록실패");
		}
	}

	@Override
	public void update(MembersVO member) {

	}

	@Override
	public void delete(String email) {

	}

	@Override
	public MembersVO selectById(int id) {
		String sql = "SELECT * FROM members WHERE id='"+id+"'";
		List<MembersVO> members = temp.query(sql, new RowMapper<MembersVO>() {

			@Override
			public MembersVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				int id = rs.getInt("id");
				String email = rs.getString("email");
				String pass = rs.getString("pass");
				
				MembersVO member = new MembersVO(id, email, pass);
				return member;
			}
		});
		return null;
	}

	@Override
	public List<MembersVO> selectAll() {
		String sql = "SELECT * FROM members ORDER BY email";
		List<MembersVO> members = temp.query(sql, new RowMapper<MembersVO>(){
			@Override
			public MembersVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				int id = rs.getInt("id");
				String email = rs.getString("email");
				String pass = rs.getString("pass");
				
				MembersVO member = new MembersVO(id, email, pass);
				return member;
			}
		});
		return members;
	}

}
