package service;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;
import persistence.ItemDTO;
import persistence.ItemGroupDTO;

public interface ItemService {
	public List<ItemDTO> getAllItemWithTime(LocalDate date);
	
	
	public List<ItemGroupDTO> getAllItemGroupDTO();
	
	public List<String> getNameItem(int Year);
	
	public List<Item> getItems();
}
