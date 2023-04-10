package service;

import java.util.List;

import bean.ItemGroup;
import bean.ItemGroupDto;

public interface ItemGroupService {

	List<ItemGroupDto> getItemGroups();

	void save(List<ItemGroup> itemGroups);
	
}
