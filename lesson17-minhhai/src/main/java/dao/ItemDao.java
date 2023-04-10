package dao;

import java.time.LocalDate;
import java.util.List;

import bean.ItemDto;

public interface ItemDao {
	List<ItemDto> getItemsbyDate(LocalDate deliveryOrder);

}
