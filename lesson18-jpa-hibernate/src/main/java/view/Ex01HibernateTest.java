package view;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.HibernateProvider;

public class Ex01HibernateTest {
	public static void main(String[] args) {
		
		SessionFactory sf = HibernateProvider.getSessionFactory();
		
		Session session = sf.openSession();
		
		System.out.println("session --->> " + session);
	}
}
