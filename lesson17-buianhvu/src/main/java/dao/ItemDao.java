package dao;

import java.time.LocalDate;
import java.util.List;

import bean.Item;

public interface ItemDao {
	List<Item> getAll();
	
	List<Item> getItems();

	List<Item> getItems(LocalDate sellDate);
	
	List<Item> listItemsSoldOnDate(LocalDate date);
	
	
}