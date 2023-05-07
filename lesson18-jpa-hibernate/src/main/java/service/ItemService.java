package service;

import java.util.List;

import persistence.Item;
import persistence.ItemGroup;

public interface ItemService {
	List<Item> getAll();
	
	void saveOrUpdate(Item item);
}
