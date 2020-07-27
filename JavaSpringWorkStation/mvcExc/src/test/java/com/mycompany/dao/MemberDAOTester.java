package com.mycompany.dao;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mycompany.exception.MemberException;
import com.mycompany.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {
		"file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml",
		"file:src\\main\\webapp\\WEB-INF\\spring\\appServlet\\servlet-context.xml"
})
public class MemberDAOTester{
	
	@Autowired
	ApplicationContext context;
	
	@Test @Ignore
	public void testInsert() {
		MemberDAO dao = context.getBean(MemberDAO.class);
		MemberVO member = new MemberVO();
		member.setEmail("tt@naber.com");
		member.setPass("1234");
		member.setNick("rrr");
		try {
			dao.insert(member);
			System.out.println("회원가입처리완료");
		}
		catch (MemberException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Test @Ignore
	public void loginTest() {
		MemberDAO dao =context.getBean("memberDAO", MemberDAO.class);
		try {
			MemberVO member = dao.login("sky_battle@naver.com", "1234");
			System.out.println("회원정보 취득 성공");
		}
		catch (MemberException e) {
			System.out.println(e.getMessage());
		}
	}
}
