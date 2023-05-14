package view;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.HibernateProvider;

public class Ex01HibernateTest {
	public static void main(String[] args) {
		SessionFactory sf = HibernateProvider.getSessionFactory();
		
		Session session1 = sf.openSession();
		Session session2 = sf.openSession();
		
		System.out.println("cc"+session1);
		
		
	}

}
