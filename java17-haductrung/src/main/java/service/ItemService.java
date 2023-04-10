package service;

import java.time.LocalDate;
import java.util.List;

import bean.ItemDto;

public interface ItemService {
	
	List<ItemDto> getItemsbyDate(LocalDate deliveryOrder);

}
