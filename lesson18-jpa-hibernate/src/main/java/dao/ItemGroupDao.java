package dao;

import java.util.List;

import persistence.ItemGroup;
import persistence.ItemGroupDto;

public interface ItemGroupDao {
	List<ItemGroup> getAll();
	
	ItemGroup get(int id);
	
	List<ItemGroupDto> statistic();
	
	void save(ItemGroup itemGroup);
	
	void save(List<ItemGroup> itemGroups);
	
	void saveNewestItemGroup(int nextNItemGroup);
	
	void demoHibernateCatch();
}