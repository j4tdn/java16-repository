package dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import persistence.Class;
import persistence.ClassTotalAmountStudentDto;

public class HibernateClassDao extends HibernateAbstractDao implements ClassDao{
	
	private static final String SQL_GET_ALL_CLASSES = ""
			+ "SELECT * FROM CLASS";
	
	private static final String SQL_TOTAL_AMOUNT_STUDENTS = ""
			+ "SELECT cl.NAME " + ClassTotalAmountStudentDto.CLASS_NAME + ", \n"
			+ "	   count(cl.ID) " + ClassTotalAmountStudentDto.CLASS_TOTAL_AMOUNT_STUDENT + " \n"
			+ "  FROM CLASS cl \n"
			+ "  JOIN STUDENT st \n"
			+ "    ON cl.ID = st.CLASS_ID \n"
			+ " GROUP BY cl.ID";
	
	@Override
	public List<Class> getAll() {
		return safeList(openSession().createNativeQuery(SQL_GET_ALL_CLASSES, Class.class));
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public List<ClassTotalAmountStudentDto> totalAmountStudent() {
		return safeList(openSession().createNativeQuery(SQL_TOTAL_AMOUNT_STUDENTS)
				.addScalar(ClassTotalAmountStudentDto.CLASS_NAME, StringType.INSTANCE)
				.addScalar(ClassTotalAmountStudentDto.CLASS_TOTAL_AMOUNT_STUDENT, IntegerType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ClassTotalAmountStudentDto.class)));
	}
}
