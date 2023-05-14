package dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.DoubleType;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import persistence.Student;
import persistence.StudentAVGScoreDto;

public class HibernateStudentDao extends HibernateAbstractDao implements StudentDao{
	
	private static final String SQL_SELECT_ALL_STUDENTS = ""
			+ "SELECT * FROM STUDENT";
	
	private static final String SQL_GET_STUDENT_SCORE_HIGHER_THAN_8_2 = ""
			+ "WITH AVG_SCORES AS( \n"
			+ "SELECT rs.STUDENT_ID " + StudentAVGScoreDto.STUDENT_ID + " , \n"
			+ "	   st.NAME " + StudentAVGScoreDto.STUDENT_NAME + " , \n"
			+ "	   AVG(SCORE) " + StudentAVGScoreDto.AVG_SCORE + " \n"
			+ "  FROM RESULT rs \n"
			+ "  JOIN STUDENT st \n"
			+ "    ON st.ID = rs.STUDENT_ID \n"
			+ " GROUP BY rs.STUDENT_ID \n"
			+ ") \n"
			+ "SELECT * \n"
			+ "  FROM AVG_SCORES a \n"
			+ "  WHERE a." + StudentAVGScoreDto.AVG_SCORE + " > 8.2";
	
	@Override
	public List<Student> getAll() {
		return safeList(openSession().createNativeQuery(SQL_SELECT_ALL_STUDENTS, Student.class ));
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public List<StudentAVGScoreDto> haveAvgScoreGreat() {
		return safeList(openSession().createNativeQuery(SQL_GET_STUDENT_SCORE_HIGHER_THAN_8_2)
				.addScalar(StudentAVGScoreDto.STUDENT_ID, IntegerType.INSTANCE)
				.addScalar(StudentAVGScoreDto.STUDENT_NAME, StringType.INSTANCE)
				.addScalar(StudentAVGScoreDto.AVG_SCORE, DoubleType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(StudentAVGScoreDto.class)));
	}
}
