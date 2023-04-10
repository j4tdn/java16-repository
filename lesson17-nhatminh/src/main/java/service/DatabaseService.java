package service;

import java.time.LocalDate;
import java.util.List;

import dto.ItemWithSellDateDto;

public interface DatabaseService {
	List<ItemWithSellDateDto> getItemByOrderTime(LocalDate date);

	List<ItemDto> getItems(LocalDate lDate);

	List<String> getTop3ItemsToSring(int year);

	List<ItemDtoByIG> getItemsGroupByIG();
}
