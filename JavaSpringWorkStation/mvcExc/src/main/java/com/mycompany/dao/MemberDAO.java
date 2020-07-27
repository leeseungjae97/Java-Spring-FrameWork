package com.mycompany.dao;

import com.mycompany.exception.MemberException;
import com.mycompany.vo.MemberVO;

public interface MemberDAO {
	void insert(MemberVO member)throws MemberException;
	MemberVO login(String email, String pass)throws MemberException;
}
