package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Student;

public class App {
	
	 public static void main(String[] args) {
		
		 ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		 
		 Student student1=(Student)context.getBean("student1");
		 
		 Student student2=(Student)context.getBean("student1");
		 
		 System.out.println(student1.hashCode());
		 System.out.println(student2.hashCode());
		 
		 
	}

}
