package view;

import java.util.List;

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
		System.out.println("************************************");
//		List<ItemGroup> igAll = itemGroupService.getAll();
		
//		itemGroupService.saveOrUpdate(new ItemGroup(11, "Bong tai nu", "earings"));
		
//		PrintUtils.generate("igAll", igAll);
		
//		PrintUtils.generate("IG id = 11", itemGroupService.get(11));

//		PrintUtils.generate("IG name = Dep", itemGroupService.get("Dep"));
		
		PrintUtils.generate("list ig groupby", itemGroupService.getItemGroups(2));
	}
}
