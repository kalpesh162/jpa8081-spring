package com.dao;

import java.util.List;

import com.bean.Student;

public interface StudentDao {
	
	boolean insertStudent(Student student);
	boolean removeStudent(Student student);
	boolean checkStudent(Student student);
	Student findStudentById(int id);
	List<Student>getAllStudents();
	void modifyStudent(int id,Student upstudent);

}
