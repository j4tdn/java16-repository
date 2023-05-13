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
		System.out.println("***___------------___***");
		ItemGroup igNew = new ItemGroup(6, "Nịt Bụng", "Loại Hàng - Nịt Bụng");
		itemGroupService.saveOrUpdate(igNew);
		
		PrintUtils.generate("C1A igAll", itemGroupService.getAll());
		
		PrintUtils.generate("C1B igById", itemGroupService.get(22));
		
		PrintUtils.generate("C1D igByName", itemGroupService.get("Dép"));
		
		System.out.println("============== next ===============");
		PrintUtils.generate("C1F ig grouping by ", itemGroupService.getItemGroups());
		
		System.out.println("============== next ===============");
		PrintUtils.generate("C1 count items by item group --> ", itemGroupService.CountItemByItemGroup());

	}
}