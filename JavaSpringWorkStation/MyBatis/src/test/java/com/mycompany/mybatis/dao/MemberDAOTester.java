package com.mycompany.mybatis.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mycompany.mybatis.vo.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
//root-context 와 servlet-context 위치 읽어오기
@ContextConfiguration(locations= {
		"file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml",
		"file:src\\main\\webapp\\WEB-INF\\spring\\appServlet\\servlet-context.xml"
})
public class MemberDAOTester {
	@Autowired
	private ApplicationContext ctx;
	
	@Test @Ignore
	public void testList() {
		MemberDAO dao = ctx.getBean(MemberDAO.class);
		List<MemberVO>list = null;
		try {
			list=dao.selectAll();
			for(MemberVO member : list) {
				System.out.println(member);
			}
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
	
	@Test @Ignore
	public void testLogin() {
		MemberDAO dao = ctx.getBean(MemberDAO.class);
		try {
			dao.login("abc@abc.com", "1234");
			System.out.println("로그인 성공");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}
	
	
	@Test @Ignore
	public void testUpdate() {
		MemberDAO dao = ctx.getBean(MemberDAO.class);
		try {
			MemberVO member = new MemberVO("abc@abc.com", "12345", "JUNIT", null, null);
			dao.update(member);
			System.out.println("회원정보변경처리가 완료되었습니다.");
		}
		catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}
	
	@Test @Ignore
	public void testInsert() {
		MemberDAO dao = ctx.getBean(MemberDAO.class);
		try {
			MemberVO member = new MemberVO("abc@abc.com", "1234", "tester", null, null);
			dao.insert(member);
					
		}
		catch (Exception e) {
			e.printStackTrace();
			System.err.print(e.getMessage());
		}
	}
}
