package connection;

import org.hibernate.cfg.Configuration;

import org.hibernate.SessionFactory;

public class HibernateProvider {
	private static final String DB_PATH = "hibernate.cfg.xml";
	private static SessionFactory sessionFactory;
	
	private HibernateProvider() {

	}

	public static SessionFactory getSessionFactory() {
		if(sessionFactory == null) {
			Configuration configuration = new Configuration();
			sessionFactory = configuration.configure(DB_PATH).buildSessionFactory();
		}
		return sessionFactory;
	}
}
