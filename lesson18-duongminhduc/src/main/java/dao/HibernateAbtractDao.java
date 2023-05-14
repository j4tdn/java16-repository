package dao;

import java.util.List;
import java.util.function.Consumer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

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
	@SuppressWarnings("unchecked")
	<T> List<T> safeList(Query<?> query)
	{
		return (List<T>)query.getResultList();
	}
	void executeInTransaction(Consumer<Session> consumer)
	{
		Session session = openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
	 
		try {
			consumer.accept(session);
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	
	}
}
