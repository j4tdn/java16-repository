package service;

import java.util.List;

import bean.ItemGroup;
import dao.ItemGroupDao;
import dao.JdbcItemGroupDao;

public class ItemGroupSeviceImpl implements ItemGroupService{
	
	private ItemGroupDao itemGroupDao;
	
	public ItemGroupSeviceImpl() {
		itemGroupDao = new JdbcItemGroupDao();
	}
	
	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
}
