package view;

import java.time.LocalDate;

import service.ItemService;
import service.ItemServiceImpl;
import utils.PrintUtils;

public class Ex01Page {
	
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		PrintUtils.generate("get items by order time --> ", itemService.getItems(LocalDate.of(2023, 5, 10)));
	}
}

