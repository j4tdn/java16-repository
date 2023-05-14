package view;

import java.util.List;

import bean.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import utils.PrintfUtils;

public class ItemGroupPage {
	private static ItemGroupService itemGroupService;
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	public static void main(String[] args) {
		
		ItemGroup ig = new ItemGroup(18, "ab", "Loại hàng - ab");
		itemGroupService.saveOrUpdate(ig);
		List<ItemGroup> igAll = itemGroupService.getAll();
		
		PrintfUtils.generate("C1A", igAll);
		
		
		
	}

}
