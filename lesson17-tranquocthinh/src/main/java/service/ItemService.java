package service;

import java.time.LocalDate;
import java.util.List;

import bean.Item;

public interface ItemService {
	List<Item> getItems(LocalDate sellDate);
	
	List<String> getThreeItemBestSellingOfTheYear(int year);
}
