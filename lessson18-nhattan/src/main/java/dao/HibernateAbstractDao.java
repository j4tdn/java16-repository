package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import connection.HibernateProvider;

public abstract class HibernateAbstractDao {
	
	private static SessionFactory sessionFactory;
	
	static {
		sessionFactory = HibernateProvider.getSessionFactory();
	}
	
	Session openSession() {
		return sessionFactory.openSession();
	}
	
	Session getCurrentSesion() {
		return sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	<T> List<T> safeList(Query<?> query) {
		return (List<T>) query.getResultList();
	}
		
}
