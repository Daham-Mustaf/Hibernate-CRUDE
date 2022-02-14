package app.service;

import app.entity.Student;


public interface StudentService {

	public abstract void creatStudent(Student student);
	public abstract Student getStudentById(int id);
	public abstract void updateStudentById(int id, String name);
	public abstract void deletStudentById(int id);

}
