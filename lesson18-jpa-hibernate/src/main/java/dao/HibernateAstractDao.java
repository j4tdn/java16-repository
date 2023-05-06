package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.HibernateProvider;
import persistence.Item;

public class HibernateAstractDao {
	
	private SessionFactory sessionFactory;
	
	public HibernateAstractDao() {
		sessionFactory = HibernateProvider.getSessionFactory();
	}
	
	Session openSession() {
		return sessionFactory.openSession();
	}
	
	Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
}
