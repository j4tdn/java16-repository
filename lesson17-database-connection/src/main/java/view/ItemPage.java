package view;

import service.ItemService;
import service.ItemServiceImpl;
import utils.PrintfUtils;

public class ItemPage {
	private static ItemService itemService;
	static {
		itemService = new ItemServiceImpl();
	}
	public static void main(String[] args) {
		PrintfUtils.generate("C1E", itemService.getAll());
	}

}
