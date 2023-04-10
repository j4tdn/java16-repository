package view;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;

import service.ItemService;
import service.ItemServiceImpl;
import utils.PrintUtils;

public class ItemPage {
	private static ItemService  itemService;
	
	static {
		itemService = new ItemServiceImpl();
	}
	
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2023, Month.MARCH, 6);
		PrintUtils.generate("C1 --> ", itemService.getAll(date1));
	}
}
