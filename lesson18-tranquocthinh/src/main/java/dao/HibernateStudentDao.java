package dao;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.AliasToBeanResultTransformer;
import org.hibernate.type.DoubleType;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import dto.ResultStudentClassDto;
import persistence.Student;

public class HibernateStudentDao extends HibernateAbstractDao implements StudentDao {
	
	private static final String GET_STUDENTS_BY_CLASS_ID = ""
			+ "SELECT *\n"
			+ "  FROM STUDENT\n"
			+ " WHERE STUDENT.CLASS_ID = :CLASS_ID";
	
	private static final String GET_STUDENTS_HAVE_AVG_SCORE_GTR_THAN = ""
			+ "WITH ThongTinHocSinh AS (\n"
			+ "SELECT student.*, avg(result.score) DiemTrungBinh \n"
			+ "FROM student \n"
			+ "JOIN result \n"
			+ "ON student.id = result.student_id \n"
			+ "GROUP BY student.id) \n"
			+ "SELECT ThongTinHocSinh.id, ThongTinHocSinh.name, ThongTinHocSinh.gender \n"
			+ "FROM ThongTinHocSinh \n"
			+ "WHERE DiemTrungBinh >= :avgScore";

	@Override
	public List<Student> getAllStudentByClassId(int classId) {
		System.out.println(GET_STUDENTS_BY_CLASS_ID);
		return openSession().createNativeQuery(GET_STUDENTS_BY_CLASS_ID, Student.class)
				            .setParameter("CLASS_ID", classId, IntegerType.INSTANCE)
				            .getResultList();
	}

	@Override
	public List<Student> getStudentsByAvgScore(double avgScore) {
		return openSession().createNativeQuery(GET_STUDENTS_HAVE_AVG_SCORE_GTR_THAN,Student.class)
	            .setParameter("avgScore", avgScore,DoubleType.INSTANCE)
	            .getResultList();
	}
}
