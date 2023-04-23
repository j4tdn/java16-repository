package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.HibernateProvider;

public class HibernateAbstractDao {

	private SessionFactory sessionFactory;

	public HibernateAbstractDao() {
		sessionFactory = HibernateProvider.getSessionFactory();
	}

	Session openSession() {
		return sessionFactory.openSession();
	}

	Session getCuSession() {
		return sessionFactory.getCurrentSession();
	}
}
