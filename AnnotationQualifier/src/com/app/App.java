package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.Address;
import com.bean.Employee;
import com.config.AppConfig;

public class App {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee employee=(Employee)context.getBean("emp");
		
		System.out.println(employee);
		System.out.println(employee.getAddress());
		
	}

}
