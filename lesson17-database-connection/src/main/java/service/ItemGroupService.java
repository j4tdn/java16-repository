package service;

import java.util.List;

import bean.ItemGroup;
import dto.ItemGroupDto;

public interface ItemGroupService {
	List<ItemGroup> getAll();
	
	List<ItemGroup> getItemGroups();
	
	ItemGroup get(int id);
	
	ItemGroup get(String name);
	
	void update(ItemGroup ig);
	
	void save(ItemGroup ig);
	
	void saveOrUpdate(ItemGroup ig);
	
	List<ItemGroupDto> countItemsByItemGroup();
	


}
