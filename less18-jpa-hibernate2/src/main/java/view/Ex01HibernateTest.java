package view;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.HibernateProvider;

public class Ex01HibernateTest {
public static void main(String[] args) {
	SessionFactory sf =	HibernateProvider.getSessionFactory();
	
	
	//Session : khi tạo 1 session --> tạo ra 1 thread truy cập 
	// 			liên kết từ JAVA vào DATABASE
	/*
	 * có 2 cách để tạo ra sesion trong JPA?Hibernate từ sessionfactory 
	 * + opensession  --> luôn tạo ra thread mới 
	 * getCurrentSession() --> singleton --> chỉ có 1 thread (session) duy nhất được tạo ra .
	 * 
	 *--> phải cấu hình để trả về curent thread 
	 */ 
	Session session1 = sf.openSession();
	Session session2 = sf.openSession();
	
	System.out.println("session1 --> " + session1);
	System.out.println("session2 --> " + session2);
	
	
	Session session3 = sf.getCurrentSession();
	Session session4 = sf.getCurrentSession();
	
	System.out.println("session3 --> " + session3);
	System.out.println("session4 --> " + session4);
	
	
}
}
