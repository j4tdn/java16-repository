package connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateProvider {

	private static final String PATH = "hibernate-cfg.xml";

	private static SessionFactory sesFactory;

	private HibernateProvider() {
		// TODO Auto-generated constructor stub
	}

	public static SessionFactory getSessionFactory() {

		if (sesFactory == null) {
			Configuration configuration = new Configuration();

			sesFactory = configuration.configure(PATH).buildSessionFactory();
		}

		return sesFactory;
	}

}
