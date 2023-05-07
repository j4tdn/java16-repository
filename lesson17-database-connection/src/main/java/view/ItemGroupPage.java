package view;

import bean.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class ItemGroupPage {

	private static ItemGroupService itemGroupService;
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}

	public static void main(String[] args) {
		System.out.println("***__--------__***");

		ItemGroup igNew = new ItemGroup(8, "Kính", "Loại hàng - Kính");
		itemGroupService.saveOrUpdate(igNew);
		PrintUtils.generate("C1A igAll", itemGroupService.getAll());
		
		PrintUtils.generate("C1B igById ", itemGroupService.get(4));
		
		PrintUtils.generate("C1D igByName ", itemGroupService.get("sddhdh ' OR ' 1=1"));
		
		System.out.println("============ next =============");
		
		PrintUtils.generate("C1F ig grouping by", itemGroupService.getItemGroups());
		
		System.out.println("============ next =============");
		
		PrintUtils.generate("C1 count items by item group", itemGroupService.countItemsByItemGroup());
		
		
		
	}
}
