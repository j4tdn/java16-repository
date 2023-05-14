package service;

import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public interface ItemGroupService {
	List<ItemGroup> getAll();
	
	ItemGroup get(int id);
	
	List<ItemGroupDto> statistic();
	
	void save(ItemGroup itemGroup);
	
	void save(List<ItemGroup> itemGroups);
	
	void saveNewestItemGroups(int nextNItemGroups);
	
	void demoHibernateCache();
}
