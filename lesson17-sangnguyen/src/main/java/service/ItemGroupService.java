package service;

import java.util.List;

import bean.ItemGroup;

public interface ItemGroupService {
	List<ItemGroup> getAll();
	
	List<ItemGroup> getItemGroups();
	
	ItemGroup get(int id);
	
	ItemGroup get(String name);
	
	List<ItemGroup> getItemsInAYear(String year);
	
	List<ItemGroup> getAllItems();

}
