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
		PrintUtils.generate("C1E items --> ", itemService.getAll());
		
		System.out.println("================== next ===================");
		
		PrintUtils.generate("C1E2 items by ig id --> ", itemService.getItems());
	}
}
