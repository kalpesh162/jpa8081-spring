package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Address;
import com.bean.Employee;
import com.config.AppConfig;

public class App {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee employee=(Employee)context.getBean("employee1");
		
		System.out.println(employee);
		System.out.println(employee.getAddress());
		
				
		Address address=(Address)context.getBean("homeAddress");
		System.out.println(address);
		
	}

}
