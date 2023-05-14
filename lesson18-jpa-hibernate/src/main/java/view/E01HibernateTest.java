package view;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import connection.HibernateProvider;

public class E01HibernateTest {
	public static void main(String[] args) {
		SessionFactory sf = HibernateProvider.getSessionFactory();
		
		/*
		  Session: Khi tạo 1 session --> Tạp ra 1 thread truy cập liên kết từ JAVA vào DATABASE
		 Có 2 cách để tạo ra session trong JPA/Hibernate từ SessionFactory:
		 + openSession()       --> Luôn tạo ra Thread mới 
		 + getCurrentSession() --> Singleton - chỉ có 1 thread(session) duy nhất được tạo ra
		 --> phải cấu hình để trả về current thread
		 */
		Session session1 = sf.openSession();
		Session session2 = sf.openSession();
		
		System.out.println("Session1 --> " + session1);
		System.out.println("Session2 --> " + session2);
		
		Session session3 = sf.getCurrentSession();
		Session session4 = sf.getCurrentSession();
		
		System.out.println("Session3 --> " + session3);
		System.out.println("Session4 --> " + session4);
		
	}

}
