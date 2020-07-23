package jdbctemplate.mapper;



import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import jdbctemplate.vo.MemberVO;

public class MemberVOMapper implements RowMapper<MemberVO>{
//RowMapper는 타입미지정시 Object로 인식하기 때문에 MemberVO로 지정해주어야한다.
	@Override
	public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new MemberVO(
				rs.getString("email"), 
				rs.getString("pass"), 
				rs.getString("nick"),
				rs.getTimestamp("registeredAt"),
				rs.getTimestamp("removeAt"));
	}
	
}
