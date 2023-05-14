package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import bean.Student;
import bean.StudentGroupDTO;


public class HibernateStudentDao extends HibernateAbstractDao implements StudentDao {
	
	


	public List<Student> getAll() {
		Session session = openSession();
		NativeQuery<Student> query = session.createNativeQuery("SELECT * FROM Student  WHERE class_id = 1 ", Student.class);

		
		List<Student> result = query.getResultList();

		return result;
	}

	@Override
	public List<Student> sortGrate() {
		Session session = openSession();
		Query<Student> query = session.createQuery(
				"SELECT Student.id, Student.`NAME`, Student.gender, Student.class_id from Student JOIN Result  ON Student.id = Result.student_id WHERE Result.score >= 8.2",
				Student.class);
		
		

		
		List<Student> result = query.getResultList();
		return result;
	}
	
	
	
}
