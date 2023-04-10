package view;

import java.util.List;

import bean.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupSeviceImpl;
import utils.PrintUtils;

public class ItemGroupPage {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupSeviceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("***___-------------___***");
		ItemGroup igNew = new ItemGroup(6, "Nịt bụng", "Loại Hàng - Nịt Bụng");
		itemGroupService.saveOrUpdate(igNew);
		
		PrintUtils.generate("C1A igAll", itemGroupService.getAll());
		
		PrintUtils.generate("C1B igById", itemGroupService.get(2));
		
		PrintUtils.generate("C1C igByName", itemGroupService.get("Dép"));
		
		System.out.println("============== next ===============");
		PrintUtils.generate("C1F ig grouping by ", itemGroupService.getItemGroups());
	}
}
