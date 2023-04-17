package view;

import java.time.LocalDate;
import java.time.Year;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;
import utils.PrintUtils;

public class ItemPage {
	private static ItemService  itemService;
	private static ItemGroupService  itemGroupService;
	
	static {
		itemService = new ItemServiceImpl();
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("***__------------__***");
	
		// OK
		PrintUtils.generate("1. items by order time -->",itemService.getItems(LocalDate.of(2019, 11, 23)));
		
		// OK --> vẫn chỗ code review chưa ổn
		PrintUtils.generate("Top 3 seller -->",
				 itemService.getBestSellingItems(Year.parse("2023")));
//		PrintUtils.generate("4. The item with the highest selling price of each item: -->",
//							itemService.getHighestPriceItemsByItemGroup());
	}
}
