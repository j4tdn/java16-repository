package service;

import java.time.LocalDate;
import java.time.Year;
import java.util.List;

import bean.Item;
import dto.ItemOrderTimeDto;

public interface ItemService {
	List<ItemOrderTimeDto> getItems(LocalDate sellDate);
	
	List<String> getBestSellingItems(Year year);
	
	List<Item> getHighestPriceItemsByItemGroup();
	
	
}
