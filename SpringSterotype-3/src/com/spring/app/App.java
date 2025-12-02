package com.spring.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.bean.Employee;
import com.spring.config.AppConfig;

public class App {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee employee=(Employee)context.getBean("employee");
		System.out.println(employee);
		
	}

}
