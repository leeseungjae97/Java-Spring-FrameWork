package jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import jdbc.dao.MembersDAO;
import jdbc.vo.MembersVO;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("AppContext.xml");
//		DataSource ds =(DataSource)ctx.getBean("dataSource");
//		System.out.println(ds);
//		JdbcTemplate temp = (JdbcTemplate)ctx.getBean("jdbcTemplate");
//		System.out.println(temp);
		MembersDAO dao = ctx.getBean(MembersDAO.class);
		dao.insert(new MembersVO("sky_battle@naver.com", "1234"));
		List<MembersVO> list = dao.selectAll();
		for(MembersVO mvo : list) {
			System.out.print(mvo);
		}
	}
}
