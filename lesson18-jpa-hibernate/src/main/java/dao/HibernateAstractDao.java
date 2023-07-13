package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import connection.HibernateProvider;
import persistence.Item;
import persistence.ItemGroupDto;

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
	
	@SuppressWarnings("unchecked")
	<T> List<T> safeList(Query<?> query){
		return (List<T>)query.getResultList();
	}
}
