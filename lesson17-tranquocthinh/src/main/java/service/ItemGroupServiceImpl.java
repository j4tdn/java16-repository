package service;

import java.util.List;

import bean.ItemGroup;
import dao.ItemGroupDao;
import dao.JdbcItemGroupDao;
import dto.ItemGroupDto;

public class ItemGroupServiceImpl implements ItemGroupService{
	private final ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new JdbcItemGroupDao();
	}

	@Override
	public List<ItemGroupDto> countItemsByItemGroup() {
		return itemGroupDao.countItemsByItemGroup();
	}
	
	@Override
	public void save(ItemGroup itemGroup) {
		itemGroupDao.save(itemGroup);
	}
	
}
