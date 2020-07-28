package com.mycompany.mybatis.dao;

import java.util.List;

import com.mycompany.mybatis.vo.MemberVO;

public interface MemberDAO {
	void insert(MemberVO member)throws Exception;
	void delete(String email)throws Exception;
	void update(MemberVO member)throws Exception;
	MemberVO selectByEmail(String email)throws Exception;
	MemberVO login(String email, String pass)throws Exception;
	List<MemberVO> selectAll() throws Exception;
	
}
