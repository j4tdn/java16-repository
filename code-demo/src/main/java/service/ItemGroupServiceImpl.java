package service;

import java.util.List;

import bean.ItemGroup;
import dao.ItemGroupDao;
import dao.JdbcItemGroupDao;

public class ItemGroupServiceImpl implements ItemGroupService {
	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new JdbcItemGroupDao();
	}
	
	public List<ItemGroup> getAll() {
		
		return itemGroupDao.getAll();
	}

	

}
