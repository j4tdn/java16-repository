package view;

import java.util.List;

import bean.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;
import utils.PrintfUtils;

public class ItemGroupPage {
	private static ItemGroupService itemGroupService ;
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	public static void main(String[] args) {
		System.out.println("-------------");
		
		PrintfUtils.generate("c1:",itemGroupService.getAll());
		PrintfUtils.generate("c2:",itemGroupService.get(2));
		PrintfUtils.generate("C1D", itemGroupService.get("Dép"));
		
	}

}
