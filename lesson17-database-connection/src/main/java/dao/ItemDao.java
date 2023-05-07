package dao;

import java.time.LocalDate;
import java.util.List;

import bean.Item;
import dto.ItemDto;

public interface ItemDao {
	List<Item> getAll();
	
	List<Item> getItems();
	
	List<Item> getItems(LocalDate sellDate);
	
	List<ItemDto> statisticItemsPerItemGroup();
}
