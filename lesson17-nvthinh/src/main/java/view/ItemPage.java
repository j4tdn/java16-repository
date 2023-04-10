package view;

import java.time.LocalDate;

import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;

public class ItemPage{
	private static ItemService itemService;
	private static ItemGroupService igService;
	
	static {
		itemService = new ItemServiceImpl();
		igService = new ItemGroupServiceImpl();
	}
	public static void main(String[] args) {
		System.out.println("QUESTION 1: ");
		LocalDate date = LocalDate.of(2019, 11, 23);
		System.out.println(itemService.getItems(date));
		System.out.println("==========================================");
		System.out.println("QUESTION 2: ");
		System.out.println(igService.getItemGroups());
		System.out.println("==========================================");
		System.out.println("QUESTION 3: ");//
		Integer year = 2020;
		System.out.println(itemService.getTop3ItemsToSring(year));
		System.out.println("==========================================");
		System.out.println("QUESTION 4: ");
		System.out.println(itemService.getItemsGroupByIG());
	}
}