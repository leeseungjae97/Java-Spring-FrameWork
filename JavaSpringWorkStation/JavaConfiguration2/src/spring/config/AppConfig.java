package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.Manager;
import spring.ManagerImpl;
import spring.PartTime;
import spring.Regular;

@Configuration
public class AppConfig {
	
	@Bean
	public Manager manager() {
		Manager manager = new ManagerImpl();
		manager.addEmployee(new Regular("홍길동", 30000000));
		manager.addEmployee(new PartTime("이순신", 30000));
		return manager;
	}
}
