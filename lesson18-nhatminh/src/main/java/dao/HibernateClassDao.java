package dao;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.transform.AliasToBeanResultTransformer;
import org.hibernate.type.DoubleType;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import dto.StudentOfClassDto;

public class HibernateClassDao extends AbstractHibernateDao implements ClassDao {

	private static final String GET_STUDENT_PER_CLASS = "" + "SELECT class.id " + StudentOfClassDto.SQL_CLASS_ID + ","
			+ "		  class.name " + StudentOfClassDto.SQL_CLASS_NAME + "," + "		  count(student.id) "
			+ StudentOfClassDto.SQL_CLASS_amount + "\n" + "FROM student \n" + "JOIN class\n"
			+ "ON student.class_id = class.id\n" + "GROUP BY class.id";
	private static final String GET_STUDENT_PER_CLASS_WITH_CONDITION = "SELECT class.id "
			+ StudentOfClassDto.SQL_CLASS_ID + "," + "		  class.name " + StudentOfClassDto.SQL_CLASS_NAME + ","
			+ "		  count(student.id) " + StudentOfClassDto.SQL_CLASS_amount + "FROM STUDENT\n"
			+ "         JOIN CLASS ON STUDENT.CLASS_ID = CLASS.ID\n"
			+ "         JOIN RESULT ON RESULT.STUDENT_ID = STUDENT.ID\n"
			+ "WHERE RESULT.SUBJECT = \"Literature\" AND RESULT.SCORE >= :mathScore AND EXISTS(SELECT *\n"
			+ "FROM STUDENT ST_TEMP\n" + "         JOIN CLASS CL_TEMP ON ST_TEMP.CLASS_ID = CL_TEMP.ID\n"
			+ "         JOIN RESULT RS_TEMP ON ST_TEMP.ID = RS_TEMP.STUDENT_ID\n"
			+ "WHERE RS_TEMP.SUBJECT = \"Math\" AND RS_TEMP.SCORE >= :literatureScore AND STUDENT.ID = ST_TEMP.ID)\n"
			+ "GROUP BY CLASS.I";

	public List<StudentOfClassDto> statisticStudentPerClass() {
		NativeQuery<?> query = openSession().createNativeQuery(GET_STUDENT_PER_CLASS);
		query.addScalar(StudentOfClassDto.SQL_CLASS_ID, IntegerType.INSTANCE)
				.addScalar(StudentOfClassDto.SQL_CLASS_NAME, StringType.INSTANCE)
				.addScalar(StudentOfClassDto.SQL_CLASS_amount, IntegerType.INSTANCE)
				.setResultTransformer(new AliasToBeanResultTransformer(StudentOfClassDto.class));
		return safeList(query);
	}

	public List<StudentOfClassDto> getNumberofStudentInClassWithCondition(double mathScore, double literatureScore) {
		NativeQuery<?> query = openSession().createNativeQuery(GET_STUDENT_PER_CLASS);
		query.addScalar(StudentOfClassDto.SQL_CLASS_ID, IntegerType.INSTANCE)
				.addScalar(StudentOfClassDto.SQL_CLASS_NAME, StringType.INSTANCE)
				.addScalar(StudentOfClassDto.SQL_CLASS_amount, IntegerType.INSTANCE)
				.setParameter("mathScore", mathScore, DoubleType.INSTANCE)
				.setParameter("literatureScore", literatureScore, DoubleType.INSTANCE)
				.setResultTransformer(new AliasToBeanResultTransformer(StudentOfClassDto.class));
		return safeList(query);
	}
}
