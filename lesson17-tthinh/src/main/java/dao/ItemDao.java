package dao;

import java.time.LocalDate;
import java.util.List;

import dto.ItemDto;

public interface ItemDao {
	List<ItemDto> getItemsByDate(LocalDate orderDate);
	
	List<String> getThreeItemBestSellingOfTheYear(int year);
	
}
