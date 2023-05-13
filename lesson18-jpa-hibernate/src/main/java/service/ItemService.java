package service;

import java.util.List;

import persistence.Item;

public interface ItemService {

	List<Item> getALl();
	void saveOrUpdate(Item item);
}
