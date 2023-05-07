package view;

import java.util.List;

import bean.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import utils.PrintUtils;

public class ItemGroupPage {

	private static ItemGroupService itemGroupService;
	
	static
	{
		itemGroupService = new ItemGroupServiceImpl();
	}
	public static void main(String[] args) {
		System.out.println("******____******");
		PrintUtils.generate("C1A igAll", itemGroupService.getAll());
		PrintUtils.generate("C1B igById",itemGroupService.get(2));
	}
	

}
