package dao;

import java.sql.PreparedStatement;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import persistence.Item;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class HibernateItemGroupDao extends HibernateAbtractDao implements ItemGroupDao {

	private static final int BATCH_SIZE = 10;
	private static final String PARAM_ID = "pid";

	private static final String PARAM_NAME = "pname";
	private static final String PARAM_DESC = "pdesc";
	private static final String PARAM_ROW_COUNT = "p_round_count";

	private static final String SQL_PARAM_ID = ":" + PARAM_ID;
	private static final String SQL_PARAM_NAME = ":" + PARAM_NAME;
	private static final String SQL_PARAM_DESC = ":" + PARAM_DESC;
	private static final String SQL_PARAM_ROW_COUNT = ":" + PARAM_ROW_COUNT;

	private static final String GET_ALL_ITEM_GROUP = "" + "SELECT * FROM ITEM_GROUP";
	/*
	 * private static final String GET_ITEM = "" +
	 * "SELECT * FROM ITEM_GROUP WHERE ID = " + SQL_PARAM_ID;
	 */
	private static final String STATISTIC = "" + "SELECT ig.ID    " + ItemGroupDto.PROP_ID + ",\n" + "       ig.`NAME`"
			+ ItemGroupDto.PROP_NAME + ",\n" + "       SUM(id.AMOUNT)" + ItemGroupDto.PROP_AMOUNT + "\n"
			+ "   FROM ITEM_GROUP ig\n" + "   JOIN ITEM it\n" + "     ON ig.Id = it.ITEM_GROUP_ID\n"
			+ "   JOIN ITEM_DETAIL id\n" + "     ON it.ID = id.ITEM_ID\n" + "   GROUP BY ig.ID";

	private static final String INSERT_ITEM_GROUP = "" + "INSERT INTO ITEM_GROUP(ID, `NAME`, `DESC`)\n" + 
	"VALUES(?, ?, ?)";

	private static final String STORED_PRO_INST_ITEM_GROUP = ""
			+ "CALL P_INSERT_ITEM_GROUPS( " + SQL_PARAM_ROW_COUNT  + " )"; 

	
public List<ItemGroup> getAll() {
		// Bước 1: Lấy ra session factory, session

		Session session = openSession();

		// Bước 2: Từ session --> gọi hàm để truyền vào câu lệnh SQL rồi trả về Query

		NativeQuery<ItemGroup> query = session.createNativeQuery(GET_ALL_ITEM_GROUP, ItemGroup.class);

		// JDBC --> native sql
		// JPA/Hibernate --> JPQL/HQL

		// Bước 3: Dung query
		// truyền tham số nếu có
		// gọi truy vấn để trả về dữ liệu
		List<ItemGroup> result = query.getResultList();
		return result;
	}

	@Override
	public ItemGroup get(int id) {
		Session session = openSession();
		// Cách 1 --> native query

		/*
		 * NativeQuery<ItemGroup> query = session.createNativeQuery(GET_ITEM,
		 * ItemGroup.class); query.setParameter(PARAM_ID, id, IntegerType.INSTANCE);
		 */
		// return query.uniqueResult();

		// Cách 2 --> build-in function of hibernate
		// Áp dụng cho entity
		return session.get(ItemGroup.class, id);

	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<ItemGroupDto> statistic() {

		Session session = openSession();

		NativeQuery<?> query = session.createNativeQuery(STATISTIC);

		query.addScalar(ItemGroupDto.PROP_ID, IntegerType.INSTANCE);
		query.addScalar(ItemGroupDto.PROP_NAME, StringType.INSTANCE);
		query.addScalar(ItemGroupDto.PROP_AMOUNT, IntegerType.INSTANCE);
		query.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));

		return (List<ItemGroupDto>) query.getResultList();
	}

	@Override
	public void save(ItemGroup itemGroup) {

		/*
		 * Session session = openSession();
		 * 
		 * // before --> khởi tạo transaction
		 * 
		 * org.hibernate.Transaction transaction = session.beginTransaction();
		 * 
		 * try {// Cách 1 --> native query
		 * 
		 * NativeQuery<?> query = session.createNativeQuery(INSERT_ITEM_GROUP);
		 * 
		 * query.setParameter(PARAM_ID, itemGroup.getId(),IntegerType.INSTANCE);
		 * query.setParameter(PARAM_NAME, itemGroup.getName(),StringType.INSTANCE);
		 * query.setParameter(PARAM_DESC,
		 * itemGroup.getDescription(),StringType.INSTANCE);
		 * 
		 * int affectedRows = query.executeUpdate();
		 * System.out.println(">> LOG: affectedrows --> " + affectedRows);
		 * 
		 * // Cách 2 --> build-in function of hibernate
		 * 
		 * session.saveOrUpdate(itemGroup); transaction.commit(); } catch (Exception e)
		 * { e.printStackTrace(); transaction.rollback(); }
		 */
		executeInTransaction(session -> session.saveOrUpdate(itemGroup));
	}

	@Override
	public void save(List<ItemGroup> itemGroups) {

	
		executeInTransaction(session -> {
			session.doWork(connection -> {
				try {
					PreparedStatement pst =  connection.prepareStatement(INSERT_ITEM_GROUP);
				int batchCount = 0;
				for(ItemGroup itemGroup : itemGroups)
				{
					pst.setInt(1, itemGroup.getId());
					pst.setString(2, itemGroup.getName());
					pst.setString(3, itemGroup.getDescription());
				
					pst.addBatch();
					
					if(++batchCount % BATCH_SIZE == 0)
					{
						pst.executeBatch();
					}
				}
				pst.executeBatch();
				} catch (Exception e) {
					System.out.println("Exp -> " + e.getMessage());
				}
				
			});
		});
		
		
		
	}

	@Override
	public void saveNewestItemGroups(int nextNItemGroups) {

		executeInTransaction(session -> {
			session.createNativeQuery(STORED_PRO_INST_ITEM_GROUP)
			.setParameter(PARAM_ROW_COUNT, nextNItemGroups, IntegerType.INSTANCE)
			.executeUpdate();
			
		});
		
	}

	@Override
	public void demoHibernateCache() {
		Session session1 = openSession();
		
		Session session2 = openSession();
		
		ItemGroup ig1 =  session1.get(ItemGroup.class, 1);//Loading From Database
		System.out.println("ig1 --> " + ig1);

		ItemGroup ig2 =  session1.get(ItemGroup.class, 2);//Loading From Database
		System.out.println("ig2 --> " + ig2);

		
		ItemGroup ig3 =  session2.get(ItemGroup.class, 3);//Loading From Database
		System.out.println("ig3 --> " + ig3);

		ItemGroup ig4 =  session2.get(ItemGroup.class, 4);//Loading From Database
		System.out.println("ig4 --> " + ig4);

		
		ItemGroup ig5 =  session1.get(ItemGroup.class, 5);// Loading From 1st level cache of session 1
		System.out.println("ig5 --> " + ig5);

		ItemGroup ig6 =  session2.get(ItemGroup.class, 6);// Loading From 1st level cache of session 2
		System.out.println("ig6 --> " + ig6);
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
