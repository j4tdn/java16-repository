package view;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import utils.PrintUtils;

public class ItemGroupPage {
	private static ItemGroupService itemGroupService = null;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
	
		System.out.println("Ex02 count items by items group");
		PrintUtils.generate("... ", itemGroupService.countItemsByItemsGroup());
	}
}
