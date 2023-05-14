package dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import persistence.Student;

public class HibernateStudentDao extends HibernateAbstractDao implements StudentDao {
	private static final String PARAM_CLASS_ID = "class_id";
	private static final String SQL_PARAM_CLASS_ID = ":" + PARAM_CLASS_ID;
	private static final String GET_STUDENTS_BY_CLASS_ID = ""
			+ "select * from student where class_id = " + SQL_PARAM_CLASS_ID;
	
	private static final String GET_GOOD_STUDENTS = " "
			+ "select *   \n"
			+ "from student s   \n"
			+ "where s.id in (   \n"
			+ "	select student_id   \n"
			+ "	 from result r   \n"
			+ "	 where r.`subject`='math' and r.score >=8    \n"
			+ "		and exists(   \n"
			+ "			select *   \n"
			+ "			from result r2   \n"
			+ "			where r2.student_id = r.student_id   \n"
			+ "				and r2.`subject`='lit' and r2.score >=8    \n"
			+ "    )   \n"
			+ ");";

	@Override
	public List<Student> get(int classId) {
		List<Student> students =  openSession()
				.createNativeQuery(GET_STUDENTS_BY_CLASS_ID, Student.class)
				.setParameter(PARAM_CLASS_ID, classId)
				.getResultList();
		return students;
	}

	@Override
	public List<Student> getGoodStudents() {
		Session session = openSession();
		List<Student> goodStudents = session.createNativeQuery(GET_GOOD_STUDENTS, Student.class).getResultList();
//		goodStudents.forEach(System.out::println);
		
		return goodStudents;
	}
	
	

}
