package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;

import persistence.ClassDto;

public class HibernateClassDao extends HibernateAbstractDao implements ClassDao{
	
	private static final String COUNT_AMOUNT = ""
			+ "select c.id, c.`name` , count(*) numStudents  \n"
			+ "from class c  \n"
			+ "join student s  \n"
			+ "on c.id = s.class_id  \n"
			+ "group by c.id;";

	@Override
	public List<ClassDto> countAmount() {
		Session session = openSession();
		NativeQuery<?> query = session.createNativeQuery(COUNT_AMOUNT);

		query.addScalar("id");
		query.addScalar("name");
		query.addScalar("numStudents");
		query.setResultTransformer(Transformers.aliasToBean(ClassDto.class));
		return safeList(query);
	}
	
}
