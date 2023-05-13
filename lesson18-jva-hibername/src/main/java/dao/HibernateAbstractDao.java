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
	Session getCurrentSession() {//câu 1
		return sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings("unchecked")
	<T> List<T> safeList(Query<?> query){
		return 	(List<T>)query.getResultList();
	}
	void executeInTransaction(Consumer<Session> consumer) {
		Session session = openSession();
		Transaction transaction = session.beginTransaction();
		try {
			//receive nhận cái hàm thực thi từ chỗ gọi nó
			//with parameter--> session
			consumer.accept(session);
			transaction.commit();
		} catch (Exception e) {

		e.printStackTrace();
		transaction.rollback();
		}
	}
}
