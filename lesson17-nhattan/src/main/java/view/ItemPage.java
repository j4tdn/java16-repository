package view;

import java.time.LocalDate;
import java.time.Year;

import service.ItemService;
import service.ItemServiceImpl;
import utils.PrintUtils;

public class ItemPage {
	private static ItemService itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {	 
		 PrintUtils.generate("Ex01 items by order date", 
				 itemService.getItemsOrderTime(LocalDate.of(2023, 4, 10)));
		 
		 System.out.println("=================================="); 
		 PrintUtils.generate("Ex03: Top 3 best selling items",
				 itemService.getNamesOfTop3Items(Year.parse("2023")));
		 
		 System.out.println("=================================="); 
		 PrintUtils.generate("Ex04: Items max price by ItemGroupId",
				 itemService.getItemsMaxPriceByIgId());
		 
		 
	}
}
