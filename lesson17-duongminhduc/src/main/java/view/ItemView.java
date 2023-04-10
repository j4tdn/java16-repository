package view;

import java.time.LocalDate;

import service.ItemService;
import service.ItemServiceImpl;

public class ItemView {
	private static ItemService itemService;

	static {
		itemService = new ItemServiceImpl();
	}
	public static void main(String[] args) {
		System.out.println("------1.Get items by deliveryDate----");
		LocalDate deliveryDate = LocalDate.of(2020, 12, 18);
		itemService.getItemsbyDate(deliveryDate).forEach(System.out::println);
		System.out.println("\n\n");

		System.out.println("--------3. Get Top 3 Items---------");
		Integer year = 2020;
		itemService.getTop3Items(year).forEach(System.out::println);
		System.out.println("\n\n");

		System.out.println("--------4. Get Items By IG---------");
		itemService.getItemsByIG().forEach(System.out::println);
	}
}