package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.HibernateConnection;

public class HibernateAbstractDao {
private SessionFactory sessionFactory;
	
	public HibernateAbstractDao() {
		sessionFactory = HibernateConnection.getSessionFactory();
	}
	
	Session openSession() {
		return sessionFactory.openSession();
	}
	
	Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
}
