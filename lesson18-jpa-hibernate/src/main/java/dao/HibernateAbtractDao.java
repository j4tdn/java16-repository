package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.HibernateProvider;

public class HibernateAbtractDao {

	private SessionFactory sessionFactory;
	public HibernateAbtractDao() {
		sessionFactory = HibernateProvider.getSessionFactory();
	}
	
	Session openSession()
	{
		return sessionFactory.openSession();
	}
	Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}
}
