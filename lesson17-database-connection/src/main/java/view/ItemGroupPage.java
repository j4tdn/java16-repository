package view;

import java.util.List;

import bean.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class ItemGroupPage {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
	public static void main(String[] args) {
		List<ItemGroup> getAllIg = itemGroupService.getAll();
		getAllIg.forEach(System.out::println);
		System.out.println("------------------------------------------------------------------");
		
		ItemGroup igById = itemGroupService.get(2);
		System.out.println(igById);
		System.out.println("------------------------------------------------------------------");
	
		ItemGroup igByName = itemGroupService.get("Dép");
		System.out.println(igByName);
		System.out.println("------------------------------------------------------------------");

//		ItemGroup itemGroup = new ItemGroup(90, "Đèn điện", "Loại hàng - đèn điện");
//		itemGroupService.saveOrUpdate(itemGroup);
		System.out.println("------------------------------------------------------------------");

		System.out.println(itemGroupService.getItemGroups());
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("C1 count items by item group " + itemGroupService.countItemsByItemGroup());
		
	}
}
