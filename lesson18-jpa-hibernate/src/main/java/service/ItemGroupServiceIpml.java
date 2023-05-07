package service;

import java.util.List;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.ItemGroup;
import persistence.ItemGroupDto;

public class ItemGroupServiceIpml implements ItemGroupService {

	private ItemGroupDao itemGroupDao;
	public ItemGroupServiceIpml() {
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
		// TODO Auto-generated method stub
		return itemGroupDao.statistic();
	}

}
