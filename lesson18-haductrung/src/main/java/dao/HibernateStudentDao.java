package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.AliasToBeanResultTransformer;
import org.hibernate.type.DoubleType;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import persistence.Student;

public class HibernateStudentDao extends AbstractHibernateDao implements StudentDao {
	
	private static final String GET_STUDENTS_BY_CLASS_ID = ""
			+ "SELECT *\n"
			+ "  FROM student\n"
			+ " WHERE student.class_id = :classId\n";
	private static final String GET_STUDENTS_HAVE_AVG_SCORE_GTR_THAN = ""
			+ "WITH ThongTinHocSinh AS (\r\n"
			+ "SELECT student.*, avg(result.score) DiemTrungBinh\r\n"
			+ "FROM student\r\n"
			+ "JOIN result\r\n"
			+ "ON student.id = result.student_id\r\n"
			+ "GROUP BY student.id)\r\n"
			+ "SELECT ThongTinHocSinh.id, ThongTinHocSinh.name, ThongTinHocSinh.gender\r\n"
			+ "FROM ThongTinHocSinh\r\n"
			+ "WHERE DiemTrungBinh >= :avgScore";
	
	public List<Student> getAllStudentByClassId(int classId) {
		System.out.println(GET_STUDENTS_BY_CLASS_ID);
		return openSession().createNativeQuery(GET_STUDENTS_BY_CLASS_ID,Student.class)
				            .setParameter("classId", classId,IntegerType.INSTANCE)
				            .getResultList();
	}
	public List<Student> getStudentsByAvgScore(double avgScore) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
