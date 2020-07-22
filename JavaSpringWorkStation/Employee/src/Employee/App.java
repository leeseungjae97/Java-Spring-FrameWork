package Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext();
		ManagerImple mgi = ctx.getBean("ManagerImple", ManagerImple.class);
		

	}

}
