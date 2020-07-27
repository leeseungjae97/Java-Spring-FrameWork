package com.mycompany.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mycompany.dao.BoardDAO;
import com.mycompany.exception.BoardException;
import com.mycompany.vo.BoardVO;
import com.mycompany.vo.MemberVO;

@Service("boardInsert")
public class BoardInsertImpl implements BoardInsert {
	@Autowired
	@Qualifier("boardDAO")
	private BoardDAO dao;
	
	@Override
	public void execute(HttpSession session, String content) throws BoardException {
		MemberVO member = (MemberVO)session.getAttribute("loginInfo");
		BoardVO board=dao.insertBoard(member.getEmail(), content);
		session.setAttribute("board", board);
	}
}
