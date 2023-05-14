package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import persistence.Student;

public class HibernateStudentDao extends HibernateAbstractDao implements StudentDao {
	
	private static final String PARAM_CLASS_ID = "pclassid";
	
	private static final String SQL_PARAM_CLASS_ID = ":" + PARAM_CLASS_ID;
	
	private static final String GET_ALL_STUDENTS_BY_CLASS_ID = "SELECT * FROM STUDENT \n"
									+ "WHERE CLASS_ID = " + SQL_PARAM_CLASS_ID;
	
	public List<Student> getAllStudentByClassId(int class_id) {	
		Session session = openSession();
		NativeQuery<Student> query = 
				session.createNativeQuery(GET_ALL_STUDENTS_BY_CLASS_ID, Student.class);
		query.setParameter(PARAM_CLASS_ID, class_id);
		return query.getResultList();
	}
}
