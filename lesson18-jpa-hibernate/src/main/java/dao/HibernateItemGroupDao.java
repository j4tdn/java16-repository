package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class HibernateItemGroupDao extends HibernateAbtractDao implements ItemGroupDao{

	
	private static final String PARAM_ID = "pid";
	private static final String SQL_PARAM_ID =":" + PARAM_ID;
	private static final String GET_ALL_ITEM_GROUP = "" + "SELECT * FROM ITEM_GROUP";
	private static final String GET_ITEM = "" + "SELECT * FROM ITEM_GROUP WHERE ID = " + SQL_PARAM_ID;
	private static final String STATISTIC = ""
			+ "SELECT ig.ID    " + ItemGroupDto.PROP_ID + ",\n"
			+ "       ig.`NAME`" + ItemGroupDto.PROP_NAME + ",\n"
			+ "       SUM(id.AMOUNT)" + ItemGroupDto.PROP_AMOUNT + "\n"
			+ "   FROM ITEM_GROUP ig\n"
			+ "   JOIN ITEM it\n"
			+ "     ON ig.Id = it.ITEM_GROUP_ID\n"
			+ "   JOIN ITEM_DETAIL id\n"
			+ "     ON it.ID = id.ITEM_ID\n"
			+ "   GROUP BY ig.ID";
			
	
	public List<ItemGroup> getAll() {
		// Bước 1: Lấy ra session factory,  session
		
		Session session = openSession();
		
		
		// Bước 2: Từ session --> gọi hàm để truyền vào câu lệnh SQL rồi trả về Query
		
		 NativeQuery<ItemGroup> query =  
				 session.createNativeQuery(GET_ALL_ITEM_GROUP, ItemGroup.class);
		
		 
		 // JDBC --> native sql
		 // JPA/Hibernate --> JPQL/HQL
		 
		 // Bước 3: Dung query 
		 // truyền tham số nếu có
		 // gọi truy vấn để trả về dữ liệu
		 List<ItemGroup> result =  query.getResultList();
		 return result;
	}
	@Override
	public ItemGroup get(int id) {
		// Cách 1 --> native query
		Session session = openSession();
		NativeQuery<ItemGroup> query = 
				session.createNativeQuery(GET_ITEM, ItemGroup.class);
		query.setParameter(PARAM_ID, id, IntegerType.INSTANCE);
		
		// Cách 2 --> build-in function of hibernate
		return query.uniqueResult();
	}
	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<ItemGroupDto> statistic() {
		
		Session session = openSession();
		
		NativeQuery<?> query =  session.createNativeQuery(STATISTIC);
		
		query.addScalar(ItemGroupDto.PROP_ID, IntegerType.INSTANCE);
		query.addScalar(ItemGroupDto.PROP_NAME, StringType.INSTANCE);
		query.addScalar(ItemGroupDto.PROP_AMOUNT, IntegerType.INSTANCE);
		query.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));
		
		return (List<ItemGroupDto>)query.getResultList();
	}

}
