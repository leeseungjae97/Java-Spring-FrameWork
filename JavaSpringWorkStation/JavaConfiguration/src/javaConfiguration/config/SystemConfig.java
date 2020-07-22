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
		map.put("국어", 90);
		map.put("수학", 70);
		map.put("영어", 80);
		
		return map;
	}
}
