package kr.co.lectopia.dao;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.lectopia.vo.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {
		"file:src\\main\\webapp\\WEB-INF\\spring\\root-context.xml",
		"file:src\\main\\webapp\\WEB-INF\\spring\\appServlet\\servlet-context.xml"
})
public class BoardDAOTester {
	@Autowired
	private ApplicationContext ctx;
	@Test
	public void select() {
		BoardDAO dao = ctx.getBean(BoardDAO.class);
		
		try {
			List<BoardVO> boards = dao.selectList();
			
			for(int i = 0 ; i < boards.size(); i++) {
				System.out.println(i +" : "+boards);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test @Ignore
	public void testInsert1() {
		BoardDAO dao = ctx.getBean(BoardDAO.class);
		BoardVO board = new BoardVO();
		board.setEmail("bbc@bbc.com");
		board.setSubject("답글테스트");
		board.setContext("답글테스트");
		board.setMainId(1);
		try {
			int subId = dao.getNextSubId(board.getMainId());
			board.setMainId(subId);
			dao.insert(board);
			System.out.println("답글등록완료");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test @Ignore
	public void testInsert() {
		BoardDAO dao = ctx.getBean(BoardDAO.class);
		BoardVO board = new BoardVO();
		board.setEmail("abc@abc.com");
		board.setSubject("입력테스트");
		board.setContext("입력테스트");
		try {
			int mainId = dao.getNextMainId();
			board.setMainId(mainId);
			dao.insert(board);
			System.out.println("게시글등록완료");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	@Test @Ignore
	public void testGetNextMainId() {
		BoardDAO dao = ctx.getBean(BoardDAO.class);
		BoardVO board = new BoardVO();
		try {
			System.out.println(dao.getNextMainId());
			
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}
	
	
}
