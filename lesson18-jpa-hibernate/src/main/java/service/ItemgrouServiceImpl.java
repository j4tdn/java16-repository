package service;

import java.util.List;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.ItemGroup;

public class ItemgrouServiceImpl implements ItemGroupService {

	private ItemGroupDao itemGroupDao;

	public ItemgrouServiceImpl() {
		itemGroupDao = new HibernateItemGroupDao();
	}

	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
}
