package service;

import java.time.LocalDate;
import java.util.List;

import bean.Item;
import dto.ItemDto;

public interface ItemService {
	List<Item> getAll();
	
	List<Item> getItems();
	
	List<Item> getItems(LocalDate sellDate);
	
	List<ItemDto> statisticItemsPerItemGroup();
}
