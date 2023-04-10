package service;

import java.util.List;

import bean.ItemGroup;

public interface ItemGroupService {
	List<ItemGroup> getAll();
	
	ItemGroup get(int id);
	
	void save(ItemGroup ig);
	
	void update(ItemGroup ig);
	
	void saveOrUpdate(ItemGroup ig);
}
