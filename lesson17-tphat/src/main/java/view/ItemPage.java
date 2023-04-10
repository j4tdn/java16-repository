package view;

import java.time.LocalDate;
import java.time.Month;
import service.ItemService;
import service.ItemServiceImpl;

public class ItemPage {
	
	private static ItemService itemService;
	static {
		itemService = new ItemServiceImpl();
	}
	
	
	
	public static void main(String[] args) {
		LocalDate localDate = LocalDate.of(2019, Month.NOVEMBER, 23);
		PrintUtils.generate("Cau 1: --> ", itemService.getItemByAnyDate(localDate));
		
	}
	
	
	
	
}
