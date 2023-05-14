package dao;

import java.util.List;
import java.util.function.Consumer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import connection.HibernateProvider;

public class HibernateAbstractDao {
	
	private SessionFactory sessionFactory;
	
	public HibernateAbstractDao() {
		sessionFactory = HibernateProvider.getSessionFactory();
	}
	
	Session openSession() {
		return sessionFactory.openSession();
	}
	
	Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	<T> List<T> safeList(Query<?> query) {
		return (List<T>)query.getResultList();
	}
	
	/**
	 * Helper method to execute a query in JPA/Hibernate transaction
	 * 
	 * Usually --> save, update, remove
	 */
	void executeInTransaction(Consumer<Session> consumer) {
		Session session = openSession();
		Transaction transaction = session.beginTransaction();
		try {
			// receive implementation method from invoked place
			// with parameter --> session
			consumer.accept(session);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}	
}