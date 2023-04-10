package view;

import service.ItemService;
import service.ItemServiceImpl;
import utils.PrintUtils;

public class Ex04Page {
	
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		PrintUtils.generate("id --> ", itemService.getItems());
	}
}
