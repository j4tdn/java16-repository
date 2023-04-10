package service;

import java.time.LocalDate;
import java.util.List;

import bean.Item;

public interface ItemService {
	List<Item> getAll();
	
	List<Item> getItems();
	
	List<Item> getItems(LocalDate sellDate);

}
