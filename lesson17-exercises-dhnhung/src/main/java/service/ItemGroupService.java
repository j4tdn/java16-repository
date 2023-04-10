package service;

import java.util.List;

import bean.Item;
import bean.ItemGroup;
import dto.ItemGroupDto;

public interface ItemGroupService {
	List<ItemGroupDto> countItemsByItemsGroup();
}
