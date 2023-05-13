package view;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.HibernateProvider;

public class Ex01HibernateProvider {
	public static void main(String[] args) {
		SessionFactory sf = HibernateProvider.getSessionFactory();
		
		/*
		 * Session: Khi tạo 1 sesion --> tạo ra 1 thread truy cập
		 * 			liên jeets từ JAVA vào DATABASE
		 * Có 2 cách tại ra session trong JPA/Hibernate từ SessionFactory
		 * + openSession() --> luôn tạo ra thread mới
		 * + getCurrentSession() --> singleton - chỉ có 1 thread(session) duy nhất được tạo ra
		 */
		
		Session session1 = sf.openSession();
		Session session2 = sf.openSession();
		
		System.out.println("session1 --->> " + session1);
		System.out.println("session2 --->> " + session2);
		
		Session session3 = sf.getCurrentSession();
		Session session4 = sf.getCurrentSession();
		
		System.out.println("session3 --->> " + session3);
		System.out.println("session4 --->> " + session4);
	}
}
