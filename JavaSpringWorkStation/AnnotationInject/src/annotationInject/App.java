package annotationInject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("AppContext.xml");
		ScoreBoard board =ctx.getBean(ScoreBoard.class);
		ScoreBoard board2 = ctx.getBean(ScoreBoard.class);
		board.getTest().setEng(100);
		board.print();
	}

}
