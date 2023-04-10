package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;
import persistence.ItemDTO;
import persistence.ItemGroupDTO;

public interface ItemDao {
	public List<ItemDTO> getAllItemWithTime(LocalDate date);

	public List<ItemGroupDTO> getAllItemGroupDTO();

	public List<Item> getItems();
}
