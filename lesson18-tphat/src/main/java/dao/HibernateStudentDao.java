package dao;

import java.util.List;

import org.hibernate.type.IntegerType;

import persitence.Student;

public class HibernateStudentDao extends HibernateAbstractDao implements StudentDao  {

	private static final String GET_STUDENTS_BY_CLASS_ID = ""
			+ "	SELECT *\n"
			+ "  FROM student\n"
			+ " WHERE student.class_id = :id\n";
	
	public List<Student> getAllById(int id) {
		System.out.println(GET_STUDENTS_BY_CLASS_ID);
		return openSession().createNativeQuery(GET_STUDENTS_BY_CLASS_ID,Student.class)
				            .setParameter("id", id,IntegerType.INSTANCE)
				            .getResultList();
	}

	
}
