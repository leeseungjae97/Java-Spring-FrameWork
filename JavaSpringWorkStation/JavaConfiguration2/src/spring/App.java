package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.register(spring.config.AppConfig.class);
		ctx.refresh();
		
		//hook으로 종료
		((AbstractApplicationContext)ctx).registerShutdownHook();
		Manager manager =ctx.getBean(Manager.class);
		
		manager.pay();
		//ctx.close(); //close를 쓰거나 hook으로 변경
		
		
	}

}
