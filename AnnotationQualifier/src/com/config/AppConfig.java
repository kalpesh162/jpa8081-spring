package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bean.Address;
import com.bean.Employee;

@Configuration
@ComponentScan(basePackages = "com")
public class AppConfig {

	@Bean
	public Address workAddress() {
		return new Address("MH", "PUNE", 411014);
	}

	@Bean
	@Primary
	public Address homeAddress() {
		return new Address("MH", "MALKAPUR", 411031);
	}

}
