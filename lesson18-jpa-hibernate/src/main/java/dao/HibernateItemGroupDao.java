package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import persistence.ItemGroup;

public class HibernateItemGroupDao extends HibernateAbstractDao implements ItemGroupDao {

	private static final String GET_ALL_ITEM_GROUP = "" + "SELECT * FROM ITEM_GROUP";

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

}
