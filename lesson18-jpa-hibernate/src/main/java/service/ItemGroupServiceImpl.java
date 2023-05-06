package service;

import java.util.List;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class ItemGroupServiceImpl implements ItemGroupService{
	
	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new HibernateItemGroupDao();
	}
	
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}

	@Override
	public ItemGroup get(int id) {
		return itemGroupDao.get(id);
	}
	
	@Override
	public List<ItemGroupDto> statistic() {
		return itemGroupDao.statistic();
	}
}
