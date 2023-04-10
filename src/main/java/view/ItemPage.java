package view;

import service.ItemService;
import service.ItemServiceimpl;
import utils.PrintfUtils;

public class ItemPage {
	private static ItemService itemservice;
	
	static {
		itemservice = new ItemServiceimpl();
	}
	public static void main(String[] args) {
		PrintfUtils.generate("C3", itemservice.getAll());
		
		System.out.println("========== next =============");
		
		PrintfUtils.generate("C4", itemservice.getItems(3));
	}

}
