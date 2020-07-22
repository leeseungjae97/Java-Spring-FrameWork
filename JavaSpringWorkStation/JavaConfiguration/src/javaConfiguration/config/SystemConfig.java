package javaConfiguration.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SystemConfig {
	
	@Bean
	public Map<String, Integer> map() {
		HashMap<String,Integer>map = new HashMap<>();
		map.put("����", 90);
		map.put("����", 70);
		map.put("����", 80);
		
		return map;
	}
}
