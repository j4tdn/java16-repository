package view;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.HibernateProvider;

public class Ex01HibernateTest {
	public static void main(String[] args) {
		SessionFactory sf=  HibernateProvider.getSessionFactory();
		
		
		/*
		 * có 2 cách để tạo ra session trong JPA/Hibernate từ SesionFactory
		 * + openSession() --> luôn tạo ra thread mới
		 * + getCurrentSession() --> singleton - chỉ có 1 thread(session) duy nhất được tạo ra
		 *  --> phải cấu hình để trả về openThread
		 */
		
		Session session1 = sf.openSession();
		Session session2 = sf.openSession();
		
		
		System.out.println("session---> " + session1);
		System.out.println("session---> " + session2);
	}

}
