package view;

import service.ItemService;
import service.ItemServiceImpl;
import utils.PrintUtils;

public class ItemPage {
	private static ItemService itemService;
	 
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		PrintUtils.generate("all items", itemService.getAll());
		
		PrintUtils.generate("get items by ig id", itemService.getElements(2));
	
	}
}
