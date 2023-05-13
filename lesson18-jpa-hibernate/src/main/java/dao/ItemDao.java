package dao;

import java.util.List;

import persistence.Item;

public interface ItemDao {

	List<Item> getALl();
	
	void saveOrUpdate(Item item);
}
