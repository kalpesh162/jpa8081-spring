package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.bean.Student;

@Configuration
@ComponentScan(basePackages = "com")
public class AppConfig {
	
	@Bean
	public Student student11() {
		 return new Student(1, "Kalpesh", 55.55);
	}

}
