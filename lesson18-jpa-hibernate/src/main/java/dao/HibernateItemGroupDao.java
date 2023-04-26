package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class HibernateItemGroupDao extends HibernateAbstractDao implements ItemGroupDao {
	
	private static final String PARAM_ID = "pid";
	private static final String SQL_PARAM_ID = ":" + PARAM_ID;
	
	private static final String GET_ALL_ITEM_GROUP = ""
			+ "SELECT * FROM ITEM_GROUP";
	
	private static final String GET_ITEM = ""
			+ "SELECT * FROM ITEM_GROUP WHERE ID = " + SQL_PARAM_ID;
	
	private static final String STATISTIC = ""
			+ "SELECT IG.ID "          + ItemGroupDto.PROP_ID + ",\n"
			+ "       IG.`NAME` "      + ItemGroupDto.PROP_NAME + ",\n"
			+ "       SUM(ID.AMOUNT) " + ItemGroupDto.PROP_AMOUNT + " \n"
			+ "     FROM ITEM_GROUP IG\n"
			+ "     JOIN ITEM IT\n"
			+ "       ON IG.ID = IT.ITEM_GROUP_ID\n"
			+ "	 JOIN ITEM_DETAIL ID\n"
			+ "       ON IT.ID = ID.ITEM_ID\n"
			+ "	GROUP BY IG.ID;";

	public List<ItemGroup> getAll() {
		// B1: Lấy ra session factory, session
		Session session = openSession();
		
		// B2: Từ session --> gọi hàm để truyền vào câu lệnh SQL
		// rồi trả về đối tượng Query(NativeQuery, JPQL/HQL)
		// Lưu ý: Tự động mapping, 
		//        vì mình đã có mapping cái table item_group với cái class ItemGroup
		NativeQuery<ItemGroup> query = 
				                       session.createNativeQuery(GET_ALL_ITEM_GROUP, ItemGroup.class);
		
		// JDBC --> native sql
		// JPA/Hibernate --> JPQL/HQL
		
		// B3: Dùng query
		// --> truyền tham số nếu có
		// --> gọi truy vấn trả về data
		
		List<ItemGroup> result = query.getResultList();
		
		return result;
	}
	
	@Override
	public ItemGroup get(int id) {
		// Cách 1 --> native query
		Session session = openSession();
		
		NativeQuery<ItemGroup> query = 
				                      session.createNativeQuery(GET_ITEM, ItemGroup.class);
		
		query.setParameter(PARAM_ID, id, IntegerType.INSTANCE);
		
		// Cách 2 --> built-in function of hibernate
		return query.uniqueResult();
	}
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<ItemGroupDto> statistic() {
		// B1: Create Session
		Session session = openSession();
		
		// B2: Create native query --> createNativeQuery(sql)
		// lúc compile chưa khai báo KDL trả về cho NativeQuery --> ?
		
		NativeQuery<?> query = session.createNativeQuery(STATISTIC);
		
		// B3: Nếu có thì set parameter
		// B4: Mapping kết quả khi thực hiện native query vào KDL trả về(dto)
		// --> jpa/hibernate --> transfomer
		
		query.addScalar(ItemGroupDto.PROP_ID, IntegerType.INSTANCE);
		query.addScalar(ItemGroupDto.PROP_NAME, StringType.INSTANCE);
		query.addScalar(ItemGroupDto.PROP_AMOUNT, IntegerType.INSTANCE);
		query.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));
		
		// igID ItemGroupDto.PROP_ID
		// query.addScalar(ItemGroupDto.PROP_ID, IntegerType.INSTANCE);
		// rs.getInt(ItemGroupDto.PROP_ID)
		
		return (List<ItemGroupDto>)query.getResultList();
	}
	
}
