package com.app;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bean.Employee;

public class App {
	public static void main(String[] args) {
		// BeanFactory
		// ApplicationContext

		Resource resource = new ClassPathResource("spring.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("spring.xml");
		/*
		 * Employee employee = (Employee) context.getBean("employee");
		 * 
		 * System.out.println(employee);
		 */

		Employee employee = (Employee) factory.getBean("employee");
		System.out.println(employee);
		System.out.println("******");
		Employee employee1 = (Employee) factory.getBean("employee1");
		System.out.println(employee1);
		System.out.println("******");

	}

}
