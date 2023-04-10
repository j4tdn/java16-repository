package dao;

import java.util.List;

import bean.ItemGroup;
import dto.ItemGroupDto;
public interface ItemGroupDao {	
	List<ItemGroupDto> countItemsByItemsGroup();

}
