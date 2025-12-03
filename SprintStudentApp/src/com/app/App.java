package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bean.Student;
import com.config.AppConfig;
import com.service.StudentService;

public class App {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("--->"+context.getBean("student11"));
		
		StudentService service=(StudentService)context.getBean("studentServiceImpl");
		
		Student student=new Student(11, "Tushar", 55.55);
		Student student1=new Student(12, "Paresh", 75.55);
		Student student2=new Student(13, "Suresh", 65.55);
		Student student3=new Student(14, "Mahesh", 85.55);
		
		
		service.addStudent(student);service.addStudent(student1);
		service.addStudent(student2);service.addStudent(student3);
		
		System.out.println("is Availabe  "+service.isAvailableStudent(new Student(13, "Suresh", 65.55)));
		
		System.out.println(service.findAllStudents());
		
		
		
		
		
	}

}
