package dao;

import java.sql.PreparedStatement;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class HibernateItemGroupDao extends HibernateAbstractDao implements ItemGroupDao{
	
	private static final int BATCH_SIZE = 10;

	private static final String PARAM_ID = "pid";
	private static final String PARAM_NAME = "pname";
	private static final String PARAM_DESC = "pdesc";
	private static final String PARAM_ROW_COUNT = "p_round_count";
	
	private static final String SQL_PARAM_ID = ":" + PARAM_ID;
	private static final String SQL_PARAM_NAME = ":" + PARAM_NAME;
	private static final String SQL_PARAM_DESC = ":" + PARAM_DESC;
	private static final String SQL_PARAM_ROW_COUNT = ":" + PARAM_ROW_COUNT;
	
	private static final String GET_ALL_ITEM_GROUP = ""
			+ "SELECT * FROM ITEM_GROUP";
	
	private static final String GET_ITEM = ""
			+ "SELECT * FROM ITEM_GROUP WHERE ID = " + SQL_PARAM_ID;
	
	private static final String STATISTIC = ""
			+ "SELECT ig.ID          " + ItemGroupDto.PROP_ID + ",\n"
			+ "		  ig.`NAME`      " + ItemGroupDto.PROP_NAME + " ,\n"
			+ "       SUM(id.AMOUNT) " + ItemGroupDto.PROP_AMOUNT +  " \n"
			+ "      FROM ITEM_GROUP ig\n"
			+ "      JOIN ITEM it\n"
			+ "		ON ig.Id = it.ITEM_GROUP_ID\n"
			+ "	  JOIN ITEM_DETAIL id\n"
			+ "        ON it.ID = id.ITEM_ID\n"
			+ "	 GROUP BY ig.ID";
	
	private static final String INSERT_ITEM_GROUP = ""
			+ "INSERT INTO ITEM_GROUP(ID, NAME, `DESC`)\n"
			+ "VALUES(?, ?, ?)";
	
	private static final String STORED_PROCEDURE_INSERT_ITEM_GROUP = ""
			+ "CALL P_INSERT_ITEM_GROUP(" + SQL_PARAM_ROW_COUNT + ")";
	
	public List<ItemGroup> getAll() {
		// B1: Lấy ra session factory, session
		Session session = openSession();
		
		// B2: Từ session --> gọi hàm để truyền vào câu lệnh SQL
		// rồi trả về đối tượng Query(NativeQuery, JPQL/HQL, @NamedQuery)
		// Lưu ý: Tự động mapping, 
		//        Vì mình đã có mapping table item_group với class ItemGroup rồi
		NativeQuery<ItemGroup> query = 
				session.createNativeQuery(GET_ALL_ITEM_GROUP, ItemGroup.class);
		
		// JDBC --> native sql
		// JPA/Hibernate --> JPQL/HQL
		
		// B3: Dùng query
		// --> truyền tham số nếu có
		// --> gọi truy vấn để trả về dữ liệu
		List<ItemGroup> result = query.getResultList();
		
		return result;
	}
	
	@Override
	public ItemGroup get(int id) {
		Session session = openSession();
		// Cách 1 --> native query
		/*
		 NativeQuery<ItemGroup> query = session.createNativeQuery(GET_ITEM, ItemGroup.class);
		 
		 query.setParameter(PARAM_ID, id, IntegerType.INSTANCE);
		 
		 return query.uniqueResult();
		*/
		
		// Cách 2 --> built-in function of hibernate
		// Áp dụng cho Entity --> session # get(eId), save(entity), update(entity), remove(entity)
		return session.get(ItemGroup.class, id);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public List<ItemGroupDto> statistic() {
		// B1: Tạo session
		Session session = openSession();
		
		// B2: Tạo native query --> createNativeQuery(sql)
		// lúc compile chưa khai báo KDL trả về cho NativeQuery --> ?
		NativeQuery<?> query = session.createNativeQuery(STATISTIC);
		
		// B3: Nếu có thì set parameter
		
		// B4: Mapping kết quả khi thực hiện native query vào KDL trả về(dto)
		// --> jpa/hibernate --> transformer
		query.addScalar(ItemGroupDto.PROP_ID, IntegerType.INSTANCE)
			 .addScalar(ItemGroupDto.PROP_NAME, StringType.INSTANCE)
		     .addScalar(ItemGroupDto.PROP_AMOUNT, IntegerType.INSTANCE)
		     .setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));
		
		// ig.ID ItemGroupDto.PROP_ID
		// query.addScalar(ItemGroupDto.PROP_ID, IntegerType.INSTANCE);
		// rs.getInt(ItemGroupDto.PROP_ID)
		
		return safeList(query);
	}
	
	@Override
	public void save(ItemGroup itemGroup) {
		/*Session session = openSession();
		
		// before --> khởi tạo transaction
		Transaction transaction = session.beginTransaction();
		
		try {
			// Thực hiện truy vấn insert/update/delete
			// Cách 1 --> native query
			NativeQuery<?> query = session.createNativeQuery(INSERT_ITEM_GROUP);
			
			query.setParameter(PARAM_ID, itemGroup.getId(), IntegerType.INSTANCE)
				 .setParameter(PARAM_NAME, itemGroup.getName(), StringType.INSTANCE)
				 .setParameter(PARAM_DESC, itemGroup.getDescription(), StringType.INSTANCE);
			
			int affectedRows = query.executeUpdate();
			
			System.out.println(">> LOG: affected rows --> " + affectedRows);
			
			// Cách 2 --> built-in function of hibernate
			// session.saveOrUpdate(itemGroup);
			
			// after --> commit transaction nếu thực hiện thành công
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			
			// after --> rollback transaction nếu thực hiện thất bại
			transaction.rollback();
		}*/
		
		// Tổng kết --> truy vấn với transaction
		executeInTransaction(session -> session.saveOrUpdate(itemGroup));
	}
	
	@Override
	public void save(List<ItemGroup> itemGroups) {
		
		executeInTransaction(session -> {
			session.doWork(connection -> {
				try {
					PreparedStatement pst = connection.prepareStatement(INSERT_ITEM_GROUP);
					int batchCount = 0;
					for (ItemGroup itemGroup : itemGroups) {
						pst.setInt(1, itemGroup.getId());
						pst.setString(2, itemGroup.getName());
						pst.setString(3, itemGroup.getDescription());
						pst.addBatch();
						if(++batchCount % BATCH_SIZE == 0) {
							pst.executeBatch();
						}
					}
					pst.executeBatch();
				} catch (Exception e) {
					System.out.println("-----------------------------");
				}
			});
		});		
	}
	
	@Override
	public void saveNewestItemGroup(int nextNItemGroup) {
		executeInTransaction(session -> {
			session.createNativeQuery(STORED_PROCEDURE_INSERT_ITEM_GROUP)
				.setParameter(PARAM_ROW_COUNT, nextNItemGroup, IntegerType.INSTANCE)
				.executeUpdate();
		});
	}
	
	@Override
	public void demoHibernateCatch() {
		Session session1 = openSession();
		Session session2 = openSession();
		
		ItemGroup ig1 = session1.get(ItemGroup.class, 104); // Loading From Database
		System.out.println("ig1 --> " + ig1);
		
		ItemGroup ig2 = session1.get(ItemGroup.class, 105); // Loading From Database
		System.out.println("ig2 --> " + ig2);

		
		ItemGroup ig3 = session2.get(ItemGroup.class, 104); // Loading From Database
		System.out.println("ig3 --> " + ig3);

		ItemGroup ig4 = session2.get(ItemGroup.class, 105); // Loading From Database
		System.out.println("ig4 --> " + ig4);
		
		session1.evict(ig2);
		session2.clear(); // ig3, ig4

		
		ItemGroup ig5 = session1.get(ItemGroup.class, 104); // Loading From 1st Level Catch Of Session 1
		System.out.println("ig5 --> " + ig5);

		ItemGroup ig6 = session2.get(ItemGroup.class, 105); // Loading From 2st Level Catch Of Session 2
		System.out.println("ig6 --> " + ig6);

		
	}
	
	
}