package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import persistence.Student;

public class HibernateStudentDao extends HibernateAbtractDao implements StudentDao {

	private static final String GET_ALL_ITEMS_BY_CLASS_ID = "" + "SELECT * FROM Student WHERE class_id = :classId";

	public List<Student> findByClassId(Integer cId) {
		Session session = openSession();
		NativeQuery<Student> query = session.createNativeQuery(GET_ALL_ITEMS_BY_CLASS_ID, Student.class);
		query.setParameter("classId", cId);
		List<Student> results = query.getResultList();
		return results;

	}

}
