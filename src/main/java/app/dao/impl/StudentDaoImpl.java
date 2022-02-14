package app.dao.impl;

import app.dao.StudentDao;
import app.entity.Student;
import app.utils.UtilHibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;



public class StudentDaoImpl implements StudentDao {

	@Override
	public void addStudent(Student student) {
		try (Session session = UtilHibernate.getSessionFactory().openSession()) {
			session.beginTransaction();
			Integer id = (Integer) session.save(student);
			System.out.println("student is created  with Id::" + id);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Student fetchStudentById(int id) {
		try (Session session = UtilHibernate.getSessionFactory().openSession()) {
			Student student = session.get(Student.class, id);
			if (student != null) {
				session.beginTransaction();
				student.setStudentName("Updated Student");
				session.getTransaction().commit();

			} else {
				System.out.println("Student with id is not found .. ");

			}
		} catch (HibernateException e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public void updateStudentById(int id, String name) {
		try (Session session = UtilHibernate.getSessionFactory().openSession()) {
			Student student = session.get(Student.class, id);
			if (student != null) {
				session.beginTransaction();
				student.setStudentName(name);
				session.update(student);
				session.getTransaction().commit();

			} else {
				System.out.println("Student with id is not found .. ");

			}
		} catch (HibernateException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deletStudentById(int id) {
		try (Session session = UtilHibernate.getSessionFactory().openSession()) {
			Student student = session.get(Student.class, id);
			if (student != null) {
				session.beginTransaction();
				session.delete(student);
				session.getTransaction().commit();

			} else {
				System.out.println("Student with id is not found .. ");

			}
		} catch (HibernateException e) {
			e.printStackTrace();
		}

	}

}
