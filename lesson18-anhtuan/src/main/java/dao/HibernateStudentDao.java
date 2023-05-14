package dao;

import java.util.List;

import persistence.Student;

public class HibernateStudentDao extends HibernateAbstractDao implements StudentDao{
	private static final String GET_ALL_STUDENT = ""
			+ "SELECT * FROM STUDENT";
	public List<Student> getAll() {
		
		
		return openSession().createNativeQuery(GET_ALL_STUDENT, Student.class).getResultList();
	}

}
