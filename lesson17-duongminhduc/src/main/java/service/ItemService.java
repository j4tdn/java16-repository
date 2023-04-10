package service;

import java.time.LocalDate;
import java.util.List;

import bean.ItemDTO;
import bean.ItemDTOByItemGroup;



public interface ItemService {
	List<ItemDTO> getItemsbyDate(LocalDate deliveryOrder);
	List<String> getTop3Items(Integer year);
	List<ItemDTOByItemGroup> getItemsByIG();
}