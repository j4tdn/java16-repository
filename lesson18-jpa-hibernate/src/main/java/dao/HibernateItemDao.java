package dao;

import java.util.List;

import persistence.Item;

public class HibernateItemDao extends HibernateAbstractDao implements ItemDao {
	private static final String GET_ALL_ITEMS = ""
				+ "SELECT * FROM ITEM";
	@Override
	public List<Item> getAll() {
		// TODO Auto-generated method stub
		return openSession().createNativeQuery(GET_ALL_ITEMS, Item.class).getResultList();
	}
	
}
