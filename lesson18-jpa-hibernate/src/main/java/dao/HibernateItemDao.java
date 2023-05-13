package dao;

import java.util.List;

import persistence.Item;

public class HibernateItemDao extends HibernateAbtractDao implements ItemDao{

	private static final String GET_ALL_ITEMS = ""
			+ "SELECT  * FROM ITEM";
	@Override
	public List<Item> getALl() {
		
		return openSession().createNativeQuery(GET_ALL_ITEMS, Item.class)
				.getResultList();
	}
	@Override
	public void saveOrUpdate(Item item) {
 		 executeInTransaction(session -> session.saveOrUpdate(item));
	}

}
