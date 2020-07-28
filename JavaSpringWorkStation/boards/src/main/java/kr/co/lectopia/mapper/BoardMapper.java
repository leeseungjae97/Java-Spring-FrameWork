package kr.co.lectopia.mapper;

import java.util.List;

import kr.co.lectopia.vo.BoardVO;
import kr.co.lectopia.vo.SearchVO;

public interface BoardMapper {
	List<BoardVO> select();
	BoardVO selectById(int id);
	void insert(BoardVO board);
	void update(BoardVO board);
	void delete(int id);
	int nextMainId();
	int nextSubId(int mainId);
	List<BoardVO> searchBySubject(SearchVO search);
}
