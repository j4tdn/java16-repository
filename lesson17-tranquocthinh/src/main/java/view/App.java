package view;

import java.time.LocalDate;
import java.util.List;

import bean.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import service.ItemService;
import service.ItemServiceImpl;

public class App {
	
	private static ItemService itemService;
	private static ItemGroupService itemGroupService;
	
	String path = "data.txt";
	
	static {
		itemService = new ItemServiceImpl();
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("C1 --> " + itemService.getItems(LocalDate.of(2019, 11, 23)));
		System.out.println("----------------------------------------------------------------");
		
		System.out.println("C2 --> " + itemGroupService.countItemsByItemGroup());
		System.out.println("----------------------------------------------------------------");
		
		List<String> threeItemsBestSeelingOfTheYear = itemService.getThreeItemBestSellingOfTheYear(2020);
		System.out.println("C3 --> " + threeItemsBestSeelingOfTheYear);
		
		ItemGroup ig = new ItemGroup(27, "Laptop", "Laptop-22");
		System.out.println("C5 --> " + ig);
		
		

	}

}
