package dao;

import java.util.List;

import bean.ItemGroup;
import dto.ItemGroupDto;

public interface ItemGroupDao {
	List<ItemGroupDto> countItemsByItemGroup();
	
	 void save(ItemGroup itemGroup);
}
