package com.mycompany.dao;

import java.util.List;

import com.mycompany.exception.BoardException;
import com.mycompany.vo.BoardVO;

public interface BoardDAO {
	BoardVO insertBoard(String email, String content)throws BoardException;
	void ViewBoards(List<BoardVO> boards)throws BoardException;
}
