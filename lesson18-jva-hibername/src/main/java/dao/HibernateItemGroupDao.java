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
//import persistence.ItemGroupDto;

public class HibernateItemGroupDao extends HibernateAbstractDao implements ItemGroupDao{
	
	private static final int BATCH_SIZE =10;
	
	private static final String PARAM_ID = "pid";//câu 2
	private static final String PARAM_NAME = "pname";
	private static final String PARAM_DESC = "pdesc";
	
	
	private static final String SQL_PARAM_ID = ":" + PARAM_ID;//câu 2
	private static final String SQL_PARAM_NAME = ":" + PARAM_NAME;
	private static final String SQL_PARAM_DESC = ":" + PARAM_DESC;
	
	
	private static final String GETT_ALL_ITEM_GROUP = ""    //Câu 1:Liệt kê tất cả các loại hàng 
			+ "SELECT * FROM ITEM_GROUP";
	
	private static final String GET_ITEM = ""               ////câu 2: Liệt kê tất cả các loại hàng [theo MaLoai]
			+ "SELECT * FROM ITEM_GROUP WHERE ID = " + SQL_PARAM_ID;
	

	private static final String STATISTIC =""
			+ "SELECT ig.ID     "+ ItemGroupDto.PROP_ID + ", \n"
			+ "ig.`NAME`        " + ItemGroupDto.PROP_NAME + ", \n"
			+ "SUM(id.AMOUNT)   " + ItemGroupDto.PROP_AMOUNT + " \n"
			+ " FROM ITEM_GROUP ig   \n"
			+ "JOIN ITEM it \n"
			+ "ON ig.ID = it.ITEM_GROUP_ID \n"
			+ "JOIN ITEM_DETAIL id \n"
			+ "ON it.id =id.ITEM_ID \n"
			+ "GROUP BY ig.ID";
	
	private static final String INSERT_ITEM_GROUP = ""
			+ "INSERT INTO ITEM_GROUP(ID, NAME, `DESC`)\n"
			+ "VALUES(  ? , ? , ? )";//" + SQL_PARAM_ID + " , " + SQL_PARAM_NAME + " , " + SQL_PARAM_DESC + "
	
	public List<ItemGroup> getAll() {
		//B1: Lấy ra session factory
		Session session = openSession();
		
		//B2: từ session --> gọi hàm để truyền vào câu lệnh Sql 
		//rồi trả về đối tượng Query
		//Query có nhiều dạng : NativeQuery, JPQL/Hibernate Query language(HQL)
		//Lưu ý: tự động Mapping vì mình đã mapping table ITEM_GROUP với
		// class ItemGroup rồi
		
		
		NativeQuery<ItemGroup> query = 
				session.createNativeQuery(GETT_ALL_ITEM_GROUP,ItemGroup.class);
		//chỉ dùng function này khi câu truy vấn của nó trả về 1 entity(ItemGroup.class)
		
		//JDBC: NATIVE SQL
		//JPA/Hibernate --> JPQL/Hibernate Query language(HQL): kết nối tới bất kỳ hệ quản trị
		//cơ sở dữ liệu nào cũng được
		
		//B3: dùng query
		//-->truyền tham số nếu có
		//-->gọi truy vấn để trả lại dữ liệu
		
		List<ItemGroup> result = query.getResultList();
		
		return result;
		
	}
	
	@Override
	public ItemGroup get(int id) {  //câu 2: Liệt kê tất cả các loại hàng [theo MaLoai]
		Session session = openSession();
		//Cách 1 : dùng native query
		/*
		 * 
		
		
		NativeQuery<ItemGroup> query = 
				session.createNativeQuery(GET_ITEM, ItemGroup.class);
		
		query.setParameter(PARAM_ID, id, IntegerType.INSTANCE);
		
				return query.uniqueResult();      // lấy 1 phần tử
		 */

		
		//Cách 2 --> built-in function of hibernate
		//chỉ áp dụng cho Entity --> session # get(eId), Save(Entity), Update(Entity), Remove(Entity)
		return session.get(ItemGroup.class, id);
		
	}
	

	@SuppressWarnings({ "deprecation"})
	@Override
	public List<ItemGroupDto> statistic() { //câu 5: code 3 bảng không trả về entity(DTO)
		// B1: tạo session
		Session session = openSession();
		
		//b2: TẠO NATIVE QUERY --> createNativeQuery(sql)
		//lúc compile chưa khai báo KDL trả về cho NativeQuery -->?
		NativeQuery<?> query = session.createNativeQuery(STATISTIC);
		
		//B3 nếu có thì set parameter
		//B4 Mapping kết quả khi thực hiện native query vào kiểu dữ liệu trả về (DTO)
		//Tương tự transformer
		
		query.addScalar(ItemGroupDto.PROP_ID, IntegerType.INSTANCE)
		     .addScalar(ItemGroupDto.PROP_NAME, StringType.INSTANCE)
		     .addScalar(ItemGroupDto.PROP_AMOUNT, IntegerType.INSTANCE)
		     .setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class));
		
		
		return safeList(query);
	}
	
	@Override
	public void save(ItemGroup itemGroup) {
		// Cách 1 --> native query
		/*
		Session session = openSession();
		
		//before --> khởi tạo transaction
		Transaction transaction = session.beginTransaction();
		
		try {
//            NativeQuery<?> query = session.createNativeQuery(INSERT_ITEM_GROUP);
//			
//			query.setParameter(PARAM_ID, itemGroup.getId(), IntegerType.INSTANCE)
//				 .setParameter(PARAM_NAME, itemGroup.getName(), StringType.INSTANCE)
//				 .setParameter(PARAM_DESC, itemGroup.getDescription(), StringType.INSTANCE);
//			
//			int affectedRows = query.executeUpdate();
//			
//			System.out.println(">> LOG: affected rows --> " + affectedRows);
		
			// Cách 2 --> built-in function of hibernate
			session.saveOrUpdate(itemGroup);
			//after --> commit transaction nếu thực hiện thành công
		transaction.commit();
		} catch (Exception e) {

			e.printStackTrace();
			//after --> rollback transaction nếu thực hiện thất bại
			transaction.rollback();
		}
		*/
		executeInTransaction(session ->{
			session.saveOrUpdate(itemGroup);
		});
		

				
		
	}
	@Override
	public void save(List<ItemGroup> itemGroups) {//Câu 7: Thêm mới danh sách Loại Hàng(batch update
		
		//
		
		//sessiom-->connection--> jdbc
		executeInTransaction(session ->{
			session.doWork(connection -> {
				PreparedStatement pst = connection.prepareStatement( INSERT_ITEM_GROUP);
				int batchCount =0;
				for(ItemGroup itemGroup : itemGroups) {
					pst.setInt(1, itemGroup.getId());
					pst.setString(2, itemGroup.getName());
					pst.setString(3, itemGroup.getDescription());
					pst.addBatch();
					if(++batchCount % BATCH_SIZE ==0) {
						pst.executeBatch();
					}
				}
				pst.executeBatch();
			});
		});
		
	}
	
}