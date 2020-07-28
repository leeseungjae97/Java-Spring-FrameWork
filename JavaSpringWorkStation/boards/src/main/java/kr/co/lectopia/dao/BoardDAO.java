package kr.co.lectopia.dao;

import java.util.List;

import kr.co.lectopia.vo.BoardVO;
import kr.co.lectopia.vo.SearchVO;

public interface BoardDAO {
	List<BoardVO> selectList() throws Exception;
	BoardVO selectById(int id)throws Exception;
	void insert(BoardVO board)throws Exception;
	void update(BoardVO board)throws Exception;
	void delete(int id)throws Exception;
	int getNextMainId() throws Exception;
	int getNextSubId(int mainId) throws Exception;
	List<BoardVO> searchBySubject(SearchVO search)throws Exception;
}
