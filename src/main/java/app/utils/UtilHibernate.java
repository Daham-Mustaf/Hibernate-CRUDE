package app.utils;

import app.entity.Student;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class UtilHibernate {
	private static Configuration configuration;
	private static SessionFactory sessionFactory = null;

	public static SessionFactory getSessionFactory() {
		// Design a singleton SessionFactory !
		if (sessionFactory == null) {
			configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			configuration.addAnnotatedClass(Student.class);
			sessionFactory = configuration.buildSessionFactory();
		}
		return sessionFactory;
	}

}
