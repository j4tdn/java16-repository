package service;

import java.util.List;

import bean.Item;

public interface ItemService {
	List<Item> getAll();
	
	List<Item> getElements(int igId);
}
