package service;

import java.time.LocalDate;
import java.util.List;

import dto.ItemDto;

public interface ItemService {
	List<ItemDto> getItemsByDate(LocalDate orderDate);
	
	List<String> getThreeItemBestSellingOfTheYear(int year);
	
}
