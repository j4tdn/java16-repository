package dao;

import java.util.List;

import persistence.Item;

public class HibernateItemDao extends HibernateAbstractDao implements ItemDao {

	private static final String GET_ALL_ITEMS = "" 
			+ "SELECT * FROM ITEM";

	public List<Item> getAll() {
		return openSession()
				.createNativeQuery(GET_ALL_ITEMS, Item.class)
				.getResultList();
	}

	public void saveOrUpdate(Item item) {
		executeInTransaction(session -> session.saveOrUpdate(item));
		
	}

	

}
