package service;

import java.time.LocalDate;
import java.util.List;

import bean.Item;
import dto.ItemDto;

public interface ItemService {
	List<Item> getAll();

	List<Item> getItems();
	
	List<Item> getItems(LocalDate sellDate);
	
	List<ItemDto> statisticItemsPerItemGroup();
	
	// C1: Viết lại query select items by SellDate
	// GET 15 elements
	
	// C2: Dùng lại query, hàm của getItems --> dùng JAVA filter theo SellDate
	// GET 100 elements
	// Lưu vào JVM --> JAVA xử lý
}
