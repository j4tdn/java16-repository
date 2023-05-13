package service;

import java.util.List;
import java.util.Objects;

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
	@Override
	public void save(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "item group should not be null");
        itemGroupDao.save(itemGroup);		
	}
	@Override
	public void save(List<ItemGroup> itemGroups) {

		Objects.requireNonNull(itemGroups,"item group(s) should not be null");
		
		if(itemGroups.isEmpty())
		{
			return;
		}
		itemGroupDao.save(itemGroups);
	}
	@Override
	public void saveNewestItemGroups(int nextItemGroups) {

		if(nextItemGroups > 0)
		{
			itemGroupDao.saveNewestItemGroups(nextItemGroups);
		}
		
	}
	@Override
	public void demoHibernateCache() {
		itemGroupDao.demoHibernateCache();
	}

}
