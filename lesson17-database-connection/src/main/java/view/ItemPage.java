package view;

import service.ItemService;
import service.ItemServiceimpl;
import utils.PrintUtils;

public class ItemPage {
	private static ItemService itemservice;

	static {
		itemservice = new ItemServiceimpl();
	}
	public static void main(String[] args) {
		PrintUtils.generate("C3", itemservice.getAll());

		System.out.println("========== next =============");

		PrintUtils.generate("C4", itemservice.getItems(3));
	}

}