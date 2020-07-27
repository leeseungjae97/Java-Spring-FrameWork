package com.mycompany.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mycompany.exception.BoardException;
import com.mycompany.vo.BoardVO;

@Repository("boardDAO")
public class BoardDAOImpl implements BoardDAO {
	@Autowired
	private JdbcTemplate jTemp;
	
	@Override
	public BoardVO insertBoard(String email, String content) throws BoardException {
		String sql ="INSERT INTO boards VALUES(default, default, default, ?, ?, default, default)";
		List<BoardVO> boards = null;
		try {
			boards =  jTemp.query(sql, new RowMapper<BoardVO>() {

				@Override
				public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
					return new BoardVO(rs.getInt("id"), rs.getInt("sid"), rs.getInt("ssid"),
							rs.getString("email"), rs.getString("content"), rs.getTimestamp("regiDate"),
							rs.getInt("regiCount"));
				}
			});
		}
		catch (Exception e) {
			throw new BoardInsertException();
		}
		return (boards.size() == 0 ? null : boards.get(0));
	}
	@Override
	public void ViewBoards(List<BoardVO> boards) throws BoardException {

	}

}
