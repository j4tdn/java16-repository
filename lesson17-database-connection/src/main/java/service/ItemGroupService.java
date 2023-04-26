package service;

import java.util.List;

import bean.ItemGroup;
import dto.ItemGroupDto;

public interface ItemGroupService {
	List<ItemGroup> getAll();
	
	List<ItemGroup> getItemGroups();
	
	List<ItemGroupDto> countItemsByItemGroup();
	
	ItemGroup get(int id);
	
	ItemGroup get(String name);
	
	void save(ItemGroup ig);
	
	void update(ItemGroup ig);
	
	void saveOrUpdate(ItemGroup ig);
}
