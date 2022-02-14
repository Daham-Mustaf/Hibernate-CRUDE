package app.service.impl;

import app.dao.impl.StudentDaoImpl;
import app.entity.Student;
import app.service.StudentService;

public class StudentServiceImpl implements StudentService {

	@Override
	public void creatStudent(Student student) {
		new StudentDaoImpl().addStudent(student);

	}

	@Override
	public Student getStudentById(int id) {

		return new StudentDaoImpl().fetchStudentById(id);
	}

	@Override
	public void updateStudentById(int id, String name) {
		new StudentDaoImpl().updateStudentById(id, name);

	}

	@Override
	public void deletStudentById(int id) {
		new StudentDaoImpl().deletStudentById(id);
	}

}
