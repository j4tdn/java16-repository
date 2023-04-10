package service;

import java.util.List;

import bean.ItemGroup;
import dto.ItemGroupDto;

public interface ItemGroupService {
	List<ItemGroupDto> countItemsByItemGroup();
	
	void save(ItemGroup itemGroup);
}
