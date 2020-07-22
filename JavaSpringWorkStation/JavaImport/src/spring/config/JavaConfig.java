package spring.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("spring")
public class JavaConfig {
	
    @Bean
    public ArrayList<String> list() {
        ArrayList<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("심청이");

        return list;
    }
}
