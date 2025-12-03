package com.service;

import java.util.List;

import com.bean.Student;

public interface StudentService {
	
	boolean addStudent(Student student);
	boolean deleteStudent(Student student);
	boolean isAvailableStudent(Student student);
	Student getStudentById(int id);
	List<Student>findAllStudents();
	void updateStudent(int id,Student upstudent);

}
