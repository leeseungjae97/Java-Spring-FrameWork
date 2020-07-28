package com.mycompany.mybatis.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mycompany.mybatis.mapper.MemberMapper;
import com.mycompany.mybatis.vo.MemberVO;

@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO {
	
	@Autowired
	private MemberMapper mapper;
	
	@Override
	public void insert(MemberVO member) throws Exception {
		mapper.insert(member);
		//Mapper Interface 사용 시 에 CodeAssistance를 통해 안전하게 사용가능
	}

	@Override
	public void delete(String email) throws Exception {
		mapper.delete(email);
	}

	@Override
	public void update(MemberVO member) throws Exception {
		mapper.update(member);
	}

	@Override
	public MemberVO selectByEmail(String email) throws Exception {
		return mapper.selectByEmail(email);
	}
	@Override
	public MemberVO login(String email, String pass) throws Exception {
		MemberVO member = new MemberVO();
		member.setEmail(email);
		member.setPass(pass);
		return mapper.login(member);
	}

	@Override
	public List<MemberVO> selectAll() throws Exception {
		ArrayList<MemberVO>list = new ArrayList<>();
		return mapper.selectAll(list);
	}
	

}
