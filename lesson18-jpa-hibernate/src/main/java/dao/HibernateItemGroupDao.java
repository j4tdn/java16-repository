package dao;

import java.sql.PreparedStatement;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
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
	
	private static final String SQL_PARAM_ID = ":" + PARAM_ID;
	private static final String SQL_PARAM_NAME = ":" + PARAM_NAME;
	private static final String SQL_PARAM_DESC = ":" + PARAM_DESC;
	
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
			+ "VALUES( " + SQL_PARAM_ID + " ,  " + SQL_PARAM_NAME + " , " + SQL_PARAM_DESC + " )";
	
	public List<ItemGroup> getAll() {

		Session session = openSession();
		

		NativeQuery<ItemGroup> query = 
				session.createNativeQuery(GET_ALL_ITEM_GROUP, ItemGroup.class);
		

		List<ItemGroup> result = query.getResultList();
		
		return result;
	}
	
	@Override
	public ItemGroup get(int id) {
		Session session = openSession();
		// Cach 1 --> native query
		/*
		 NativeQuery<ItemGroup> query = session.createNativeQuery(GET_ITEM, ItemGroup.class);
		 
		 query.setParameter(PARAM_ID, id, IntegerType.INSTANCE);
		 
		 return query.uniqueResult();
		*/
		
		// Cach 2 --> built-in function of hibernate
		// Ap dung cho Entity --> session # get(eId), save(entity), update(entity), remove(entity)
		return session.get(ItemGroup.class, id);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public List<ItemGroupDto> statistic() {
		// B1: Tao session
		Session session = openSession();
		
		// B2: Tao native query --> createNativeQuery(sql)
		// luc compile chua khai bao KDL tra ve cho NativeQuery --> ?
		NativeQuery<?> query = session.createNativeQuery(STATISTIC);
		
		// B3: Neu co thi set parameter
		
		// B4: Mapping ket qua khi thuc hien native query vao KDL tra ve(dto)
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
	public void save(List<ItemGroup> itemGroups) {

		Session session = openSession();
		
		session.doWork(connection -> {
		PreparedStatement pst =	connection.prepareStatement(INSERT_ITEM_GROUP);
		int batchCount = 0;
		for (ItemGroup itemGroup: itemGroups) {
			pst.setInt(1,itemGroup.getId());
			pst.setString(2,itemGroup.getName());
			pst.setString(3,itemGroup.getDescription());
			pst.addBatch();
			if (++batchCount % BATCH_SIZE == 0) {
				pst.executeBatch();
			}
		}
		});
		
	}

}