package jdbctemplate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import jdbctemplate.dao.MemberDAO;
import jdbctemplate.vo.MemberVO;

@Service("memberRegister")
public class MemberRegisterImpl implements MemberRegister {
	//dao를 new으로 dao가 생성되는 것 보다 Component로 가져오는 타이밍이 더 빠르다
	@Autowired //autowired를 통해 자동으로 넣어주게하자
	private MemberDAO dao;
	
	@Override
	public void execute(String email, String pass, String pass2, String nick) throws Exception {
		MemberVO member = new MemberVO(email, pass, nick, null, null);
		try {
			dao.insert(member);
			System.out.println("회원가입 처리가 완료되었습니다...");
		}
		catch (Exception e) {
			System.out.println("회원가입 처리가 실패되었습니다...");
			throw e;
		}
	}
}
