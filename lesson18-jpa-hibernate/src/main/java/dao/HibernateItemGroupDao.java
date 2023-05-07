package dao;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class HibernateItemGroupDao extends HibernateAbstractDao implements ItemGroupDao {
	
	private static final String PARAM_ID = "pid"	;
	private static final String PARAM_NAME = "pname";
	private static final String PARAM_DESC = "pdesc";
	
	private static final String SQL_PARAM_ID = ":" + PARAM_ID;
	private static final String SQL_PARAM_NAME = ":" + PARAM_NAME;
	private static final String SQL_PARAM_DESC = ":" + PARAM_DESC;
	
	private static final String GET_ALL_ITEM_GROUP = ""
			+ "SELECT * FROM ITEM_GROUP";
	
//	private static final String GET_ITEM = ""
//			+ "SELECT * FROM ITEM_GROUP WHERE ID = " + SQL_PARAM_ID;
	
	private static final String INSERT_ITEM_GROUP = ""
			+ "INSERT INTO ITEM_GROUP (ID, `NAME`, `DESC`) \n"
			+ "VALUES ( " + SQL_PARAM_ID + " , " + SQL_PARAM_NAME + " , " + SQL_PARAM_DESC + " )";
	
	private static final String STATISTIC = ""
			+ "SELECT 	ig.ID 			" + ItemGroupDto.PROP_ID + " ,\n"
			+ "			ig.`NAME` 		" + ItemGroupDto.PROP_NAME + " ,\n"
			+ "        	SUM(id.AMOUNT) 	" + ItemGroupDto.PROP_AMOUNT + " \n"
			+ "  FROM	ITEM_GROUP ig\n"
			+ "  JOIN 	ITEM it\n"
			+ "	   ON 	ig.Id = it.ITEM_GROUP_ID\n"
			+ "  JOIN 	ITEM_DETAIL id\n"
			+ "	   ON 	it.ID = id.ITEM_ID\n"
			+ "GROUP BY ig.ID";
	
	public List<ItemGroup> getAll() {
		//B1: lấy session
		Session session = openSession();
		//B2: từ session -> gọi hàm để truyền câu lệnh SQL rồi trả về đối tượng Query
		NativeQuery<ItemGroup> query =
				session.createNativeQuery(GET_ALL_ITEM_GROUP, ItemGroup.class);
			
		
		//B3 dufng query
		// truyen tham so neu co
		// goi truy van de tra ve ket qua du lieu
		List<ItemGroup> result = query.getResultList();
		return result;
	}
	
	@Override
	public ItemGroup get(int id) {
		// option 1: native query
		Session session = openSession();
		
//		NativeQuery<ItemGroup> query =
//				session.createNativeQuery(GET_ITEM, ItemGroup.class);
//		
//		query.setParameter(PARAM_ID, id, IntegerType.INSTANCE);
//		
//		return query.uniqueResult();
		
		//=======================]
		
		//option 2: built-in function of hibernate
		// chỉ áp dụng cho Entity --> get(eId), save(entity), update(entity), remove(entity)
		return session.get(ItemGroup.class, id);
	}
	

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<ItemGroupDto> statistic() {
		//B1: tạo session
		Session session = openSession();
		
		//B2: tạo Native Query --> createNativeQuery(sql)
		//Lúc compile chưa khai báo KDL trả về cho NativeQuery --> ? 
		NativeQuery<?> query = session.createNativeQuery(STATISTIC);
		
		//B3: nếu có thì set parameter
		
		//B4: Mapping kết quả khi thực hiện native query vào KDL trả về(dto)
		// JPA/Hibernate --> tranformer
		query.addScalar(ItemGroupDto.PROP_ID, IntegerType.INSTANCE);
		query.addScalar(ItemGroupDto.PROP_NAME, StringType.INSTANCE);
		query.addScalar(ItemGroupDto.PROP_AMOUNT, IntegerType.INSTANCE);
		query.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));
		
		return (List<ItemGroupDto>)query.getResultList();
	}
	
	@Override
	public void save(ItemGroup itemGroup) {
		/*Session session = openSession();
		// before --> khởi tạo transaction
		org.hibernate.Transaction transaction = session.beginTransaction();
		
		try {
			//Thực hiện truy vấn insert/update/delete
			//option 1: native query
//			NativeQuery<ItemGroup> query = 	
//					session.createNativeQuery(INSERT_ITEM_GROUP);
//			
//			query.setParameter(PARAM_ID, itemGroup.getId(), IntegerType.INSTANCE)
//				 .setParameter(PARAM_NAME, itemGroup.getName(), StringType.INSTANCE)
//				 .setParameter(PARAM_DESC, itemGroup.getDescription(), StringType.INSTANCE);
//			
//			int affetectedRows = query.executeUpdate();
//			System.out.println(">> LOG: affected rows --> " + affetectedRows);	
			
			
			//=============
			//option 2: built-in function of hibernate
			session.saveOrUpdate(itemGroup);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			
			//after --> rollback
			transaction.rollback();
		}*/
		executeIntransaction(session -> session.saveOrUpdate(itemGroup));
		
	}
}
