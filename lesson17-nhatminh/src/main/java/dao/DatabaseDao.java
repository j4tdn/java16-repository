package dao;

import java.time.LocalDate;
import java.util.List;

import dto.ItemWithSellDateDto;

public interface DatabaseDao {
	List<ItemWithSellDateDto> getItemByOrderTime(LocalDate date);

	List<ItemDto> getItems(LocalDate lDate);

	List<ItemDto> getTopThreeItemByYear(int year);

	List<ItemDtoByIG> getItemsGroupByItemGroup();
}
