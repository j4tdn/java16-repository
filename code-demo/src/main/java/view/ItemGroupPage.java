package view;

import java.util.List;



import bean.ItemGroup;
import service.ItemGroupService;
import service.ItemGroupServiceImpl;

public class ItemGroupPage {
	private static ItemGroupService itemGroupService;
	static {
		itemGroupService = new ItemGroupServiceImpl();
	}
	
public static void main(String[] args) {
	List<ItemGroup> igAll = itemGroupService.getAll();
	
}
}
