package view;

import service.ItemGroupService;
import service.ItemGroupSeviceImpl;
import service.ItemServiceImpl;
import utils.PrintUtils;

public class Ex02Page {
	
	private static ItemGroupService itemGroupService;
	
	static {
		itemGroupService = new ItemGroupSeviceImpl();
	}
	
	public static void main(String[] args) {
		PrintUtils.generate("item  --> ", itemGroupService.getAllItems());
	}
}
