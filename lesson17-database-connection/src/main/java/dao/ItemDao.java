package dao;

import java.util.List;

import bean.Item;

public interface ItemDao {
	List<Item> getAll();
	
	List <Item> getItems();
}
