package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.bean.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	private final List<Student> list = new ArrayList<Student>();

	@Override
	public boolean insertStudent(Student student) {

		return list.add(student);
	}

	@Override
	public boolean removeStudent(Student student) {
		if (list.contains(student))
			return list.remove(student);
		return false;
	}

	@Override
	public boolean checkStudent(Student student) {
		return list.contains(student);
	}

	@Override
	public Student findStudentById(int id) {

		for (Student student : list) {
			if (student.getId() == id)
				return student;
		}
		return null;
	}

	@Override
	public List<Student> getAllStudents() {
		return list;
	}

	@Override
	public void modifyStudent(int id, Student upstudent) {
		Student student = findStudentById(id);
		if (student != null) {
			student.setName(upstudent.getName());
			student.setMarks(upstudent.getMarks());
		}

	}

}
