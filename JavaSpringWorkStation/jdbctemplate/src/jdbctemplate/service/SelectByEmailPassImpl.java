package jdbctemplate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jdbctemplate.dao.MemberDAO;
import jdbctemplate.vo.MemberVO;

@Service("selectByEmailPass")
public class SelectByEmailPassImpl implements SelectByEmailPass {

	@Autowired
	private MemberDAO dao;
	@Override
	public void execute(String email, String pass) throws Exception {
		MemberVO member = null;
		try {
			member = dao.selectByEmailPass(email, pass);
			System.out.println(member);
		}
		catch(Exception e) {
			System.out.println("해당 이메일과 비밀번호는 존재하지 않습니다.");
			throw e;
		}
	}
}
