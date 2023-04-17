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
		System.out.println("***__------------__***");
		System.out.println("============== next ===============");
		// OK
		PrintUtils.generate("2. count items by itemgroup -->",itemGroupService.countItemsByItemsGroup());
	
		// Tổng Hợp: 3/5 câu ok --> PASSED JDBC
	}
}
