package dao;

import java.util.List;

import bean.ItemGroup;

public interface ItemGroupDao {
	List<ItemGroup> getAll();
	
	List<ItemGroup> getItemsInAYear(String year);
	
	List<ItemGroup> getAllItems();
	
	ItemGroup get(int id);
	
	ItemGroup get(String name);
	
}
