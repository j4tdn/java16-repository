package service;

import java.io.ObjectInputStream;
import java.util.List;
import java.util.Objects;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.ItemGroup;

public class ItemGroupServiceImpl implements ItemGroupService  {
	private ItemGroupDao itemGroupDao;
	public ItemGroupServiceImpl() {
		itemGroupDao = new HibernateItemGroupDao();
	}

	public List<ItemGroup> getAll() {
		// TODO Auto-generated method stub
		return itemGroupDao.getAll();
	}

	@Override
	public ItemGroup get(int id) {
		// TODO Auto-generated method stub
		return itemGroupDao.get(id);
	}

	@Override
	public void save(ItemGroup ig) {
		Objects.requireNonNull(ig, "ig should not be null");
		itemGroupDao.save(ig);
		
	}

}
