package dao;

import java.time.LocalDate;
import java.util.List;

import bean.ItemDTO;
import bean.ItemDTOByItemGroup;

public interface ItemDao {

	List<ItemDTO> getItemsbyDate(LocalDate deliveryOrder);
	List<ItemDTO> getTop3Items(Integer year);
	List<ItemDTOByItemGroup> getItemsByIG();
	
	
}
