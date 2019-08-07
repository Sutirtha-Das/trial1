package springapp01.springConfig.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springapp01.springConfig.beans.WelcomeBean;

@Configuration
public class AppConfig {
	
	@Bean
	public WelcomeBean welcomeBean(){
		return new WelcomeBean("Sunand");
	}
}
