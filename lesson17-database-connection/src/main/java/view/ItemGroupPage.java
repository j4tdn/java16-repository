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
		
		List<ItemGroup> igAll = itemGroupService.getAll();
		PrintUtils.generate("C1 igAll", igAll);
	}
}
