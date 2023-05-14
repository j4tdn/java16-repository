package dao;

import java.util.List;

import persistence.Student;

public class HibernateStudentDao extends HibernateAbstractDao implements StudentDao {
	
	private static final String GET_ALL_STUDENT = ""
			+ "SELECT st.*\n"
			+ "	FROM STUDENT st\n"
			+ "    JOIN CLASS cl\n"
			+ "      ON st.CLASS_ID = cl.ID;";
	
	
	public List<Student> getAll() {
		return null;
	}
}
