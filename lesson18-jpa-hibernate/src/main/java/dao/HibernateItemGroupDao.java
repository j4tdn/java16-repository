package dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class HibernateItemGroupDao extends HibernateAbstractDao implements ItemGroupDao {
	private static final String PARAM_ID = "pid";
	private static final String PARAM_NAME = "pname";
	private static final String PARAM_DESC = "pdesc";
	
	private static final String SQL_PARAM_ID = ":" + PARAM_ID;
	private static final String SQL_PARAM_NAME = ":" + PARAM_NAME;
	private static final String SQL_PARAM_DESC = ":" + PARAM_DESC;
	
	private static final String GET_ALL_ITEM_GROUP = ""
				+ "SELECT * FROM ITEM_GROUP";

	private static final String GET_ITEM = ""
				+ "SELECT *FROM ITEM_GROUP WHERE ID = " + SQL_PARAM_ID;
	
	private static final String STATISTIC = ""
			+"SELECT ig.ID 			" + ItemGroupDto.PROP_ID 	 + ",\n"
			+"		 ig.`NAME` 		" + ItemGroupDto.PROP_NAME   + ",\n"
			+"		 SUM(id.AMOUNT) " + ItemGroupDto.PROP_AMOUNT + ",\n"
			+"FROM ITEM_GROUP ig\n"
			+"JOIN ITEM it\n"
			+"ON ig.ID = it.ITEM_GROUP_ID\n"
			+"JOIN ITEM_DETAIL id\n"
			+"ON it.ID = id.ITEM_ID\n"
			+"GROUP BY ig.ID";
	
	
	private static final String INSERT_ITEM_GROUP = ""
			+"INSERT INTO ITEM_GROUP(ID, `NAME`, `DESC`)\n"
			+"VALUES( " + SQL_PARAM_ID + " ," + SQL_PARAM_NAME + "," + SQL_PARAM_DESC + ")";
	public List<ItemGroup> getAll() {
		//B1: Lấy ra session factory, session
		Session session = openSession();
		//B2: từ session gọi hàm để truyền câu lệnh sql rồi trả về đối tượng query
		NativeQuery<ItemGroup> query = session.createNativeQuery(GET_ALL_ITEM_GROUP , ItemGroup.class);
		//B3: dùngq query truyền tham số g--> gọi truy vấn để trả về cơ sở dữ liệu
		List<ItemGroup> result = query.getResultList();
		return result;
	}

	@Override
	public ItemGroup get(int id) {
		// cách 1 --> native query
		Session session = openSession();
//		NativeQuery<ItemGroup> query = session.createNativeQuery(GET_ITEM, ItemGroup.class);
//		query.setParameter(PARAM_ID, id);
		
		return session.get(ItemGroup.class, id);
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<ItemGroupDto> statistic() {
		// B1: tạo session
		Session session = openSession();
		// B2: tạo native query
		NativeQuery<?> query = session.createNativeQuery(STATISTIC);
		query.addScalar(ItemGroupDto.PROP_ID)
			 .addScalar(ItemGroupDto.PROP_NAME)
			 .addScalar(ItemGroupDto.PROP_AMOUNT)
			 .setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));
		return safeList(null);
	}

	
	@Override
	public void save(ItemGroup itemGroup) {
		// Cách 1 : native query
		//Session session = openSession();
		// before: khởi tạo transaction
		/*Transaction transaction = session.beginTransaction();
		try {
//			NativeQuery<?> query = session.createNativeQuery(INSERT_ITEM_GROUP);
//			query.setParameter(PARAM_ID, itemGroup.getId(), StandardBasicTypes.INTEGER)
//				 .setParameter(PARAM_NAME, itemGroup.getName(), StandardBasicTypes.STRING)
//				 .setParameter(PARAM_DESC, itemGroup.getDescription(), StandardBasicTypes.STRING);
//			int affectedRows =query.executeUpdate();
			//System.out.println(">> LOG: affected rows -->" + affectedRows);
			// Cách 2 --> built in function in hibernate
			session.saveOrUpdate(itemGroup);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			// after nếu thất bại
			transaction.rollback();
		}*/
		excecuteInTransaction(se -> {
			se.saveOrUpdate(itemGroup);
		});
		
	}

}
