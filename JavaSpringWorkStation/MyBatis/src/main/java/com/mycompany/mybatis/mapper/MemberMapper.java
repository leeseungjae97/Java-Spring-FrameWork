package com.mycompany.mybatis.mapper;

import java.util.List;

import com.mycompany.mybatis.vo.MemberVO;

public interface MemberMapper {
	MemberVO selectByEmail(String email)throws Exception;
	List<MemberVO> selectAll(List<MemberVO> list)throws Exception;
	MemberVO login(MemberVO member)throws Exception;
	void insert(MemberVO member)throws Exception;
	void update(MemberVO member)throws Exception;
	void delete(String email)throws Exception;
	
}
