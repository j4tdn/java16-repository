package view;

import bean.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import utils.PrintUtils;

public class ItemGroupPage {
	
	private static ItemGroupService itemGroupService;
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	public static void main(String[] args) {
		System.out.println("***___--------------___***");
		ItemGroup igNew = new ItemGroup(20, "Đồng hồ","Loại hàng - Đồng hồ" );
		itemGroupService.saveOrUpdate(igNew);
		
		PrintUtils.generate("C1A igAll", itemGroupService.getAll());
		
		PrintUtils.generate("C1B igById", itemGroupService.get(2));
		
		PrintUtils.generate("C1D igById", itemGroupService.get("Dép"));
		
		System.out.println("=======================");
		PrintUtils.generate("C1F ig grouping by", itemGroupService.getItemGroups());
		
		System.out.println("=======================");
		PrintUtils.generate("C2 count items by item group", itemGroupService.countItemsByItemGroup());
	}
	
	
}
