package keyHolder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import keyHolder.service.PartProductInsert;

public class App {
	public static void main(String[] args)throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("AppContext.xml");
		//PartInsert service = ctx.getBean(PartInsert.class);
		//service.execute("생활가전");
		
//		ProductInsert service2 = ctx.getBean(ProductInsert.class);
//		service2.execute("세탁기", 6000000, 2);
		
		PartProductInsert service3 = ctx.getBean(PartProductInsert.class);
		service3.execute("의류", "게이밍마우스", 50000);
	}
}
