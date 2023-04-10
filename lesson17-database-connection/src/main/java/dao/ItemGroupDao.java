package dao;

import java.util.List;

import bean.ItemGroup;
import dto.ItemGroupDto;

public interface ItemGroupDao {
	List<ItemGroup> getAll();
		
	ItemGroup get(int id);
	
	ItemGroup get(String name);
	
	void update(ItemGroup ig);
	
	void save(ItemGroup ig);

	List<ItemGroupDto> countItemsByItemGroup();
	
	
}
