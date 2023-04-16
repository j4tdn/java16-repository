package service;

import java.util.List;
import java.util.stream.Collectors;

import bean.Item;
import bean.ItemGroup;
import dao.ItemDao;
import dao.ItemGroupDao;
import dao.JdbcItemDao;
import dao.JdbcItemGroupDao;

public class ItemGroupServiceImpl implements ItemGroupService{
	private final ItemGroupDao itemGroupDao;
	private final ItemDao itemDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new JdbcItemGroupDao();
		itemDao = new JdbcItemDao();
	}
	
	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}

	@Override
	public ItemGroup get(int igId) {
		return itemGroupDao.get(igId);
	}
	
	@Override
	public ItemGroup get(String name) {
		return itemGroupDao.get(name);
	}
	
	@Override
	public void save(ItemGroup ig) {
		itemGroupDao.save(ig);
	}

	@Override
	public void update(ItemGroup ig) {
		itemGroupDao.update(ig);
	}

	@Override
	public void saveOrUpdate(ItemGroup ig) {
		if ( get(ig.getId() ) == null) {
			itemGroupDao.save(ig);
		} else {
			itemGroupDao.update(ig);
		}
	}

	@Override
	public List<ItemGroup> getItemGroups(int igId) {
		
		return itemDao.getItems(igId)
				.stream()
				.collect(Collectors.groupingBy(Item::getIg))
				.entrySet()
					.stream()
					.map(ItemGroup::new)
					.collect(Collectors.toList());
	}
}
