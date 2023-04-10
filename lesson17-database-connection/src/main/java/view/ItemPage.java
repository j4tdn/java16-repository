package view;

import java.time.LocalDate;
import java.util.List;

import bean.Item;
import service.ItemService;
import service.ItemServiceImpl;

public class ItemPage {
	
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		List<Item> getAllItems = itemService.getAll();
		getAllItems.forEach(System.out::println);
		System.out.println("-------------------------------------------------------------");
		
		List<Item> getItemsById = itemService.getItems();
		getItemsById.forEach(System.out::println);
		System.out.println("-------------------------------------------------------------");
		
		System.out.println("C1G items by order time --> " + itemService.getItems(LocalDate.of(2020, 10, 10)));
		
	}
}
