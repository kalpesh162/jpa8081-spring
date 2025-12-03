package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bean.Student;
import com.dao.StudentDao;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentDao studentDao;
	
	@Override
	public boolean addStudent(Student student) {
		return studentDao.insertStudent(student);
	}

	@Override
	public boolean deleteStudent(Student student) {
		return studentDao.removeStudent(student);
	}

	@Override
	public boolean isAvailableStudent(Student student) {
		
		return studentDao.checkStudent(student);
	}

	@Override
	public Student getStudentById(int id) {
		
		return studentDao.findStudentById(id);
	}

	@Override
	public List<Student> findAllStudents() {
		return studentDao.getAllStudents();
	}

	@Override
	public void updateStudent(int id, Student upstudent) {
		studentDao.modifyStudent(id, upstudent);
		
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	@Autowired
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

}
