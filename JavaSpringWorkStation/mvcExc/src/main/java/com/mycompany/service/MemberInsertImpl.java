package com.mycompany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.mycompany.command.MemberCommand;
import com.mycompany.dao.MemberDAO;
import com.mycompany.exception.MemberException;
import com.mycompany.vo.MemberVO;

@Service("memberInsert")
public class MemberInsertImpl implements MemberInsert {
	
	@Autowired
	@Qualifier("memberDAO")
	private MemberDAO dao;
	
	@Override
	public void execute(MemberCommand member) throws MemberException {
		MemberVO memberVo = new MemberVO();
		
		memberVo.setEmail(member.getEmail());
		memberVo.setPass(member.getPass());
		memberVo.setNick(member.getNick());
		
		dao.insert(memberVo);
	}

}
