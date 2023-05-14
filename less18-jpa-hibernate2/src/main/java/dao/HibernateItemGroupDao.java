package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class HibernateItemGroupDao extends HibernateAbstractDao implements ItemGroupDao {

	private static final String PARAM_ID = "pid";
	private static final String PARAM_NAME = "pname";
	private static final String PARAM_DESC = "pdesc";

	private static final String SQL_PARAM_ID = ":" + PARAM_ID;
	private static final String SQL_PARAM_NAME = ":" + PARAM_NAME;
	private static final String SQL_PARAM_DESC = ":" + PARAM_DESC;

	private static final String GET_ALL_ITEM_GROUP = "" + "SELECT * FROM ITEM_GROUP";

	private static final String GET_ITEM = "" + "SELECT * FROM ITEM_GROUP WHERE ID = " + SQL_PARAM_ID;

	private static final String INSERT_ITEM_GROUP = "" + "INSERT INTO ITEM_GROUP(ID,NAME,`DESC`)\n" + "VALUES ("
			+ SQL_PARAM_ID + ", " + SQL_PARAM_NAME + " ," + SQL_PARAM_DESC + ")";

	private static final String STATISTIC = "" + "SELECT ig.ID " + ItemGroupDto.PROP_ID + ",\n" + "		ig.`NAME`"
			+ ItemGroupDto.PROP_NAME + ",\n" + "        SUM(id.AMOUNT)" + ItemGroupDto.PROP_AMOUNT + "\n"
			+ "FROM item_group ig \n" + "join item it \n" + "on ig.ID = it.ITEM_GROUP_ID\n" + "join item_detail id\n"
			+ "on it.ID = id.ITEM_ID\n" + "GROUP BY ig.ID";

	public List<ItemGroup> getAll() {
		// B1 : Lấy ra session factory , session

		Session session = openSession();

		// B2: Từ session --> gọi hàm để truyền vào câu lệnh SQL
		// rồi trả về đối tượng Query

		// Lưu ý : tự động mapping vì mình đã có mapping
		// table item_group với class Item_group rồi
		NativeQuery<ItemGroup> query = session.createNativeQuery(GET_ALL_ITEM_GROUP, ItemGroup.class);

		List<ItemGroup> result = query.getResultList();

		return result;
	}

	@Override
	public ItemGroup get(int id) {
		/*
		 * Session session = openSession();
		 * 
		 * NativeQuery<ItemGroup> query = session.createNativeQuery(GET_ITEM,
		 * ItemGroup.class); query.setParameter(PARAM_ID, id, IntegerType.INSTANCE);
		 * return query.uniqueResult();
		 */
		
		
		//Cách 2 : built in function in hibernate 
		// Áp dụng cho Entity --> session # get( eId), save(entity), update (entity) remove (entity) 
		Session session = openSession();
		return session.get(ItemGroup.class, id);
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<ItemGroupDto> statistic() {
		// B1 : Tạo sesion

		Session session = openSession();

		// B2 : Tao native query
		NativeQuery<?> query = session.createNativeQuery(STATISTIC);

		// B3 : Nếu có thì set parameter

		// B4 : mapping kết quả khi thực hiên native query vào KDL trả về (dto)
		// --> jpa/hibernate --> transformer

		query.addScalar(ItemGroupDto.PROP_ID, IntegerType.INSTANCE)
				.addScalar(ItemGroupDto.PROP_NAME, StringType.INSTANCE)
				.addScalar(ItemGroupDto.PROP_AMOUNT, IntegerType.INSTANCE)

				.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));

		return safeList(query);
	}

	@Override
	public void save(ItemGroup itemGroup) {
		/*
		Session session = openSession();
		
		//before --> Khởi tạo transaction 
		Transaction transaction = session.beginTransaction();

		try {
			// thực hiện truy vấn insert/update/delete
			//Cách 1 : create nativeQuery
			NativeQuery<?> query = session.createNativeQuery(INSERT_ITEM_GROUP);

			query.setParameter(PARAM_ID, itemGroup.getId(), IntegerType.INSTANCE)
					.setParameter(PARAM_NAME, itemGroup.getName(), StringType.INSTANCE)
					.setParameter(PARAM_DESC, itemGroup.getDescription(), StringType.INSTANCE);

			int affectedRows = query.executeUpdate();

			System.out.println(">>>> LOG : affected Row --> " + affectedRows);
			
			
			//Cách 2 : built in function of hibernate 
			session.saveOrUpdate(itemGroup);

			// After --> commit transaction nếu thực hiện thành công
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();

			// After --> rollback transaction nếu thực hiện thất bại
			transaction.rollback();
		}*/
		// Tổng kết --> truy vấn tới transaction 
		executeInTransacton(session -> {
			session.saveOrUpdate(itemGroup);
		});
	}

}
